package jobsheet11;

import java.util.Scanner;

public class tugas2 {
    static int isianArray(int mahasiswa[],int N) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < mahasiswa.length; i++) {
            System.out.print("nilai mahasiswa ke-" + (i + 1) + " :");
            mahasiswa[i] = sc.nextInt();
        }
        return mahasiswa[N-1];
    }
    static void tampilArray(int mahasiswa[]) {
        for (int i = 0; i < mahasiswa.length; i++) {
            System.out.print("Nilai mahasiswa ke-" + (i+1) + " adalah: ");
            System.out.println(mahasiswa[i]);
        }
    }
    static int hitTot(int mahasiswa[], int N) {
        int total = 0;
        for (int i = 0; i < mahasiswa.length; i++) {
            total += mahasiswa[i];
        }
        return total;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    
        System.out.print("Masukan jumlah Mahasiswa: ");
        int N = sc.nextInt();
        int [] mahasiswa = new int[N];
        isianArray(mahasiswa, N);
        tampilArray(mahasiswa);
        int total = hitTot(mahasiswa, N);
        System.out.println("total nilai seluruh mahasiswa adalah: " + total);
    }
}
