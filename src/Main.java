import java.util.Scanner;

public class Main {


    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Gib eine Vorname ein: ");
        String vorname = input.next();
        System.out.println("Gib eine Nachname ein: ");
        String nachname = input.next();

        int a = 20;
        boolean b = false;

        b = a >= 110;

        System.out.println(b);

       // String vorname = "Aurélie";

       // String nachname = "Zouaoui";

        String name = vorname + "  "+nachname;

        boolean bool;

        System.out.println(vorname + " " + nachname+ " " + name);
        System.out.println(vorname.concat(nachname));
        System.out.println("Willkommen " + name.toUpperCase());

        bool = name.length()>10;
        System.out.println(bool);




        for (int i =0; i<name.length();i++){
            System.out.println(i);
        }


        if (name.length()>10){
            System.out.println(true);
            } else {
            System.out.println(false);
        }

        System.out.println("Geben Sie eine Zahl ein: ");
        int nummer = input.nextInt();

        if (nummer>5){
            System.out.println("Zahl ist größer als 5");
        } else if (nummer<5){
            System.out.println("Zahl kleiner als 5");
        } else {
            System.out.println("Zahl ist 5");
        }
    }






}




