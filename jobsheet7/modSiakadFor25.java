package jobsheet7;

import java.util.Scanner;

public class modSiakadFor25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double nilai, tertinggi = 0, terendah = 100;
        int lulus = 0, tdkLulus = 0;

        for (int i = 1; i<= 10; i++) {
            System.out.print("masukan nilai mahasiswa ke-" + i + ": ");
            nilai = sc.nextDouble();
            if (nilai > tertinggi) {
                tertinggi = nilai;
            }
            if (nilai < terendah) {
                terendah = nilai;
            }

            if (nilai >=60) {
                lulus++;
            } else {
                tdkLulus++;
            }
        }
        System.out.println("Nilai tertinggi: " + tertinggi);
        System.out.println("Nilai terendah: " + terendah);
        System.out.println("Jumlah siswa Lulus: " + lulus);
        System.out.println("jumlah siswa Tidak Lulus: " + tdkLulus);
    }
}