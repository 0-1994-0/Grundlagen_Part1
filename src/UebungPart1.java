import java.util.Scanner;

public class UebungPart1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Geschwindigkeit: ");
        int geschwindigkeit = input.nextInt();
        int strafe = 0;

        if (geschwindigkeit > 50) {
            int ueberschreitung = geschwindigkeit - 50;
            System.out.println("Die Überschreitung ist: " + ueberschreitung);


            if (0 < ueberschreitung && ueberschreitung < 10) {
                System.out.println("Schriftliche Verwarnung");
            } else if (10 < ueberschreitung && ueberschreitung < 20) {
                System.out.println("30 Euros");
                strafe = 30;
            } else if (20 < ueberschreitung && ueberschreitung < 30) {
                System.out.println("50 Euros");
                strafe = 50;
            } else if (30 < ueberschreitung && ueberschreitung < 50) {
                System.out.println("100 Euros");
                strafe = 100;
            } else if (50 < ueberschreitung && ueberschreitung < 100) {
                System.out.println("500 Euros");
                strafe = 500;
            } else {
                System.out.println("1500 Euros");
                strafe = 1500;
            }
        }


        System.out.println("Pegel: ");
        double pegel = input.nextDouble();

        int strafe1 = 0;

        if (0 < pegel && pegel < 0.5) {
            System.out.println("Alles OK");
        } else if (0.5 < pegel && pegel < 1.0) {
            System.out.println("50 Euro");
            strafe1 = 50;
        } else if (1.0 < pegel && pegel < 2.0) {
            System.out.println("100 Euros");
            strafe1 = 100;
        } else {
            System.out.println("2500 Euros");
            strafe1 = 2500;
        }


        System.out.println(strafe + strafe1);

        System.out.println("Monat: ");
        String monat = input.next().toLowerCase();

        double gesamtstrafe = strafe+strafe1;

        switch (monat){

            case "januar", "februar":
                System.out.println("Keine Rabatte");
                break;
            case "maerz", "april":
                gesamtstrafe=gesamtstrafe*0.9;
                System.out.println("10%" + gesamtstrafe);
                break;
            case "mai", "juni":
                gesamtstrafe=gesamtstrafe*0.85;
                System.out.println("15%"+ gesamtstrafe);
                break;
            case "juli", "august":
                gesamtstrafe=gesamtstrafe*0.8;
                System.out.println(gesamtstrafe);
                break;
            case "september", "oktober":
                gesamtstrafe=gesamtstrafe*0.75;
                System.out.println(gesamtstrafe);
                break;
            case "november", "dezember":
                gesamtstrafe=gesamtstrafe*0.7;
                System.out.println(gesamtstrafe);
                break;
        }


        System.out.println("Monat: ");
        String month = input.next().toLowerCase();

        int tageAnzahl;

        switch (month){
            case  "january", "march", "mai", "october":
                tageAnzahl=31;
                System.out.println(tageAnzahl);
                break;
            case "february":
                tageAnzahl=28;
                System.out.println(tageAnzahl);
                break;
            case "november", "september","august", "juli":
                tageAnzahl=30;
                System.out.println(tageAnzahl);
                break;

        }

    }
}