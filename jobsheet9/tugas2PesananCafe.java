package jobsheet9;

import java.util.Scanner;

public class tugas2PesananCafe {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("SELAMAT DATANG DI CAFE!");
        System.out.print("masukan jumlah pesanan yang ingin kamu beli: ");
        int pesanan = sc.nextInt();
        sc.nextLine();

        System.out.println("");

        String []arrPesanan = new String[pesanan];
        int []arrHarga = new int[pesanan];

        for (int i = 0; i < arrPesanan.length; i++) {
            System.out.print("Masukan pesannan ke-" + (i+1) + ": ");
            arrPesanan[i] = sc.nextLine();

            System.out.print("Berapa harga " + arrPesanan[i] + "? ");
            arrHarga[i] = sc.nextInt();
            sc.nextLine();
            System.out.println("");
        }
        System.out.println("");

//Proses"""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""
int totHarga = 0;
        for (int i = 0; i < arrHarga.length; i++) {
            totHarga += arrHarga[i];
        }

//outputer
        System.out.println("==== BILLING ====\n");
        for (int i = 0; i < arrPesanan.length; i++) {
            System.out.println("Pesanan " + arrPesanan[i] + " dengan harga = " + arrHarga[i]);
        }

        System.out.println("total biaya \t\t= " + totHarga);
        System.out.println("MOHON BAYAR DI KASIR YA");
    }
}
