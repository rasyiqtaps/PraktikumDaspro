package jobsheet8;

import java.util.Scanner;

public class square25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukan Nilai N = ");
        int N = sc.nextInt();

        for (int iOuter1 = 1; iOuter1 <= N; iOuter1++) {
            for (int i = 1; i <= N; i++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
//sepertinya percobaan 2 tidak ada yang perlu dimodifikasi di jobsheet.