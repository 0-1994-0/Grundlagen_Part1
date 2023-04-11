import java.util.Random;

public class Arrays {
    public static void main(String[] args) {
        Random random = new Random();

        int maxi = Integer.MIN_VALUE;
        int mini = Integer.MAX_VALUE;


        int[] klein = new int[6];

        for (int j = 0; j < klein.length; j++) {
            klein[j] = random.nextInt(1, 100);
            System.out.println(klein[j]);
            if (klein[j] < mini) {
                mini = klein[j];

            }
        }
        System.out.println(mini);


        int[] groß = new int[9];

        for (int s = 0; s < groß.length; s++) {
            groß[s] = random.nextInt(1, 100);
            System.out.println(groß[s]);
            if (groß[s] > maxi) {
                maxi = groß[s];
            }
        }

        System.out.println(maxi);


        int durchschnitt[] = new int[9];
        int sum = 0;

        for (int i = 0; i < durchschnitt.length; i++) {
            durchschnitt[i] = random.nextInt(1, 100);
            sum = sum + durchschnitt[i];
        }
        System.out.println(sum);
        System.out.println(sum / durchschnitt.length);


        double[][] doubarray = {{8.8, 12}, {134, 67.92, 45, 32.4, 76}, {1}, {0, 0.56}};
        double summe = 0;
        for (int i = 0; i < doubarray.length; i++) {
            for (int j = 0; j < doubarray[i].length; j++) {
                summe = summe + doubarray[i][j];
                //System.out.println(summe);
            }
        }
        System.out.println(summe);


        int[][] zufaellige = new int[8][8];

        int summieren = 0;
        int durchschnitte = 0;
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for (int q = 0; q < zufaellige.length; q++) {
            for (int r = 0; r < zufaellige[q].length; r++) {
                zufaellige[q][r] = random.nextInt(1, 100);
                System.out.println(zufaellige[q][r]);
                summieren = summieren + zufaellige[q][r];
                if (zufaellige[q][r] < min) {
                    min = zufaellige[q][r];
                }
                if (zufaellige[q][r]>max){
                    max= zufaellige[q][r];
                }
            }


        }
        durchschnitte = summieren / (zufaellige.length*zufaellige[0].length);

        System.out.println("Summe aller Elemente: "+ summieren);
        System.out.println("Durchschnitt aller Elemente: "+ (summieren/ zufaellige.length) + " oder " + durchschnitte );
        System.out.println("Maximum im Array: "+ max);
        System.out.println("Minimum im Array: "+ min);






        int [] [] array1 =  {{2, 5, 3, 2}, {6, 4, 2}, {2, 10}, {2, 2, 2, 2, 6}};







    }
}