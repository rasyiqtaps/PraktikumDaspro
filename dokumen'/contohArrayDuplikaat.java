public class contohArrayDuplikaat {
    public static void main(String[] args) {
        
        int [][] stock = {
            {12, 15, 17, 19},
            {9, 89, 76, 4},
            {10, 123,134,12}
        };

        for (int i = 0; i < stock.length; i++) {
            for (int temp : stock[1]) {
                System.out.print(temp + 1 + "\t");
            }
        System.out.println(" ");
        }
    
    }
}
