import java.util.Scanner;

public class TicTacToe {
    public static void main(String[] args) {

        int feld[][] = {
                {0, 0, 0},
                {0, 0, 0},
                {0, 0, 0}
        };
        int playerTurn = 1;

        printBoard(feld);


        do {
            int[] coordinates = userInput(playerTurn);
            feld[coordinates[0]][coordinates[1]] = playerTurn;

            printBoard(feld);
            printIfWinner(playerTurn, feld);

            if (playerTurn == 1) {
                playerTurn = 2;
            } else if (playerTurn == 2) {
                playerTurn = 1;
            }
        } while (!gewonnen(feld) && !unentschieden(feld));
    }

    private static boolean validUserInput(int[][] feld, int[] coordinates) {
        //for (int i = 0; i < feld.length; i++) {
        //  for (int j = 0; j < feld[i].length; j++) {
        //    while (feld[i][j] != 0) {
        //      System.out.println("Feld schon belegt, bitte versuchen Sie nochmal: ");

        if (feld[coordinates[0]][coordinates[1]] == 0) {
            System.out.println("is valid");
            return true;
        }
        return false;
    }

    //  }
    //}
    //return false;
    // }
    private static void printBoard(int[][] feld) {
        for (int i = 0; i < feld.length; i++) {
            for (int j = 0; j < feld[i].length; j++) {
                if (feld[i][j] == 1) {
                    System.out.print("x ");
                } else if (feld[i][j] == 2) {
                    System.out.print("o ");
                } else {
                    System.out.print("_ ");
                }
            }
            System.out.println();
        }
    }

    private static int[] userInput(int spieler) {
        int counter = 0;
        int zeile;
        int spalte;


        do {
            Scanner scanner = new Scanner(System.in);
            System.out.println(" Spieler " + spieler + " ist dran : ");
            System.out.println(" Zeile eingeben: ");
            zeile = scanner.nextInt();
            System.out.println(" Spalte eingeben: ");
            spalte = scanner.nextInt();

            counter = counter + 1;

            int[] coordinates = {zeile, spalte};
        } while (counter < 10);

        System.out.println("unentschieden");

        return null;
    }

    private static boolean gewonnen(int[][] feld) {
        //nicht ungleich 0 sonder == 1 oder 2, dann mit if (if feld [][]==1 ... heißt Spieler 1 hat gewonnen)

        //if (feld[0][0] == 2 && feld[0][0] == feld[0][1] && feld[0][0] == feld[0][2] ||
        //      feld[1][0] == 2 && feld[1][0] == feld[1][1] && feld[1][0] == feld[1][2] ||
        //    feld[2][0] == 2 && feld[2][0] == feld[2][1] && feld[2][0] == feld[2][2] ||
        //  feld[2][0] == 2 && feld [2][0] == feld [2][1] && feld [2][0]==feld[2][2]||
        //feld[0][0]==2 && feld [0][0]== feld[1][0] && feld [0][0] == feld[2][0] ||
        //feld[0][1]==2 && feld [0][1]==feld[1][1] && feld [0][1]== feld[2][1] ||
        //feld [0][2]=2 && feld [0][2]== feld[1][2] && feld [0][2]==feld[2][2]
        //)
        if (feld[0][0] == 1 && feld[1][1] == 1 && feld[2][2] == 1) {
            System.out.println(" Spieler 1 hat gewonnen");
        }
        if (feld[0][0] == 2 && feld[1][1] == 2 && feld[2][2] == 2) {
            System.out.println(" Spieler 2 hat gewonnen");
        }

        if (feld[0][0] == 1 && feld[1][0] == 1 && feld[2][0] == 1) {
            System.out.println(" Spieler 1 hat gewonnen");
        }
        if (feld[0][0] == 2 && feld[1][0] == 2 && feld[2][0] == 2) {
            System.out.println(" Spieler 2 hat gewonnen");
        }

        if (feld[0][1] == 1 && feld[1][1] == 1 && feld[2][1] == 1) {
            System.out.println(" Spieler 1 hat gewonnen");
        }
        if (feld[0][1] == 2 && feld[1][1] == 2 && feld[2][1] == 2) {
            System.out.println(" Spieler 2 hat gewonnen");
        }

        if (feld[0][2] == 1 && feld[1][1] == 1 && feld[2][0] == 1) {
            System.out.println(" Spieler 1 hat gewonnen");
        }
        if (feld[0][2] == 2 && feld[1][1] == 2 && feld[2][0] == 2) {
            System.out.println(" Spieler 2 hat gewonnen");
        }

        if (feld[0][2] == 1 && feld[1][2] == 1 && feld[2][2] == 1) {
            System.out.println(" Spieler 1 hat gewonnen");
        }
        if (feld[0][2] == 2 && feld[1][2] == 2 && feld[2][2] == 2) {
            System.out.println(" Spieler 2 hat gewonnen");
        }

        if (feld[0][0] == 1 && feld[0][1] == 1 && feld[0][2] == 1) {
            System.out.println(" Spieler 1 hat gewonnen");
        }

        if (feld[0][0] == 2 && feld[0][1] == 2 && feld[0][2] == 2) {
            System.out.println(" Spieler 1 hat gewonnen");
        }
        if (feld[1][0] == 1 && feld[1][1] == 1 && feld[1][2] == 1) {
            System.out.println(" Spieler 1 hat gewonnen");
        }
        if (feld[1][0] == 2 && feld[1][1] == 2 && feld[1][2] == 2) {
            System.out.println(" Spieler 2 hat gewonnen");
        }
        if (feld[2][0] == 1 && feld[2][1] == 1 && feld[2][2] == 1) {
            System.out.println(" Spieler 1 hat gewonnen");
        }
        if (feld[2][0] == 2 && feld[2][1] == 2 && feld[2][2] == 2) {
            System.out.println(" Spieler 2 hat gewonnen");
        }
        return false;
    }


    private static boolean unentschieden(int[][] feld) {
        return alleFelderBelegt(feld) && gewonnen(feld);
    }

    private static boolean alleFelderBelegt(int[][] feld) {
        boolean alleBelegt = false;

        for (int i = 0; i < feld.length; i++) {
            for (int j = 0; j < feld[i].length; j++) {
                if (feld[i][j] == 1 || feld[i][j] == 2) {
                    alleBelegt = true;
                }
            }
        }

        if (alleBelegt) {
            System.out.println("Unentschieden!");
        }

        return alleBelegt;
    }

    private static void printIfWinner(int spieler, int[][] feld) {
        if (gewonnen(feld)) {
            System.out.println("Spieler " + spieler + " hat gewonnen!");
        }
    }
}