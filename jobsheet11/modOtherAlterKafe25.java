package jobsheet11;

import java.util.Scanner;

public class modOtherAlterKafe25 {

    public static double hitungTotalHarga25(int pilihanMenu, int banyakItem, String kodePromo){
        int[] hargaItems = {15000, 20000, 22000, 12000, 10000, 18000};

        double diskon = 0;
        if (kodePromo.equals("DISKON50")) {
            diskon = 0.5;
        } else if (kodePromo.equals("DISKON30")) {
            diskon = 0.3;
        }

        int hargaTotalKotor = hargaItems[pilihanMenu - 1] * banyakItem;
        double hargaSetelahDiskon = hargaTotalKotor - (hargaTotalKotor * diskon);

        return hargaSetelahDiskon;
    }

    public static void menu(String namaPelanggan, boolean isMember, String kodePromo) {
        System.out.println("Selamat datang, " + namaPelanggan + "!");

        if (isMember) {
            System.out.println("Anda adalah member, dapatkan diskon 10% untuk setiap pembelian");
        }

        if (kodePromo.equals("DISKON50")) {
            System.out.println("Anda diberikan diskon 50% karena sudah menggunakan kode");
        } else if (kodePromo.equals("DISKON30")) {
            System.out.println("Anda diberikan diskon 30% karena sudah menggunakan kode");
        } else {
            System.out.println("Kode promo tidak valid.");
        }

        System.out.println("==== MENU RESTO KAFE ====");
        System.out.println("1. Kopi Hitam - Rp. 15,000");
        System.out.println("2. Cappuccino - Rp 20,000");
        System.out.println("3. Latte - Rp 22,000");
        System.out.println("4. Teh Tarik - Rp 12,000");
        System.out.println("5. Roti Bakar - Rp 10,000");
        System.out.println("6. Mie Goreng - Rp 18,000");
        System.out.println("=============================");
        System.out.println("Silahkan pilih menu yang anda inginkan.");
    }

    public static void main(String[] args) {
        menu("andi", true, "DISKON30");
        Scanner sc = new Scanner(System.in);

        int pilihanMenu = 0;
        int banyakItem = 0;
        boolean lanjut;

        do {
            System.out.print("\nMasukan nomor menu yang ingin anda pesan: ");
            pilihanMenu = sc.nextInt();

            System.out.print("Masukan jumlah item yang ingin dipesan: ");
            banyakItem = sc.nextInt();

            System.out.print("Apakah anda ingin menambah pesanan? (ya/tidak): ");
            String jawab = sc.next();
            lanjut = !jawab.equalsIgnoreCase("tidak");

        } while (lanjut);

        double hargaSetelahDiskon = hitungTotalHarga25(pilihanMenu, banyakItem, "DISKON30");

        System.out.println("\nTotal harga untuk pesanan Anda: Rp. " + hargaSetelahDiskon);
    }
}
