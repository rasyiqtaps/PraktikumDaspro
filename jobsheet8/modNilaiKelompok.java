package jobsheet8;

import java.util.Scanner;

public class modNilaiKelompok {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int i, j, nilai, hebat = 0;
        double rataNilai, totalNilai, tertinggi = 0;

        i = 1;
        while (i <= 6) {
            System.out.println("Kelompok " + i);

            totalNilai = 0;
            rataNilai = 0;
            for (j = 1; j <= 5; j++) {
                System.out.print("\tNilai dari kelompok Penilai " + j + ": ");
                nilai = sc.nextInt();

                totalNilai += nilai;
            }

            rataNilai = totalNilai / 5;
            System.out.println("Kelompok " + i +": nilai rata-rata =" + rataNilai);

            if (rataNilai > tertinggi){
                tertinggi = rataNilai;
                hebat = i;
            }

            i++;
        }
        System.out.println("nilai tertinggi diraih oleh kelompok: " + tertinggi + " oleh kelompok " + hebat);
    }
}
