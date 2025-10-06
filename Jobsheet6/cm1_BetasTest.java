package Jobsheet6;

public class cm1_BetasTest {
    public static void main(String[] args) {

        int uts1 = 60;

        int uas1 = 70;
 
        int tgs1 = 50;

        int uts2 = 70;
    
        int uas2 = 80;
     
        int tgs2 = 80;

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
