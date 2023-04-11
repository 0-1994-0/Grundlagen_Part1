public class Part4Uebung3 {
    public static void main(String[] args) {

        int[][] gleich = {{2, 4, 3, 3}, {6, 4, 2}, {2, 4, 6}, {2, 2, 2, 6}};

        int counter = 0;
        int[] sumArray = new int[gleich.length];

        for (int i = 0; i < gleich.length; i++) {
            int sum = 0;
            for (int j = 0; j < gleich[i].length; j++) {

                sum = sum + gleich[i][j];

                // System.out.println(sum);
                // if ( = gleich[1] && sum = gleich[2] && sum = gleich[3]) {
                //    System.out.println("Die Summen aller 4 eindimensionalen ist dieselbe");
                // }
            }
            //System.out.println(sum);
            sumArray[counter] = sum;
            counter++;
        }

        if (sumArray[0] == sumArray[1] && sumArray[0] == sumArray[2] && sumArray[0] == sumArray[3]) {
            System.out.println("Die Summen aller 4 eindimensionalen ist dieselbe");
        } else {
            System.out.println("nicht!");
        }
    }
}