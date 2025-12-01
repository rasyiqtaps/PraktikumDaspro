package jobsheet11;

import java.util.Scanner;

public class rekapPenjualanCafe25 {

    static int[][] inputDataPenjualan1() {
        Scanner sc = new Scanner(System.in);

        System.out.print("masukan jumlah hari yang ingin kamu akumulasikan: ");
        int hari = sc.nextInt();
        System.out.print("masukan berapa menu yang ingin kamu jual: ");
        int menu = sc.nextInt();
        System.out.println("");

        int mariana[][] = new int[menu][hari];
        sc.nextLine();

        return mariana;
    }

    static String[] inputDataPenjualan2(int [][] mariana) {
        Scanner sc = new Scanner(System.in);

        String arrMenu[] = new String[mariana.length];
        for (int i = 0; i < arrMenu.length; i++) {
            System.out.print("masukan nama menu ke-" + (i+1) + " anda: ");
            arrMenu[i] = sc.nextLine();
        }
        System.out.println("");

        return arrMenu;
    }

    static int[][] inputDataPenjualan3(int [][] mariana, String[] arrMenu) {
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < mariana.length; i++) {
            for (int j = 0; j < mariana[i].length; j++) {
                System.out.print("masukan penjualan " + arrMenu[i] + " pada hari ke-" + (j+1) + ": ");
                mariana[i][j] = sc.nextInt();
            }
            System.out.println("");
        }
        return mariana;
    }

    static void outputDataPenjualan(int [][] mariana, String[] menu) {

        System.out.printf("%-20s", "Menu");
        for (int h = 0; h < mariana[0].length; h++) {
            System.out.printf("%-10s", "Hari " + (h + 1));
        }

        System.out.println();
        System.out.println("----------------------------------------------------------------------------------------------------------------------------------");

        for (int i = 0; i < mariana.length; i++) {
            System.out.printf("%-20s", menu[i]);
            for (int j = 0; j < mariana[i].length; j++) {
                System.out.printf("%-10d", mariana[i][j]);
            }
            System.out.println();
        }

        System.out.println("----------------------------------------------------------------------------------------------------------------------------------");
    }

    static void menuHighSales(int [][] mariana, String[] menu) {
        int viral = 0;
        int idxMenu = 0;

        for (int i = 0; i < mariana.length; i++) {
            for (int j = 0; j < mariana[i].length; j++) {
                if (mariana[i][j] > viral) {
                    viral = mariana[i][j];
                    idxMenu = i;
                }
            }
        }

        System.out.println("jumlah pesanan terbanyak diperoleh dari menu '" + menu[idxMenu] + "' dengan jumlah: " + viral);
    }

    static void rataRataPenjualan(int [][] mariana, String[] menu) {
        for (int i = 0; i < mariana.length; i++) {
            int total = 0;

            for (int j = 0; j < mariana[i].length; j++) {
                total += mariana[i][j];
            }

            double rata = total / mariana[i].length;
            System.out.println("rata rata penjualan menu '" + menu[i] + "' adalah: " + rata);
        }
    }

    public static void main(String[] args) {

        int[][] mariana = inputDataPenjualan1();
        System.out.println("");

        String[] arrMenu = inputDataPenjualan2(mariana);
        System.out.println("");

        inputDataPenjualan3(mariana, arrMenu);
        System.out.println("");

        outputDataPenjualan(mariana, arrMenu);
        System.out.println("");

        menuHighSales(mariana, arrMenu);
        System.out.println("");

        rataRataPenjualan(mariana, arrMenu);
    }
}
