package jobsheet8;

import java.util.Scanner;

public class Tugas3KopiSenja {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int totItem = 0, totPelanggan = 0, totTotItem = 0;

        System.out.println("Selamat datang di sistem cafe.");
        System.out.print("masukan jumlah cabang kafe: ");
        int i = sc.nextInt();
        System.out.println("");

        System.out.println("==== Input Penjualan Per Cabang ====\n");

        for (int j = 1; j <= i; j++) {
            System.out.println("--- Cabang " + j + " ---");
            System.out.print("Jumlah pelanggan: ");
            int jmlPelanggan = sc.nextInt();
            totPelanggan += jmlPelanggan;

            for (int k = 1; k <= jmlPelanggan; k++) {
                System.out.print("-=- Pelanggan " + k + " memesan berapa item? ");
                int item = sc.nextInt();
                totItem += item;
            }
            System.out.println("Cabang " + j + ":");
            System.out.println("-- Pelanggan: " + jmlPelanggan + " orang");
            System.out.println("-- Item terjual: " + totItem);
            totTotItem += totItem;
            totItem = 0;
            System.out.println("");

        }
        System.out.println("Total seluruh Cabang:");
        System.out.println("Pelanggan: " + totPelanggan + "orang");
        System.out.println("Item terjual: " + totTotItem + "item");

    }
}
