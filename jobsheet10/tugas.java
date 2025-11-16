package jobsheet10;

import java.util.Scanner;

public class tugas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] question = {
            "pertanyaan 1 (1 - 5): ",
            "pertanyaan 2 (1 - 5): ",
            "pertanyaan 3 (1 - 5): ",
            "pertanyaan 4 (1 - 5): ",
            "pertanyaan 5 (1 - 5): ",
            "pertanyaan 6 (1 - 5): "
        };

        int jmlPengguna = 10;
        int jmlPertanyaan = 6;
        int[][] nilai = new int[jmlPengguna][jmlPertanyaan];

        //+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++

        System.out.println("SELAMAT DATANG DI FORUM KEPUASAN PENGGUNA!");
        for (int i = 0; i < nilai.length; i++) {
            System.out.println("silahkan responden ke-" + (i+1) + " untuk menyatakan kepuasan pelangggan");
            double rataRating = 0;

            for (int j = 0; j < nilai[i].length; j++) {
                while (true) {
                int checkers = 0;
                System.out.print(question[j]);
                checkers = sc.nextInt();

                    if (checkers < 6 && checkers > 0) {
                        nilai[i][j] = checkers;
                        break;
                    } else {
                        System.out.println("angka tidak valid. mohon ulangi");
                    }
                
                }
                rataRating += nilai[i][j];
            }
            System.out.println("rata-rata rating yang di input penggguna adalah: " + (rataRating/6) + "\n");
        }

        //++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++

        for (int i = 0; i < jmlPertanyaan; i++) {
            double rtRtRating = 0;
            for (int j = 0; j < jmlPengguna; j++) {
                rtRtRating += nilai[j][i];
            }
        System.out.println("rata-rata pertanyaan ke-" + (i + 1) + " adalah: " + rtRtRating/jmlPengguna);
        }

        //++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++

        double totalAkhir = 0;
        for (int i = 0; i < nilai.length; i++) {
            for (int j = 0; j < nilai[i].length; j++) {
                totalAkhir += nilai[i][j];
            }
        }
        double totalKeseluruhan = totalAkhir / (jmlPengguna * jmlPertanyaan);
        System.out.println("\ntotal rating dari keseluruhan penggguna adalah: " + totalKeseluruhan);
    }
}
