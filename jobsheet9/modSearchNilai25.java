package jobsheet9;

import java.util.Scanner;

public class modSearchNilai25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         System.out.print("Masukan Banyaknya nilai yang akan diinput: ");
         int nilai = sc.nextInt();


        int[] arrNilai = new int[nilai];
        int hasil = 0;

        for (int i = 0; i < arrNilai.length; i++) {
            System.out.print("Masukan nilai Mahasiswa ke-" + (i+1) + ": ");
            arrNilai[i] = sc.nextInt();
        }

        System.out.print("Masukan nilai yang ingin dicari: ");
        int key = sc.nextInt();

        for (int i = 0; i < arrNilai.length; i++) {
            if (key == arrNilai[i]) {
                hasil = i;
            }
        }
        
        System.out.println();
        if (key == arrNilai[hasil]) {
            System.out.println("Nilai " + key + " ketemu di indeks ke-" + hasil);
        } else {
            System.out.println("Nilai yang dicari tidak ditemukan.");
        }
        System.out.println();
    }
}
