package jobsheet9;

import java.util.Scanner;

public class tugas1nilaiTugasMahasiswa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double rtRtNilai= 0;
        int rtRtsmntr = 0, tertinggi = 0, terendah = 100;

        System.out.print("Masukan jumlah mahasiswa: ");
        int tgsSiswa = sc.nextInt();

        int[] arrTgsSiswa = new int[tgsSiswa];

        for (int i = 0; i < arrTgsSiswa.length; i++) {
            System.out.print("Masukan nilai Mahasiswa ke-" + (i+1) + ": ");
            arrTgsSiswa[i] = sc.nextInt();
        }

        for (int i = 0; i < arrTgsSiswa.length; i++) {
            System.out.println("nilai mahasiswa ke-" + (i+1) + " adalah: " + arrTgsSiswa[i]);
        }
        
        for (int i = 0; i < arrTgsSiswa.length; i++) {
            rtRtsmntr += arrTgsSiswa[i];
        }
        rtRtNilai = rtRtsmntr/arrTgsSiswa.length;
        System.out.println("rata-rata nilai keseluruhan mahasiswa adalah: " + rtRtNilai);

        for (int i = 0; i < arrTgsSiswa.length; i++) {
            if (arrTgsSiswa[i] > tertinggi) {
                tertinggi = arrTgsSiswa[i];
            }
            if (arrTgsSiswa[i] < terendah) {
                terendah = arrTgsSiswa[i];
            }
        }
        System.out.println("Nilai tertinggi mahasiswa yaitu: " + tertinggi);
        System.out.println("Nilai terendah mahasiswa yaitu: " + terendah);

    }
}
