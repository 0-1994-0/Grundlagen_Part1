import java.util.Scanner;

public class Uebung1 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Name: ");
        String name = scanner.next();
        System.out.println("Alter");
        int alter = scanner.nextInt();
        int zahl = 0;

        System.out.println("Du bist " + name + " " + alter);


        while (0 >= zahl || zahl > 10) {
            System.out.println("Zahl: ");
            zahl = scanner.nextInt();

            if (0 >= zahl || zahl > 10) {
                System.out.println("Nochmal eingeben: ");
            }
        }

        String word= " ";

        switch (zahl) {

            case 1:
                word="one";
                break;
            case 2:
                word="two";
                break;
            case 3:
                word="three";
                break;
            case 4:
                word="four";
                break;
            case 5:
                word="five";
                break;
            case 6:
                word="six";
                break;
            case 7:
                word="seven";
                break;
            case 8:
                word="eight";
                break;
            case 9:
                word="nine";
                break;
            case 10:
                word="ten";

                break;
        }
        //if (0 < zahl && zahl < 11) {
        System.out.println(word+ " für " +zahl);
    }

}






