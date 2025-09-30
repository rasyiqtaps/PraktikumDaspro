package jobsheet5;

import java.util.Scanner;

public class nestedUjianSkripsi25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String pesan = "";
        System.out.print("Apakah mahasiswa sudah bebas komponen? (Ya/Tidak): ");
        String bebasKomponen = sc.nextLine().trim();

        System.out.println("Masukan jumlah log bimbingan Pembimbing 1: ");
        int bimbinganP1 = sc.nextInt();
        System.out.println("Masukan jumlah log bimbingan Pembimbing 2: ");
        int bimbinganP2 = sc.nextInt();

        if (bebasKomponen.equalsIgnoreCase("Ya")) {
            if (bimbinganP1 >= 8 &&bimbinganP2 >= 4) {
                
            pesan = "Semua syarat terpenuhi. Mahasiswa boleh mendaftar ujian skripsi";
            }else if (bimbinganP1 < 8 && bimbinganP2 < 4) {
                
            pesan = "gagal! Log bimbingan P1 kurang dari 8 dan P2 kurang dari 4 kali";
            }else if (bimbinganP1 < 8) {
            
            pesan = "Gagal! Log bimbingan P1 belum mencapai 8 kali";
            }else if (bimbinganP2 < 4) {

            pesan = "Gagal! Log bimbingan P2 belum mencapai 4 kali";
            }
        
        }else {
        pesan = "Gagal! Mahasiswa masih memiliki tanggungan kompen";
        } System.out.println(pesan);
    }
    }
    
