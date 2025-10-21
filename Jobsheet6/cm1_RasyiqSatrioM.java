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
        double uts1 = sc.nextDouble();
        System.out.print("masukan nilai UAS kamu: ");
        double uas1 = sc.nextDouble();
        System.out.print("masukan nilai tugas kamu: ");
        double tgs1 = sc.nextDouble();
        System.out.println("");

        System.out.println("--- Mata Kuliah 2: Struktur Data ---");
        System.out.print("masukan nilai uts kamu: ");
        double uts2 = sc.nextDouble();
        System.out.print("masukan nilai uas kamu: ");
        double uas2 = sc.nextDouble();
        System.out.print("masukan nilai tugas kamu: ");
        double tgs2 = sc.nextDouble();
        System.out.println("");

        //tambahan nilai matematika
        System.out.println("--- Mata Kuliah 3: Matematika ---");
        System.out.print("masukan nilai uts kamu: ");
        double uts3 = sc.nextDouble();
        System.out.print("masukan nilai uas kamu: ");
        double uas3 = sc.nextDouble();
        System.out.print("masukan nilai tugas kamu: ");
        double tgs3 = sc.nextDouble();
        System.out.println("");


        System.out.println("==== INPUT DATA MAHASISWA ====");
        System.out.println("Nama \t: Rasyiq Satrio Musthafa");
        System.out.println("NIM \t: 254107020079\n");

        System.out.println("--- Mata Kuliah 1: Algoritma dan pemrograman ---");
        System.out.println("Nilai UTS\t:" + uts1);
        System.out.println("Nilai UAS\t:" + uas1);
        System.out.println("Nilai Tugas\t:" + tgs1 + "\n");

        System.out.println("--- Mata Kuliah 2: Struktur Data ---");
        System.out.println("Nilai UTS\t:" + uts2);
        System.out.println("Nilai UAS\t:" + uas2);
        System.out.println("Nilai Tugas\t:" + tgs2 + "\n");

        System.out.println("--- Mata Kuliah 3: Matematika ---");
        System.out.println("Nilai UTS\t:" + uts3);
        System.out.println("Nilai UAS\t:" + uas3);
        System.out.println("Nilai Tugas\t:" + tgs3 + "\n");

        //BATAS DARI SEGALA TIPU DAYA DAN AKHIR ZAMAN, KARENA BAGIAN ATAS MERUPAKAN BAGIAN YANG TIDAK SELALU SEMPURNA

         //BAGIAN INI BUAT NYARI NILAI AKHIR,, AWAL DARI SEGALA KEMUSTAHILAN MENJADI KENYATAAN
        double nilaiAkhir1 = (uts1*0.3) + (uas1*0.4) + (tgs1*0.3);
        double nilaiAkhir2 = (uts2*0.3) + (uas2*0.4) + (tgs2*0.3);
        double nilaiAkhir3 = (uts3*0.3) + (uas3*0.4) + (tgs3*0.3);

        //BAGIAN INI FUNGSINYA MENCARI NILAI HURUF,, PANJANG EMANG ADOOOH
        String nilaiHuruf1;
        String nilaiHuruf2;
        String nilaiHuruf3;

        if (nilaiAkhir1<=100 && nilaiAkhir1>80) {
            nilaiHuruf1 = "A";
        }else if (nilaiAkhir1<=80 && nilaiAkhir1>73) {
            nilaiHuruf1 = "B+";
        }else if (nilaiAkhir1<=73 && nilaiAkhir1>65) {
            nilaiHuruf1 = "B";
        }else if (nilaiAkhir1<=65 && nilaiAkhir1>60) {
            nilaiHuruf1 = "C+";
        }else if (nilaiAkhir1<=60 && nilaiAkhir1>50) {
            nilaiHuruf1 = "C";
        }else if (nilaiAkhir1<=50 && nilaiAkhir1>38) {
            nilaiHuruf1 = "D";
        } else {
            nilaiHuruf1 = "E";
        }

        if (nilaiAkhir2<=100 && nilaiAkhir2>80) {
            nilaiHuruf2 = "A";
        }else if (nilaiAkhir2<=80 && nilaiAkhir2>73) {
            nilaiHuruf2 = "B+";
        }else if (nilaiAkhir2<=73 && nilaiAkhir2>65) {
            nilaiHuruf2 = "B";
        }else if (nilaiAkhir2<=65 && nilaiAkhir2>60) {
            nilaiHuruf2 = "C+";
        }else if (nilaiAkhir2<=60 && nilaiAkhir2>50) {
            nilaiHuruf2 = "C";
        }else if (nilaiAkhir2<=50 && nilaiAkhir2>38) {
            nilaiHuruf2 = "D";
        } else {
            nilaiHuruf2 = "E";
        }

        if (nilaiAkhir3<=100 && nilaiAkhir3>80) {
            nilaiHuruf3 = "A";
        }else if (nilaiAkhir3<=80 && nilaiAkhir3>73) {
            nilaiHuruf3 = "B+";
        }else if (nilaiAkhir3<=73 && nilaiAkhir3>65) {
            nilaiHuruf3 = "B";
        }else if (nilaiAkhir3<=65 && nilaiAkhir3>60) {
            nilaiHuruf3 = "C+";
        }else if (nilaiAkhir3<=60 && nilaiAkhir3>50) {
            nilaiHuruf3 = "C";
        }else if (nilaiAkhir3<=50 && nilaiAkhir3>38) {
            nilaiHuruf3 = "D";
        } else {
            nilaiHuruf3 = "E";
        }
        //BAGIAN INI KITA MENCARI STATUS
        String sts1;
        String sts2;
        String sts3;

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

        if (nilaiAkhir3>=60) {
            sts3 = "LULUS";
        } else {
            sts3 = "TIDAK LULUS";
        }

        //INI TUH RUMUS RATA RATA KELULUSAN
        double rtRt = (nilaiAkhir1 + nilaiAkhir2 + nilaiAkhir3) / 3;

        //INI BAGIAN NYARI STATUS SEMESTER,, AKHIRRNYAAAAAAAAAAAAAAAA
        String staSem;
        if (nilaiAkhir1>=60 && nilaiAkhir2>=60 && nilaiAkhir3>=60) {
            if (rtRt>=70) {
                staSem = "LULUS";
            } else {
                staSem = "TIDAK LULUS (Rata-Rata mu kurang dari 70)";
            }
        } else {
            staSem = "Ada Materimu yang statusnya tidak lulus!!";
        }
        //rata rata terbesar
        String rtRtTerbesar = "";
        if (nilaiAkhir1 > nilaiAkhir2) {
            if (nilaiAkhir1 > nilaiAkhir3) {
                rtRtTerbesar = "Rata-Rata 1 (" + nilaiAkhir1 + ")"; 
            }
        } else if (nilaiAkhir2 > nilaiAkhir3) {
            rtRtTerbesar =  "Rata-Rata 2 (" + nilaiAkhir2 + ")";
        } else {
            rtRtTerbesar =  "Rata-Rata 3 (" + nilaiAkhir3 + ")";
        }

        System.out.println("==================== HASIL PENILAIAN AKADEMIK ====================");
        System.out.println("Nama\t: Rasyiq Satrio Musthafa");
        System.out.println("NIM\t: 254107020079\t");

        System.out.println("Mata Kuliah\t\tUTS\tUAS\tTUGAS\tNilai Akhir\tNilai Huruf\tStatus");
        System.out.println("----------------------------------------------------------------------------------------------------------");
        System.out.printf("Algoritma Pemrograman\t%.2f\t%.2f\t%.2f\t%.2f\t\t%s\t\t%s  \n", uts1, uas1, tgs1, nilaiAkhir1, nilaiHuruf1, sts1);
        System.out.printf("Algoritma Pemrograman\t%.2f\t%.2f\t%.2f\t%.2f\t\t%s\t\t%s  \n", uts2, uas2, tgs2, nilaiAkhir2, nilaiHuruf2, sts2);
        System.out.printf("Algoritma Pemrograman\t%.2f\t%.2f\t%.2f\t%.2f\t\t%s\t\t%s  \n", uts3, uas3, tgs3, nilaiAkhir3, nilaiHuruf3, sts3);
        System.out.println("");
        System.out.println("Rata-Rata Nilai Akhir\t: "+ rtRt);
        System.out.println("Nilai rata-rata terbesarmu adalah: " + rtRtTerbesar);
        System.out.println("Status Semester\t: "+ staSem);
    
}
}
