package jobsheet10;

import java.util.Scanner;

public class modBioskopWithScanner25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nama;
        int baris, kolom, menu = 0;

        String[][] penonton = new String[4][2];

        System.out.println("===Selamat Datang===");

        //Menu 1:  Input data penonton
        while (true) {
            System.out.println(" ");
            System.out.print("masukan nomor yang ingin kemu tuju (1,2,3) \n menu 1: Input data penonton \n menu 2: Tampilkan daftar penonton \n menu 3: Exit \n :");
            menu = sc.nextInt();

            switch (menu) {
                case (1):
                System.out.print("Masukan Nama: ");
                sc.nextLine();
                nama = sc.nextLine();
                System.out.print("Masukan Baris: ");
                baris = sc.nextInt();
                System.out.print("Masukan Kolom: ");
                kolom = sc.nextInt();

                    if (penonton[baris - 1][kolom - 1] != null ) {
                        System.out.println("Maaf. Kursi sudah diisi, mohon cek di menu 2 dan coba lagi");
                        break;
                    } 

                    if (baris > 4 || kolom > 2) {
                        System.out.println("Kursi tidak tersedia, mohon isi kembali");
                    } else {
                        penonton[baris-1][kolom-1] = nama;
                    }

                System.out.println(" ");
                    break;

                case (2):
                System.out.println(" ");
                for (int i = 0; i < penonton.length; i++) {
                    for (int j = 0; j < penonton[i].length; j++) {
                        String ada;
                        if (penonton[i][j] == null){
                            ada = "***";
                        } else {
                            ada = penonton[i][j];
                        }

                        System.out.print(ada + "\t ");
                    }
                    System.out.println(" ");
                }
                System.out.println(" ");
                break; 

                case (3):
                System.out.println("");
                System.out.println("Terima kasih sudah berkunjung");
                    return;

                default:
                System.out.println("Perintah tidak diketahui.");
                System.out.println(" ");
                    break;
            }
        }
    }
}
