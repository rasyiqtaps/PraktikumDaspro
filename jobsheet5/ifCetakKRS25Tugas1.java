package jobsheet5;

import java.util.Scanner;

public class ifCetakKRS25Tugas1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("---Cetak KRS SIAKAD---");
        System.out.print("Apakah UKT sudah lunas? (true/false): ");
        boolean uktlunas = sc.nextBoolean();

        String hasil = (uktlunas)
                ? "Pembayaran UKT terverifikasi. Silahkan cetak KRS dan minta tanda tangan DPA"
                : "registrasi ditolak. Silahkan lunasi UKT terlebih dahulu";

        System.out.println("[Ternary]" + hasil);
    }
}
