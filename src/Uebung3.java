import java.util.Scanner;

public class Uebung3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your account balance: ");
        int balance;
        balance = scanner.nextInt();
        int choice = 0;

        while (choice != 4) {
            System.out.println("Menu:");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Check balance");
            System.out.println("4. Exit");
            System.out.println("Enter your choice: ");
            choice = scanner.nextInt();


            switch (choice) {

                case 1:
                    System.out.println("Betrag eingeben: ");
                    int deposit = scanner.nextInt();
                    balance = deposit + balance;
                    System.out.println("Der Kontostand beträgt: " + balance);
                    break;
                case 2:
                    System.out.println("Betrag eingeben: ");
                    int withdraw = scanner.nextInt();
                    balance = balance - withdraw;
                    System.out.println("Der Kontostand beträgt: " + balance);
                    break;
                case 3:
                    System.out.println(balance);
                    break;
                case 4:
                    System.out.println("");
                    System.exit(0);
                    break;

            }
        }
    }
}