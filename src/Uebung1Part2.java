import java.util.Scanner;

public class Uebung1Part2 {
    public static void main(String[] args) {

        int davor = 0;
        int aktuell = 1;


        int fibo = 20;


        for (int i = 0; i < fibo; i++) {
            System.out.println(aktuell);
            int danach = davor + aktuell;

            davor = aktuell;
            aktuell = danach;
        }


        Scanner scanner = new Scanner(System.in);

        System.out.println("Bitte geben Sie eine Zahl für den Turm ein");
        int eingabe = scanner.nextInt();

        System.out.println(eingabe);
        for (int i = 2; i <= 9; i++) {

            System.out.println(eingabe + "*" + i + " = " + (eingabe *= i));
        }
        for( int i = 2; i <=9; i++){
            System.out.println(eingabe + "/" + i + " = " + (eingabe/=i));
        }
    }
}