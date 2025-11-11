package jobsheet10;

import java.util.Scanner;

public class bioskopWithScanner25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nama, next;
        int baris, kolom;

        String[][] penonton = new String[4][2];

        while (true) {
            System.out.print("Masukan Nama: ");
            nama = sc.nextLine();
            System.out.print("Masukan Baris: ");
            baris = sc.nextInt();
            System.out.print("Masukan Kolom: ");
            kolom = sc.nextInt();

            penonton[baris-1][kolom-1] = nama;
            
            System.out.print("Input penonton lainnya? (y/n): ");
            sc.nextLine();
            next = sc.nextLine();

            if (next.equalsIgnoreCase("n")) {
                break;

            }
        }
    }
}
