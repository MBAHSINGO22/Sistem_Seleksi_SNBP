package Projek_SDL_UTS;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.util.ArrayList;

public class ReadData {
    String dump;
    ReadData(ArrayList<Peserta> peserta, String filePath) {
        String[] data = new String[2];
        String[] data2 = new String[5];
        int lastElement = 0;
        int lastSertif = 0;
        try {
            File myFile = new File(filePath);
            Scanner myReader = new Scanner(myFile);
            while (myReader.hasNextLine()) {
                data = myReader.nextLine().split(": ");
                if (data[0].equalsIgnoreCase("Nama")) {
                    Peserta calonMahasiswa = new Peserta();
                    peserta.add(calonMahasiswa);
                    if (peserta.size() != 0) {
                        lastElement = peserta.size() - 1;
                    }
                    peserta.get(lastElement).setNama(data[1]);
                } else if (data[0].equalsIgnoreCase("No pendaftaran")) {
                    peserta.get(lastElement).setNoPendaftaran(data[1]);
                } else if (data[0].equalsIgnoreCase("Jalur")) {
                    if (data[1].equalsIgnoreCase("Prestasi Akademik")) {
                        peserta.get(lastElement).setPrestasiAkademik(true);
                    } else {
                        peserta.get(lastElement).setPrestasiAkademik(false);
                    }
                } else if (data[0].equalsIgnoreCase("Nilai ipa")) {
                    peserta.get(lastElement).setNilaiIpa(Double.parseDouble(data[1]));
                } else if (data[0].equalsIgnoreCase("Nilai matematika")) {
                    peserta.get(lastElement).setNilaiMatematika(Double.parseDouble(data[1]));
                } else if (data[0].equalsIgnoreCase("Nilai bahasa indonesia")) {
                    peserta.get(lastElement).setNilaiBahasaIndonesia(Double.parseDouble(data[1]));
                } else if (data[0].equalsIgnoreCase("Nilai bahasa inggris")) {
                    peserta.get(lastElement).setNilaiBahasaInggris(Double.parseDouble(data[1]));
                } else if (data[0].equalsIgnoreCase("Prestasi")) {
                    data2 = data[1].split(", ");
                    for (String i : data2) {
                        Sertifikat sertif = new Sertifikat(i);
                        peserta.get(lastElement).addSertifikat(sertif);
                    }
                    lastSertif = peserta.get(lastElement).getSertifikat().size() - 1;
                } else if (data[0].equalsIgnoreCase("Tingkat Prestasi")) {
                    data2 = data[1].split(", ");
                    for (int i = 0; i < data2.length; i++) {
                        peserta.get(lastElement).getSertifikat().get(lastSertif - (lastSertif-i)).setTingkat(data2[i]);
                    }
                } else if (data[0].equalsIgnoreCase("Ranking")) {
                    data2 = data[1].split(", ");
                    for (int i = 0; i < data2.length; i++) {
                        peserta.get(lastElement).getSertifikat().get(lastSertif - (lastSertif-i)).setJuara(Integer.parseInt(data2[i]));
                    }
                } else {
                    dump += data[0]+"\n";
                }
            }
        } catch (IOException e) {
            System.out.println("An error occured");
        }
    }
}