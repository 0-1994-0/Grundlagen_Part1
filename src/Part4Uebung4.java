import java.util.Random;

public class Part4Uebung4 {
    public static void main(String[] args) {

        Random random = new Random();
        double[][][] dreidimen = new double[4][3][2];

        double sum = 0;
        double min = Integer.MAX_VALUE;
        double max = Integer.MIN_VALUE;

        for (int i = 0; i < dreidimen.length; i++) {
            for (int j = 0; j < dreidimen[i].length; j++) {
                for (int k = 0; k < dreidimen[i][j].length; k++) {
                    dreidimen[i][j][k] = random.nextDouble(0.0, 1.0);
                    sum = sum + dreidimen[i][j][k];


                    if (dreidimen[i][j][k] < min) {
                        min = dreidimen[i][j][k];
                    }

                    if (dreidimen[i][j][k] > max) {
                        max = dreidimen[i][j][k];
                    }
                }
            }
        }
        System.out.println(sum);
        System.out.println(sum / (dreidimen.length * dreidimen[0].length * dreidimen[0][0].length));
        System.out.println(min);
        System.out.println(max);

    }
}