public class MultiplicationDemoApp {

    public static void main(String[] args) {

        System.out.println(multiplicate(4, 3));
    }


    public static int multiplicate(int number1, int number2) {

        if (number2 == 0) {
            System.out.println("stop");
        } else {

           int num = number1 + multiplicate(number1, number2 - 1);
            System.out.println(num);

        }
        return 0;

    }
}