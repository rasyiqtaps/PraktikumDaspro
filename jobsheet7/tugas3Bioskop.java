package jobsheet7;

import java.util.Scanner;

public class tugas3Bioskop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int hargaTiket = 50000;
        double disk4 = 0.1, disk10 = 0.15 , totHrgDisk;

        do {
            System.out.print("Selamat datang! tiket dijual dengan harga 50k. masukan jumlah tiket yang kamu ingin beli: ");
        int i = sc.nextInt();
        sc.nextLine(); // bug

        double totHarga = i * hargaTiket; 
            if (i < 0) {
                System.out.println("error. angka tidak valid.");
                continue;
         }
            if (i > 4 && i <= 10) {
                totHrgDisk = totHarga - totHarga * disk4;
                System.out.println("kamu dapat diskon 10% karena membeli lebih dari 4 tiket! \n total biaya mu adalah: " + totHrgDisk);
            } else if (i > 10) {
                totHrgDisk = totHarga - totHarga * disk10;
                System.out.println("kamu dapat diskon 15% karena membeli lebih dari 10 tiket! \n total biaya mu adalah: " + totHrgDisk);
            } else {
                System.out.println("total biaya mu adalah: " + totHarga);
            }

         System.out.print("apakah kamu ingin melakukan pembelian lagi? (ya/tidak)");
         String konf = sc.nextLine();

         if (konf.equalsIgnoreCase("tidak")) {
            break;
         }

           } while (true);
        System.out.println("Terima kasih! Program selesai.");
    }
}
