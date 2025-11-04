package jobsheet9;

import java.util.Scanner;

public class modArrayRataNilai25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int[] nilaiMhs= new int[5];
        double total = 0;
        double rata2, rtRtLulus = 0, rtRtTdkLulus = 0;
        int jmlLulus = 0, jmlTdkLulus = 0;

        for (int i = 0; i < nilaiMhs.length; i++) {
            System.out.print("Masukan nilai mahasiswa  ke-" + (i + 1) + ": ");
            nilaiMhs[i] =sc.nextInt();
        }

        for (int i = 0; i < nilaiMhs.length; i++) {
            total += nilaiMhs[i];
        }
        rata2 = total/nilaiMhs.length;
        System.out.println("Rata-Rata nilai keseluruhan = " + rata2);

        for (int i = 0; i < nilaiMhs.length; i++) {
            if (nilaiMhs[i] > 70) {
                jmlLulus++;
            } else {
                jmlTdkLulus++;
            }
        } 
        System.out.println("banyaknya mahasiswa lulus adalah = " + jmlLulus);

        for (int i = 0; i < nilaiMhs.length; i++) {
            if (nilaiMhs[i] > 70) {
                rtRtLulus += nilaiMhs[i];
           } else {
                rtRtTdkLulus += nilaiMhs[i];
           }
        }
        rtRtLulus /= jmlLulus;
        rtRtTdkLulus /= jmlTdkLulus;
        System.out.println("Rata-Rata nilai lulus = " + rtRtLulus);
        System.out.println("Rata-Rata nilai lulus = " + rtRtTdkLulus);
    }
}
