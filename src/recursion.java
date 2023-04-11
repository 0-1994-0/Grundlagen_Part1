public class recursion {
    public static void main(String[] args) {
        System.out.println(recursions(5));


    }


    public static int recursions(int number) {

        if (number == 0) {
            return 1;
        } else {

            return number * recursions(number - 1);

            //System.out.println(number);
        }
    }
}
