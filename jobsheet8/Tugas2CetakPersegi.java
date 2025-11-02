package jobsheet8;

import java.util.Scanner;

public class Tugas2CetakPersegi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukan sisi N: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.print(n + " ");
            for (int j = 2; j < n; j++) {
                
                if (i == n) {
                    System.out.print(n + " ");
                } else if (i == 1) {
                    System.out.print(n + " ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println(n + " ");
        }
    }
}
