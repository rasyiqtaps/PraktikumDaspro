package jobsheet11;

import java.util.Scanner;

public class tugas1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("masukan panjang sisi kubus: ");
        int p = sc.nextInt();
        kubus25(p);
    }
    public static void kubus25(int p) {
        int volKubus = p * p * p;
        System.out.println("total volume kubus adalah: " + volKubus);
        int luasKubus = 6 * (p*p);
        System.out.println("total luas permukaan kubus adalah: " + luasKubus);

    }
}
