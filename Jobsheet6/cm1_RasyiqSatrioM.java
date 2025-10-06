package Jobsheet6;

import java.util.Scanner;

public class cm1_RasyiqSatrioM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.println("==== INPUT DATA MAHASISWA ====");
        System.out.println("Nama : Rasyiq Satrio Musthafa");
        System.out.println("NIM : 254107020079");

        System.out.println("--- Mata Kuliah 1: Algoritma dan pemrograman ---");
        System.out.print("masukan nilai UTS kamu: ");
        int uts1 = sc.nextInt();
        System.out.print("masukan nilai UAS kamu: ");
        int uas1 = sc.nextInt();
        System.out.print("masukan nilai tugas kamu: ");
        int tgs1 = sc.nextInt();

        System.out.println("--- Mata Kuliah 2: Struktur Data ---");
        System.out.print("masukan nilai uts kamu: ");
        int uts2 = sc.nextInt();
        System.out.print("masukan nilai uas kamu: ");
        int uas2 = sc.nextInt();
        System.out.print("masukan nilai tugas kamu: ");
        int tgs2 = sc.nextInt();
        System.out.println("");


        System.out.println("==== INPUT DATA MAHASISWA ====");
        System.out.println("Nama \t: Rasyiq Satrio Musthafa");
        System.out.println("NIM \t: 254107020079\n");

        System.out.println("--- Mata Kuliah 1: Algoritma dan pemrograman ---");
        System.out.println("Nilai UTS\t:" + uts1);
        System.out.println("Nilai UAS\t:" + uas1);
        System.out.println("Nilai Tugas\t:" + tgs1);

        System.out.println("--- Mata Kuliah 2: Struktur Data ---");
        System.out.println("Nilai UTS\t:" + uts2);
        System.out.println("Nilai UAS\t:" + uas2);
        System.out.println("Nilai Tugas\t\n:" + tgs2);

        //BATAS DARI SEGALA TIPU DAYA DAN AKHIR ZAMAN, KARENA BAGIAN ATAS MERUPAKAN BAGIAN YANG TIDAK SELALU SEMPURNA

         //BAGIAN INI BUAT NYARI NILAI AKHIR,, AWAL DARI SEGALA KEMUSTAHILAN MENJADI KENYATAAN
        double nilaiAkhir1 = (uts1*0.3) + (uas1*0.4) + (tgs1*0.3);
        double nilaiAkhir2 = (uts2*0.3) + (uas2*0.4) + (tgs2*0.3);

        //BAGIAN INI FUNGSINYA MENCARI NILAI HURUF,, PANJANG EMANG ADOOOH
        String nilaiHuruf1;
        String nilaiHuruf2;

        if (nilaiAkhir1<=100 && nilaiAkhir1>=81) {
            nilaiHuruf1 = "A";
        }else if (nilaiAkhir1<=80 && nilaiAkhir1>=74) {
            nilaiHuruf1 = "B+";
        }else if (nilaiAkhir1<=73 && nilaiAkhir1>=66) {
            nilaiHuruf1 = "B";
        }else if (nilaiAkhir1<=65 && nilaiAkhir1>=61) {
            nilaiHuruf1 = "C+";
        }else if (nilaiAkhir1<=60 && nilaiAkhir1>=51) {
            nilaiHuruf1 = "C";
        }else if (nilaiAkhir1<=50 && nilaiAkhir1>=39) {
            nilaiHuruf1 = "D";
        } else {
            nilaiHuruf1 = "E";
        }

        if (nilaiAkhir2<=100 && nilaiAkhir2>=81) {
            nilaiHuruf2 = "A";
        }else if (nilaiAkhir2<=80 && nilaiAkhir2>=74) {
            nilaiHuruf2 = "B+";
        }else if (nilaiAkhir2<=73 && nilaiAkhir2>=66) {
            nilaiHuruf2 = "B";
        }else if (nilaiAkhir2<=65 && nilaiAkhir2>=61) {
            nilaiHuruf2 = "C+";
        }else if (nilaiAkhir2<=60 && nilaiAkhir2>=51) {
            nilaiHuruf2 = "C";
        }else if (nilaiAkhir2<=50 && nilaiAkhir2>=39) {
            nilaiHuruf2 = "D";
        } else {
            nilaiHuruf2 = "E";
        }
        //BAGIAN INI KITA MENCARI STATUS
        String sts1;
        String sts2;

        if (nilaiAkhir1>=60) {
            sts1 = "LULUS";
        } else {
            sts1 = "TIDAK LULUS";
        }

        if (nilaiAkhir2>=60) {
            sts2 = "LULUS";
        } else {
            sts2 = "TIDAK LULUS";
        }

        //INI TUH RUMUS RATA RATA KELULUSAN
        double rtRt = (nilaiAkhir1 + nilaiAkhir2) / 2;

        //INI BAGIAN NYARI STATUS SEMESTER,, AKHIRRNYAAAAAAAAAAAAAAAA
        String staSem;
        if (nilaiAkhir1>=60 && nilaiAkhir2>=60) {
            if (rtRt>=70) {
                staSem = "LULUSSSSS YAYYYYYYYY";
            } else {
                staSem = "TIDAK LULUSSSS (Rata-Rata mu kurang dari 70!!!)";
            }
        } else {
            staSem = "Ada Materimu yang statusnya tidak lulus!!";
        }


        System.out.println("==================== HASIL PENILAIAN AKADEMIK ====================");
        System.out.println("Nama\t: Rasyiq Satrio Musthafa");
        System.out.println("NIM\t: 254107020079\t");

        System.out.println("Mata Kuliah\t\tUTS\tUAS\tTUGAS\tNilai Akhir\tNilai Huruf\tStatus");
        System.out.println("----------------------------------------------------------------------------------------------------------");
        System.out.println(String.format("Algoritma Pemrograman\t%s\t%s\t%s\t%s\t\t%s\t\t%s  ", uts1, uas1, tgs1, nilaiAkhir1, nilaiHuruf1, sts1));
        System.out.println(String.format("Algoritma Pemrograman\t%s\t%s\t%s\t%s\t\t%s\t\t%s  ", uts2, uas2, tgs2, nilaiAkhir2, nilaiHuruf2, sts2));
        System.out.println("");
        System.out.println("Rata-Rata Nilai Akhir\t: "+ rtRt);
        System.out.println("Status Semester\t: "+ staSem);
    }
}
