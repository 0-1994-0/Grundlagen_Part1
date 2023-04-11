import java.util.Scanner;

public class TicTac {
    public static void main(String[] args) {

        spielablauf();
    }

    public static void spielablauf() {

        // Array initialisieren

        int[][] array =
                {{0, 0, 0},
                        {0, 0, 0},
                        {0, 0, 0}};

        //Aktuellen Spielstand abrufen:


        // Variablen deklarieren und initialisieren

        int zeile;
        int spalte;

        int spieler1 = 1;
        int spieler2 = 2;
        int counter = 1;


        // Methode gib Zeile und Spalte ein, überprüfen, ob ausgewähltes Feld bereits belegt ist


        do {
            System.out.println("Der aktuelle Spielstand ist: ");

            for (int i = 0; i < array.length; i++) {
                for (int j = 0; j < array[i].length; j++) {
                    System.out.print(array[i][j]);
                }
                System.out.println();
            }

            Scanner scanner1 = new Scanner(System.in);
            System.out.println("Geben Sie die Zeile an (0, 1, 2) ");

            zeile = scanner1.nextInt();
            System.out.println("Geben Sie die Spalte an (0, 1, 2) ");

            spalte = scanner1.nextInt();

//            for ( int i = 0; i < array.length; i++) {
//                for (int j = 0; j < array[i].length; j++) {
            // prüfen ob das Feld schon belegt ist
//            do {
            if (array[zeile][spalte] != 0) {
                System.out.println("Wählen Sie ein anderes Feld aus, dieses ist schon belegt.");

                System.out.println("Geben Sie die Zeile an (0, 1, 2) ");

                zeile = scanner1.nextInt();
                System.out.println("Geben Sie die Spalte an (0, 1, 2) ");

                spalte = scanner1.nextInt();
            }


            if (array[zeile][spalte] == 0) {

                //WAS wird in das Feld eingetragen? 1 oder 2 je nach Spieler
                if (counter % 2 != 0) {
                    array[zeile][spalte] = spieler1;
                }
                if (counter % 2 == 0) {
                    array[zeile][spalte] = spieler2;
                }
                counter++;
            }

//            } while (true);


            if (array[0][0] == 1 && array[1][1] == 1 && array[2][2] == 1) {
                System.out.println(" Spieler 1 hat gewonnen");
                break;
            }
            if (array[0][0] == 2 && array[1][1] == 2 && array[2][2] == 2) {
                System.out.println(" Spieler 2 hat gewonnen");
                break;
            }

            if (array[0][0] == 1 && array[1][0] == 1 && array[2][0] == 1) {
                System.out.println(" Spieler 1 hat gewonnen");
                break;
            }
            if (array[0][0] == 2 && array[1][0] == 2 && array[2][0] == 2) {
                System.out.println(" Spieler 2 hat gewonnen");
                break;
            }

            if (array[0][1] == 1 && array[1][1] == 1 && array[2][1] == 1) {
                System.out.println(" Spieler 1 hat gewonnen");
                break;
            }
            if (array[0][1] == 2 && array[1][1] == 2 && array[2][1] == 2) {
                System.out.println(" Spieler 2 hat gewonnen");
                break;
            }
            if (array[0][2] == 1 && array[1][1] == 1 && array[2][0] == 1) {
                System.out.println(" Spieler 1 hat gewonnen");
                break;
            }
            if (array[0][2] == 2 && array[1][1] == 2 && array[2][0] == 2) {
                System.out.println(" Spieler 2 hat gewonnen");
                break;
            }


            if (array[0][2] == 1 && array[1][2] == 1 && array[2][2] == 1) {
                System.out.println(" Spieler 1 hat gewonnen");
                break;
            }
            if (array[0][2] == 2 && array[1][2] == 2 && array[2][2] == 2) {
                System.out.println(" Spieler 2 hat gewonnen");
                break;
            }

            if (array[0][0] == 1 && array[0][1] == 1 && array[0][2] == 1) {
                System.out.println(" Spieler 1 hat gewonnen");
                break;
            }

            if (array[0][0] == 2 && array[0][1] == 2 && array[0][2] == 2) {
                System.out.println(" Spieler 1 hat gewonnen");
                break;
            }
            if (array[1][0] == 1 && array[1][1] == 1 && array[1][2] == 1) {
                System.out.println(" Spieler 1 hat gewonnen");
                break;
            }
            if (array[1][0] == 2 && array[1][1] == 2 && array[1][2] == 2) {
                System.out.println(" Spieler 2 hat gewonnen");
                break;
            }
            if (array[2][0] == 1 && array[2][1] == 1 && array[2][2] == 1) {
                System.out.println(" Spieler 1 hat gewonnen");
                break;
            }
            if (array[2][0] == 2 && array[2][1] == 2 && array[2][2] == 2) {
                System.out.println(" Spieler 2 hat gewonnen");
                break;
            }

            //Bedingung für untenschieden
            if (counter > 10) {
                System.out.println("Das Spiel ist unentschieden!");
                break;
            }


//Neuen Spielstand ausgeben
//                for (int i = 0; i < array.length; i++) {
//                    for (int j = 0; j < array[i].length; j++) {
//                        System.out.print(array[i][j]);
//                    }
//                    System.out.println();
//                }

// Bedingungen für Gewinner ausgeben

        } while (counter < 11);
    }
}

