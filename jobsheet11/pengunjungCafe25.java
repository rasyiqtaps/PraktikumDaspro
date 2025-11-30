package jobsheet11;

public class pengunjungCafe25 {
    static void daftarPengunjung(String...namaPengunjung) {
        System.out.println("Daftar Nama Pengunjung");
        for (int i = 0; i < namaPengunjung.length; i++) {
            System.out.println("- " + namaPengunjung[i]);
        }       
    }
    public static void main(String[] args) {
        daftarPengunjung("ali", "Budi", "Citra");
        daftarPengunjung("andi");
        daftarPengunjung("Doni", "Eti", "Fahmi", "Galih");
    }
}
