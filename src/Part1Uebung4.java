import java.util.Scanner;

public class Part1Uebung4 {
    public static void main(String[] args) {



        int option = 0;
        do {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Waehlen Sie bitte eine Option indem Sie die Zahl der Option eingeben: ");
            System.out.println("1. Umgekehrte Stringausgabe");
            System.out.println("2. Pruefen ob eine Zahl gerade oder ungerade ist");
            System.out.println("3. Vokale zaehlen");
            System.out.println("4. Fakultaet berechnen");

            option = scanner.nextInt();


            switch (option) {
                case 1:
                    umgekehrt();
                    break;

                case 2:
                    zahl();
                    break;

                case 3:
                    vokale();
                    break;

                case 4:
                    faku();
                    break;
                case 5:
                    System.out.println("  ");

            }

        }

        while (option != 5);
    }


    public static void umgekehrt() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Wort eingeben: ");
        String wort = scanner.nextLine();
        String word = "";

        for (int i = wort.length() - 1; i >= 0; i--) {
            word = word + wort.charAt(i);
        }
        System.out.println(word);
    }

    public static void zahl() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Zahl eingeben: ");
        int zahl = scanner.nextInt();
        if (zahl % 2 == 0) {
            System.out.println("Zahl ist gerade");
        } else {
            System.out.println("Zahl ist ungerade");
        }
    }


    public static void vokale() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Geben Sie ein Satz: ");
        String satz = scanner.nextLine();
        int counter = 0;

        for (int i = 0; i < satz.length(); i++) {
            char vok = Character.toLowerCase(satz.charAt(i));
            if (vok == 'a' || vok == 'e' || vok == 'i' || vok == 'o' || vok == 'u') {
                counter++;
            }
            if (satz.charAt(i) == 'a') {
                System.out.println("ist eine Vokale");
            }

        }
        System.out.println("Soviel Vokalen sind enthalten :" + counter);
    }

    public static void faku() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Geben Sie eine Zahl ein: ");
        int faku = scanner.nextInt();
        int start = 1;

        for (int i = 1; i <= faku; i++) {

            start = start * i;
        }

        System.out.println(faku + " is " + start);

    }
}