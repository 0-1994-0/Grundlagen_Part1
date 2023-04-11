import java.util.Random;
import java.util.Scanner;

public class Part3 {
    public static void main(String[] args) {


        double[] array = {4.4, 7.85, 1.6, 48.74, 96.74, 87.45};
        double max = array[0];


        for (int i = 0; i < array.length; i++) {
            if (max < array[i]) {
                //array[i]=max;
                max = array[i];

            }
            //System.out.println(max);

        }
        System.out.println(max);

        String[] wort = {"bonjour", "salut", "Ca va", "hello", "quoi", "hein"};

        for (int i = 0; i < wort.length; i++) {
            System.out.println(wort[i].length());
        }


        int[] summe = {7, 84, 95, 87, 10, 52, 63, 45, 74};
        int sum = 0;

        for (int i = 0; i < summe.length; i++) {

            sum = sum + summe[i];
        }
        System.out.println(sum);

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int[] zufall = new int[15];

        for (int i = 0; i < zufall.length; i++) {
            zufall[i] = random.nextInt(1, 100);
        }

        for (int i = 0; i < zufall.length; i++) {
            System.out.println(zufall[i]);
        }

        int[] zahl1 = new int[20];
        for (int i = 0; i < zahl1.length; i++) {

            zahl1[i] = random.nextInt(1, 100);
            if (zahl1[i] % 2 == 0) {
                System.out.println(zahl1[i]);
            }
        }

        String[] arrays = {"dede", "papst", "wieso", "berg", "sohalt", "idem", "idas", "extra"};

        for (int i = 0; i < arrays.length; i++) {

            if (arrays[i].charAt(0) == 'i') {
                System.out.println(arrays[i]);
            }

            int maxi = Integer.MIN_VALUE;
            int mini = Integer.MAX_VALUE;


            int[] klein = {4, 85, 46, 12, 45, 9, 7};

            for (int j = 0; j < klein.length; j++) {
                //klein [j]  = random.nextInt(1,100);
                if (klein[j] < mini) {
                    mini = klein[j];

                }
            }
            System.out.println(mini);


        }

    }

}
