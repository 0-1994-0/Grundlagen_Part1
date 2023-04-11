import java.util.Scanner;
import java.nio.file.Paths;
public class UebungPart2 {
    public static void main(String[] args) throws Exception {

        Scanner input = new Scanner(System.in);
        System.out.println("Geben Sie eine Zahl ein: ");
        int zahl = input.nextInt();
        int sum = 0;
        int counter = 1;

        while (counter <= zahl) {
            sum = sum + counter;
            counter++;
            System.out.println(sum);
        }

        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }

        for (int i = 1; i <= 30; i = i + 2) {
            System.out.println(i);
        }

        for (int i = 0; i <= 5; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" * ");
            }
            System.out.println();
        }

        boolean isHaus = false;
        boolean isA380=false;

        for (int i = 0; i < 68; i++) {
            if (i == 10 || i == 19 || i == 28 || i == 36) {
                continue;
            } if (isHaus && i == 4) {
                break;
            }
            System.out.println(i);
        }

        for (int i = 1; i < 50; i++) {
            if (i == 13 || i == 17) {
                continue;
            } if (isA380 && i==19){
                break;
            }
            System.out.println(i);
        }

String file = "C:\\Users\\aurel\\OneDrive - FH JOANNEUM\\Dokumente\\ZAM\\faust.txt";

        Scanner BuchText= new Scanner(Paths.get(file));

        int countWort=0;

        System.out.println("Wort: ");
        String wort = input.next().toLowerCase();
        String word;

        while (BuchText.hasNext()){
            word=BuchText.next().toLowerCase();

            if (word.equals(wort)) {
                countWort++;
            }


            System.out.println(countWort);


        }
    }


}
