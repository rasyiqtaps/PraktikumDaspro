package jobsheet9;

import java.util.Scanner;

public class tugas3PesananDenganMenuCafe {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("SELAMAT DATANG DI CAFE!");
        System.out.println("");

//declaration

        String[] arrPesanan = {"Nasi Goreng", "Mie Goreng", "Roti Bakar", "Kentang Goreng", "Teh Tarik", "Cappucino", "Chocolate Ice"};
        String key = null;

        System.out.println("Berikut menu yang kita sediakan");

        for (int i = 0; i < arrPesanan.length; i++) {
            System.out.println(arrPesanan[i]);
        }

            System.out.print("Masukan pesannan yang ingin kamu cari :");
            key = sc.nextLine();
            
        System.out.println("");

//Proses"""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""

        boolean ditemukan = false;
            for (int j = 0; j < arrPesanan.length; j++) {
                if (key.equalsIgnoreCase(arrPesanan[j])) {
                    ditemukan = true;
                    break;
                }
            }

//outputer
        System.out.println("==== HASIL ====\n");

            if (ditemukan) {
                System.out.println("Pesananmu (" + key + ") Akan segera kami siapkan");
            } else {
                System.out.println("Pesananmu tidak tersedia mohon untuk memilih ulang");
            }
    
        System.out.println("MOHON BAYAR DI KASIR YA");
    }
}
