package Quiz2;

public class kuis25Rasyiq {
    public static void main(String[] args) {
        String [] namaMenu25 = {"italian Food", "korean Food", "chinese Food", "khas Jogja", "khas Madura"};
        int [][] Menu25 = {
            {6, 8, 4}, 
            {10, 16, 11}, 
            {9, 14, 10},
            {12, 5, 7},
            {5, 8, 5}};

        for (int i = 0; i < Menu25.length; i++) {
            int totalPesanan25 = 0;
            for (int j = 0; j < Menu25[i].length; j++) {
                totalPesanan25 += Menu25[i][j];
            }
        System.out.println("total pesanan pada menu " + namaMenu25[i] + " adalah: " + totalPesanan25);
        }
        System.out.println("");

        //+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++

        double rtRt = 0;
        for (int i = 0; i < 3; i++) {
            rtRt += Menu25[4][i];
        }
        System.out.println("2. Rata-Rata pembelian menu khas madura adalah: " + rtRt/3 + "\n");

        //++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++

        int jmlDipesan = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < Menu25[i].length; j++) {
                jmlDipesan += Menu25 [i][j];                
            }
        }
        double labaImpor = jmlDipesan * 50000;
        System.out.print("3. ");
        System.out.println("total pemasukan makanan luar negeri adalah: " + labaImpor);

        jmlDipesan = 0;
        for (int i = 3; i < 4; i++) {
            for (int j = 0; j < Menu25[i].length; j++) {
                jmlDipesan += Menu25 [i][j];                
            }
        }
        double labaLokal = jmlDipesan * 30000;
        System.out.println("total pemasukan makanan luar negeri adalah: " + labaLokal);

        System.out.println("total pemasukan keseluruhan adalah: " + (labaImpor + labaLokal) + "\n");

        //+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
        
        for (int j = 0;  j < Menu25.length;) {
            int tertinggi = 0;
            int terendah = 100;
            for (int i = 0; i < Menu25[j].length; i++) {
                if (Menu25[j][i] > tertinggi) {
                    tertinggi = Menu25[j][i];
                } 
                if (Menu25[j][i] < terendah) {
                    terendah = Menu25[j][i];
                }
            
            }
            System.out.println("pesanan tertinggi untuk jenis dine in adalah: " + tertinggi);
            System.out.println("pesanan terendah untuk jenis dine in adalah: " + terendah);
        break;
        }
        //System.out.println("menu tertinggi pada pesanan dine in diraih oleh " +  " dengan: " + tertinggi + " total pesanan.");
        //System.out.println("menu terendah pada pesanan dine in diraih oleh "  + " dengan: " + terendah + " total pesanan.");
    }
}
