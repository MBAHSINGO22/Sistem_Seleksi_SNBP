package Projek_SDL_UTS;

import java.util.ArrayList;
import java.util.Scanner;

// Kelas Menu merupakan kelas utama yang menyediakan menu dan berbagai metode untuk interaksi dengan pengguna.
public class Menu {
    // Atribut Scanner untuk menerima input dari pengguna.
    public Scanner Input = new Scanner(System.in);

    // Metode untuk menampilkan menu utama dan menerima pilihan pengguna.
    int mainMenu() {
        // Menampilkan judul menu.
        System.out.println("\n     === Cek Peserta SNBP ===");
        // Menampilkan opsi-opsi menu.
        System.out.println("1. Tampilkan Daftar Peserta SNBP");
        System.out.println("2. Cari Peserta SNBP (Sequential)");
        System.out.println("3. Cari Peserta SNBP (Binary)");
        System.out.println("4. Exit Program");
        // Meminta input dari pengguna.
        System.out.print("\nPilihan = ");
        // Membaca pilihan pengguna dan mengembalikannya.
        int pilihMenu = Input.nextInt();
        return pilihMenu;
    }

    // Metode untuk menampilkan daftar peserta.
    void tabel(ArrayList<Peserta> peserta) {
        // Menampilkan judul tabel.
        System.out.println("\nDaftar Peserta SNBP ");
        // Menampilkan header kolom.
        System.out.printf("%-20s%s\n", "No. Peserta", "Nama");
        System.out.println("----------------------------------------");
        // Menampilkan setiap baris data peserta.
        for (int i = 0; i < peserta.size(); i++) {
            // Menampilkan nomor pendaftaran dan nama peserta.
            System.out.printf("%-20s%-10s\n", peserta.get(i).getNoPendaftaran(), peserta.get(i).getNama());
        }
    }

    // Metode untuk mengecek jalur peserta dan menampilkan detailnya.
    void cekJalur(Peserta peserta) {
        // Memeriksa jalur peserta.
        if (peserta.getPrestasiAkademik()) {
            // Jika jalur akademik, panggil metode untuk menampilkan detail akademik.
            tampilAkademik(peserta, "Prestasi Akademik");
        } else {
            // Jika jalur non-akademik, panggil metode untuk menampilkan detail non-akademik.
            tampilNonAkademik(peserta, "Prestasi Non Akademik");
        }
    }

    // Metode untuk menampilkan detail peserta jalur akademik.
    void tampilAkademik(Peserta peserta, String jalur) {
        String status, pesan;
        // Mengecek apakah peserta lolos atau tidak.
        if (cekLulus(peserta.hitungRata())) {
            status = "Lolos";
            pesan = "Selamat Anda Lolos!! Jangan lupa di up story";
        } else {
            status = "Tidak Lolos";
            pesan = "Sudah, daftar Sadhar aja!!";
        }
        // Menampilkan detail peserta akademik.
        System.out.println("\n----------------------------------------------");
        System.out.println("Data Mahasiswa");
        System.out.printf("%-20s: %s\n", "No. Peserta", peserta.getNoPendaftaran());
        System.out.printf("%-20s: %s\n", "Nama", peserta.getNama());
        System.out.printf("%-20s: %s\n", "Jalur", jalur);
        System.out.println("Nilai");
        System.out.printf("%-20s: %.1f\n", "Bahasa Indonesia", peserta.getNilaiBahasaIndonesia());
        System.out.printf("%-20s: %.1f\n", "Matematika", peserta.getNilaiMatematika());
        System.out.printf("%-20s: %.1f\n", "IPA", peserta.getNilaiIpa());
        System.out.printf("%-20s: %.1f\n", "Bahasa Inggris", peserta.getNilaiBahasaInggris());
        System.out.printf("%-20s: %.1f\n", "Rata-rata", peserta.hitungRata());
        System.out.printf("%-20s: %s\n", "Status", status);
        System.out.printf("%s\n", pesan);

        System.out.println("----------------------------------------------");
    }

    // Metode untuk menampilkan detail peserta jalur non-akademik.
    private void tampilNonAkademik(Peserta peserta, String jalur) {
        String status, pesan;
        // Mengecek apakah peserta lolos atau tidak.
        if (cekLulus(konversiSertif(peserta))) {
            status = "Lolos";
            pesan = "Selamat Anda Lolos!! Jangan lupa di up story";
        } else {
            status = "Tidak Lolos";
            pesan = "Sudah, daftar Sadhar aja!!";
        }
        // Menampilkan detail peserta non-akademik.
        System.out.println("----------------------------------------------");
        System.out.println("Data Mahasiswa");
        System.out.printf("%-20s: %s\n", "No. Peserta:", peserta.getNoPendaftaran());
        System.out.printf("%-20s: %s\n", "Nama:", peserta.getNama());
        System.out.printf("%-20s: %s\n", "Jalur:", jalur);
        int i = 1;
        for (Sertifikat sertif : peserta.getSertifikat()) {
            System.out.println("Prestasi " + (i));
            System.out.printf("%-20s: %s\n", "Prestasi:", sertif.getPrestasi());
            System.out.printf("%-20s: %s\n", "Tingkat Prestasi:", sertif.getTingkat());
            System.out.printf("%-20s: %s\n", "Ranking:", sertif.getJuara());
            i++;
        }
        System.out.printf("%-20s: %s\n", "Status:", status);
        System.out.printf("%s\n", pesan);
        System.out.println("----------------------------------------------");
    }

    // Metode untuk pencarian biner pada ArrayList berdasarkan nomor pendaftaran.
    int binarySearch(ArrayList<Peserta> array, String key) {
        int start = 0;
        int end = array.size() - 1;
        while (start <= end) {
            int mid = (start + end) / 2;
            // Mencari nilai tengah dan membandingkannya dengan kunci pencarian.
            if (array.get(mid).getNoPendaftaran().equals(key)) {
                return mid;
            } else if (Integer.parseInt(array.get(mid).getNoPendaftaran()) <= Integer.parseInt(key)) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        // Mengembalikan -1 jika tidak ditemukan.
        return -1;
    }

    // Metode untuk pencarian sekuensial pada ArrayList berdasarkan nomor pendaftaran.
    int SequentialSearch(ArrayList<Peserta> array, String key) {
        // Iterasi melalui setiap elemen ArrayList untuk mencari kunci pencarian.
        for (int i = 0; i < array.size(); i++) {
            if (array.get(i).getNoPendaftaran().equals(key)) {
                return i;
            }
        }
        // Mengembalikan -1 jika tidak ditemukan.
        return -1;
    }

    // Metode untuk mengkonversi nilai sertifikat peserta menjadi nilai bobot.
    public double konversiSertif(Peserta peserta) {
        double bobot = 0;
        // Iterasi melalui setiap sertifikat peserta.
        for (Sertifikat sertif : peserta.getSertifikat()) {
            // Menghitung bobot berdasarkan tingkat dan juara sertifikat.
            if (sertif.getTingkat().equals("Internasional")) {
                if (sertif.getJuara() == 1) {
                    bobot += 50;
                } else if (sertif.getJuara() == 2) {
                    bobot += 45;
                } else {
                    bobot += 40;
                }
            } else if (sertif.getTingkat().equals("Nasional")) {
                if (sertif.getJuara() == 1) {
                    bobot += 35;
                } else if (sertif.getJuara() == 2) {
                    bobot += 30;
                } else {
                    bobot += 25;
                }
            } else if (sertif.getTingkat().equals("Provinsi")) {
                if (sertif.getJuara() == 1) {
                    bobot += 20;
                } else if (sertif.getJuara() == 2) {
                    bobot += 15;
                } else {
                    bobot += 10;
                }
            } else {
                bobot += 5;
            }
        }
        return bobot;
    }

    // Metode untuk mengecek apakah peserta lulus berdasarkan nilai akhir.
    Boolean cekLulus(double nilaiFinal) {
        double standarLulus = 85;
        // Membandingkan nilai akhir dengan standar kelulusan.
        if (nilaiFinal >= standarLulus) {
            return true;
        } else if (nilaiFinal < standarLulus) {
            return false;
        }
        // Mengembalikan null jika tidak ada kondisi yang memenuhi.
        return null;
    }
}
