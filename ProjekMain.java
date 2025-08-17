package Projek_SDL_UTS;

import java.util.ArrayList;
import java.util.Scanner;

public class ProjekMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Menu menu = new Menu();
        ArrayList<Peserta> peserta = new ArrayList();
        ReadData akademik = new ReadData(peserta,
                "C:\\Users\\MSI Prestige\\VSProject\\Java Project\\src\\Projek_SDL\\DataCalonMhs\\DataPrestasiAkademik.txt");
        ReadData nonAkademik = new ReadData(peserta,
                "C:\\Users\\MSI Prestige\\VSProject\\Java Project\\src\\Projek_SDL\\DataCalonMhs\\DataPrestasiNonAkademik.txt");
        ReadData ascii = new ReadData(peserta, "C:\\Users\\MSI Prestige\\VSProject\\Java Project\\src\\Projek_SDL\\ascii.txt");

        while (true) {
            int pilihan = menu.mainMenu();

            if (pilihan == 1) {
                menu.tabel(peserta);
            } else if (pilihan == 2) {
                System.out.print("Cari No. Peserta = ");
                String key = scanner.next();
                int idx = menu.SequentialSearch(peserta,key);
                if (idx != -1) {
                    menu.cekJalur(peserta.get(idx));
                } else {
                    System.out.println("Nomer peserta "+key+" tidak ditemukan");
                }
            } else if (pilihan == 3) {
                System.out.print("Cari No. Peserta = ");
                String key = scanner.next();
                int idx = menu.binarySearch(peserta,key);
                if (idx != -1) {
                    menu.cekJalur(peserta.get(idx));
                } else {
                    System.out.println("Nomer peserta "+key+" tidak ditemukan");
                }
            } else if (pilihan == 4) {
                break;
            } else {
                System.out.println("Input invalid!!");
            }
        }

        System.out.println("== Program Ended ==");
        System.out.println(ascii.dump);

    }
}
