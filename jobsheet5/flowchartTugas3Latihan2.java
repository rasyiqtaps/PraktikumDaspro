package jobsheet5;

import java.util.Scanner;

public class flowchartTugas3Latihan2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Apakah kamu Dosen? (true/false): ");
        boolean dosen= sc.nextBoolean();

        if (dosen) {
            System.out.println("Akses Anda diberikann sebagai Dosen.");

        } else {
            System.out.print("Apakah kamu Mahasiswa? (true/false): ");
            boolean mahasiswa = sc.nextBoolean();

            if (mahasiswa) {
                System.out.print("Masukan jumlah SKS yang kamu ambil: ");
                int SKS = sc.nextInt();

                if (SKS >= 12) {
                    System.out.println("Akses Anda diberikan sebagai Mahasiswa.");
                } else {
                    System.out.println("Akses anda ditolak karena SKS kurang dari 12!");
                }
            }
            else {
                System.out.println("Akses Anda ditolak!");
            }
        }
    }
}