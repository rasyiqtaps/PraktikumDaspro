package jobsheet10;

public class modBioskop25 {
    public static void main(String[] args) {
        String [][] penonton = new String[4][2];
        penonton[0][0] = "Amin";
        penonton[0][1] = "Beta";
        penonton[1][0] = "Chandra";
        penonton[1][1] = "Dela";
        penonton[2][0] = "Eka";
        penonton[2][1] = "Farhan  ";
        penonton[3][0] = "Gisel";
        penonton[3][1] = "Hana";

        System.out.println(penonton.length);
        for (int i = 0; i < penonton.length; i++) {
            System.out.println("penonton baris ke-" + (i+1) + ": " + String.join(", ", penonton[i]));
        }

    System.out.println("Penonton baris ke-3: ");

        for (String i : penonton[2]) {
            System.out.print(i + " ");   
                   
        }    
    }
}
