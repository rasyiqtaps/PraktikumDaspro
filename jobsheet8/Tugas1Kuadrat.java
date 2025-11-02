package jobsheet8;

import java.util.Scanner;

public class Tugas1Kuadrat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("masukan jumlah n: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            int kuadrat = 0;
            System.out.print("n = " + i + " -> jumlah kuadrat = ");

            for (int j = 1; j <= i; j++) {
                int kuadratat = (j * j);
                
                kuadrat += kuadratat;
                System.out.print(kuadratat);

                if (j < i) {
                    System.out.print(" + ");
                } else {
                    System.out.print("");
                }
            }
            if (i > 1) {
                System.out.println(" = " + kuadrat);
            } else {
                System.out.println("");
            }
        }
    }
}