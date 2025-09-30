package jobsheet5;

import java.util.Scanner;

public class flowchartTugas3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Apakah kamu membawa KTM? (true/false): ");
        boolean KTM = sc.nextBoolean();

        if (KTM) {
            System.out.println("Anda diizinkan masuk");

        } else {
        System.out.print("Apakah kamu atau sudah melakukan registrasi online? (true/false): ");
        boolean regOnl = sc.nextBoolean();

        if (regOnl) {
            System.out.println("Anda diizinkan masuk");

         } else { System.out.println("Anda dilarang masuk");
    }
}
    }
}