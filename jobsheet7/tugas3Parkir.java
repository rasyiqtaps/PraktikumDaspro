package jobsheet7;

import java.util.Scanner;

public class tugas3Parkir {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int jenis, durasi, total = 0;

    do{
        System.out.print("masukan jenis kendaraanmu \t(1 Mobil)\t(2 Motor)\t(0 keluar) :");
        jenis = sc.nextInt();

        if (jenis == 1 || jenis == 2) {
            System.out.print("Masukan durasi jam parkir mu: ");
            durasi = sc.nextInt();

            if (durasi > 5) {
                total += 12500;
            } else if (jenis == 1) {
                total += durasi * 3000;
            } else if (jenis == 2) {
                total += durasi * 2000;
            }

        } else if (jenis < 0 || jenis > 2) {
            System.out.println("angka tidak ada di dalam daftar.\n");
        }

    } while (jenis != 0); {
        System.out.println("total biaya mu adalah: " + total);
    }
 }   
}
