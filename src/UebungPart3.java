import java.util.Arrays;
import java.util.Random;

public class UebungPart3 {
    public static void main(String[] args) {


        int[] array = new int[200];

        for (int i = 2; i <= array.length; i = i + 2)
            System.out.println(i);

        int gerade = 2;


        String[] arrays = new String[100];

        for (int i = 0; i <= 99; i++) {
            arrays[i] = Integer.toString(gerade);
            gerade = gerade + 2;
        }
        System.out.println(Arrays.toString(arrays));


        int[] test = new int[100];
        int geradeZ = 2;

        for (int i = 0; i < 99; i++) {
            test[i] = geradeZ;
            System.out.println(geradeZ);
            geradeZ = geradeZ + 2;
            //System.out.println(test[i]);
        }

        System.out.println(Arrays.toString(test));


        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        Random random = new Random();
        int[] value = new int[100];
        int sum = 0;

        for (int i = 0; i < value.length; i++) {
            value[i] = random.nextInt(0, 500);
            sum = sum + value[i];

            System.out.println(sum);

            if (value[i] > max) {
                max = value[i];
                System.out.println(max);
            }

            if (value[i] < min) {
                min = value[i];
                System.out.println(min);
            }
        }

    }
}