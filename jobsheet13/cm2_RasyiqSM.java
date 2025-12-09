package jobsheet13;

import java.util.Scanner;
import java.util.Arrays;

public class cm2_RasyiqSM {
    //TAMBAH ARRAY === TAMBAH ARRAY === TAMBAH ARRAY === TAMBAH ARRAY === TAMBAH ARRAY === TAMBAH ARRAY === TAMBAH ARRAY === TAMBAH ARRAY === TAMBAH ARRAY === TAMBAH ARRAY === TAMBAH ARRAY === TAMBAH ARRAY === 
    static int indexData = 0;
    static String arrayDaftarPrestasiMahasiswa[][] = new String[indexData][5];
    static void fungsiMenambahKapasitasArray() {
        if (indexData >= arrayDaftarPrestasiMahasiswa.length) {
            arrayDaftarPrestasiMahasiswa = Arrays.copyOf(arrayDaftarPrestasiMahasiswa, arrayDaftarPrestasiMahasiswa.length + 1);

            for (int i = 0; i < arrayDaftarPrestasiMahasiswa.length; i++) {
                if (arrayDaftarPrestasiMahasiswa[i] == null) {
                    arrayDaftarPrestasiMahasiswa[i] = new String[5];
                    }
                }
            }
        }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean keluar = true;
        int menu = 0;


        System.out.println( "====PENCATATAN PRESTASI MAHASISWA====");
        System.out.println(" Masukan nomor untuk memilih menu yang kamu mau:");
        while (keluar) {
            System.out.println(" 1. Tambah Data Prestasi. \n 2. Tampilkan Semua Prestasi yang dimasukan. \n 3. Riwayat Prestasi Bedasarkan Tahun. \n 4. Riwayat Tingkat Prestasi. \n 5. Total Prestasi Mahasiswa \n 6. Keluar Program. \n ");
            System.out.print("===>:");
            menu = sc.nextInt();
            switch (menu) {
                case 1:
                    inputDataPrestasi();
                    break;

                case 2:
                    outputDataPrestasi();
                    break;

                case 3:
                    tahunDataPrestasi();
                    break;

                case 4:
                    tingkatDataPrestasi();
                    break;
                
                case 5:
                    totalPrestasiNim();
                    break;

                case 6:
                    keluar = false;
                    break;
            
                default:
                    System.out.println("Angka Tidak Valid!");
            }
        }
        System.out.println("Program Dihentikan. Terima Kasih!");
    }
    //INPUT DATA PRESTASI === INPUT DATA PRESTASI === INPUT DATA PRESTASI === INPUT DATA PRESTASI === INPUT DATA PRESTASI === INPUT DATA PRESTASI === INPUT DATA PRESTASI
    static void inputDataPrestasi() {

        String juara, tingkatPrestasi;
        int tahun;
        Scanner sc = new Scanner(System.in);
        System.out.print("Nama Mahasiswa: ");
        String nama = sc.nextLine();
        System.out.print("NIM: ");
        String nim = sc.nextLine();

        System.out.print("Jenis Prestasi apa yang ingin kamu simpan? (Juara 1,2,3,harapan,umum,...) : ");
        while (true) {
        juara = sc.nextLine().toLowerCase();

        if (juara.contains("juara")) {
            break;
        } else {
        System.out.print("Tidak ada kata 'juara'. Mohon masukkan lagi: ");
        }
    }

    System.out.print("Masukan TINGKAT PRESTASI yang diraih (Lokal, Nasional, Internasional): ");

    while (true) {
        tingkatPrestasi = sc.nextLine().toLowerCase();

        if (tingkatPrestasi.equals("lokal")) {
            break;
        } else if (tingkatPrestasi.equals("nasional")) {
            break;
        } else if (tingkatPrestasi.equals("internasional")) {
            break;
        } else {
            System.out.print("Tidak valid, mohon ulangi: ");
        }
    }

    System.out.print("Masukan Tahun kamu ikut berlomba: ");

    while (true) {
        tahun = sc.nextInt();
        if (tahun > 2014 && tahun <= 2025) {
            break;
        } else {
            System.out.print("Tidak valid, mohon ulangi: ");
        }
    }

    fungsiMenambahKapasitasArray();
    arrayDaftarPrestasiMahasiswa[indexData][0] = nama;
    arrayDaftarPrestasiMahasiswa[indexData][1] = String.valueOf(nim);
    arrayDaftarPrestasiMahasiswa[indexData][2] = juara;
    arrayDaftarPrestasiMahasiswa[indexData][3] = tingkatPrestasi;
    arrayDaftarPrestasiMahasiswa[indexData][4] = String.valueOf(tahun);
    indexData++;

    System.out.println("============================================================");
    System.out.println("\nData selesai diolah. Mohon cek menu 2 untuk melihat datamu!\n");
    System.out.println("============================================================");
    }
    //OUTPUT DATA PRESTASI === OUTPUT DATA PRESTASI === OUTPUT DATA PRESTASI === OUTPUT DATA PRESTASI === OUTPUT DATA PRESTASI === OUTPUT DATA PRESTASI === OUTPUT DATA PRESTASI
    static void outputDataPrestasi() {
        if (indexData == 0) {
            System.out.println("==================");
            System.out.println("data tidak ada.");
            System.out.println("==================");
            System.out.println("");
            return;
        }

        System.out.println("");
        System.out.printf("%-25s %-14s %-20s %-15s %-4s\n",
            "NAMA", "NIM", "KATEGORI", "TINGKAT", "THN");

        System.out.println("=======================================================================================");

        for (int i = 0; i < indexData; i++) {
            System.out.printf("%-25s %-14s %-20s %-15s %-4s\n",
                arrayDaftarPrestasiMahasiswa[i][0],
                arrayDaftarPrestasiMahasiswa[i][1],
                arrayDaftarPrestasiMahasiswa[i][2],
                arrayDaftarPrestasiMahasiswa[i][3],
                arrayDaftarPrestasiMahasiswa[i][4]);
        }
        System.out.println("=======================================================================================\n");
    }
    //TAHUN DATA PRESTASI ==== TAHUN DATA PRESTASI ==== TAHUN DATA PRESTASI ==== TAHUN DATA PRESTASI ==== TAHUN DATA PRESTASI ==== TAHUN DATA PRESTASI ==== TAHUN DATA PRESTASI 
    static void tahunDataPrestasi() {
        Scanner sc = new Scanner(System.in);
        int draft = 0;
        System.out.print("Tahun Prestasi (2015-2025) : ");

        while (true) {
            int tahun = sc.nextInt();
            if (tahun >= 2015 && tahun <= 2025) {
                draft = tahun;
                break;
            } else {
                System.out.print("Tidak valid, mohon ulangi: ");
            }
        }

        boolean ditemukan = false;

        for (int i = 0; i < indexData; i++) {
            if (arrayDaftarPrestasiMahasiswa[i][4].equals(String.valueOf(draft))) {
                ditemukan = true;
                System.out.printf("%-8s %-26s %-14s %-20s %-15s\n","TAHUN", "NAMA", "NIM", "KATEGORI", "TINGKAT");

                System.out.println("====================================================================================");
                System.out.printf("%-8s %-26s %-14s %-20s %-15s\n",
                    arrayDaftarPrestasiMahasiswa[i][4],
                    arrayDaftarPrestasiMahasiswa[i][0],
                    arrayDaftarPrestasiMahasiswa[i][1],
                    arrayDaftarPrestasiMahasiswa[i][2],
                    arrayDaftarPrestasiMahasiswa[i][3]);
                System.out.println("====================================================================================\n");
            }
        }

    if (!ditemukan) {
        System.out.println("======================");
        System.out.println("Data tidak ditemukan.");
        System.out.println("======================\n");
    }
    }
    //DATA TINGKAT PRESTASI === DATA TINGKAT PRESTASI === DATA TINGKAT PRESTASI === DATA TINGKAT PRESTASI === DATA TINGKAT PRESTASI === DATA TINGKAT PRESTASI === DATA TINGKAT PRESTASI === 
    static void tingkatDataPrestasi() {
        if (indexData == 0) {
            System.out.println("=========================");
            System.out.println("riwayat tidak tersedia.");
            System.out.println("=========================");
            System.out.println("");
            return;
        }

        int lokal = 0, nasional = 0, internasional = 0;
        for (int i = 0; i < arrayDaftarPrestasiMahasiswa.length; i++) {
            for (int j = 3; j < arrayDaftarPrestasiMahasiswa[i].length;) {
                if (arrayDaftarPrestasiMahasiswa[i][3].equals("lokal")) {
                    lokal++;
                    break;
                } else if (arrayDaftarPrestasiMahasiswa[i][3].equals("nasional")) {
                    nasional++;
                    break;
                } else if (arrayDaftarPrestasiMahasiswa[i][3].equals("internasional")){
                    internasional++;
                    break;
                }
            }
        }
        System.out.println("=== riwayat Ketagori kejuaraan ===");
        System.out.println("Lokal\t\t:" + lokal);
        System.out.println("Nasional\t:" + nasional);
        System.out.println("Internasional\t:" + internasional);
        System.out.println("");
    }
    static void totalPrestasiNim() {
        Scanner sc = new Scanner(System.in);
        System.out.print("\nMasukan NIM Mahasiswa Yang dicari: ");

            int prestasi = 0;
            String NIM = sc.nextLine();
            System.out.println("");

            boolean ditemukan = false;
            for (int i = 0; i < arrayDaftarPrestasiMahasiswa.length; i++) {
                if (arrayDaftarPrestasiMahasiswa[i][1].equals(String.valueOf(NIM))) {
                    ditemukan = true;
                    prestasi++;
                }
            }
            if (!ditemukan) {
                System.out.println("\n====================");
                System.out.println("NIM Tidak ditemukan/Tidak ada prestasi.");
                System.out.println("====================\n");
            }

            if (ditemukan) {
                System.out.println("============================");
                System.out.println("Prestasimu ada: " + prestasi);
                System.out.println("============================\n");  
            }

    }
}