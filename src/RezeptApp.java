public class RezeptApp {
    public static void main(String[] args) {
        String[] zutatenName = {"Nudel", "Tomatensoße", "Milch", "Parmesan"};
        double[][] zutaten = {{300, 1.0}, {100, 2.0}, {50, 0.5}, {25, 1.5}};


        Rezept rezept = new Rezept(1, zutatenName,zutaten);

        System.out.println(rezept.allergisch("KKK"));
        System.out.println(rezept.allergisch("Eier"));
        System.out.println(rezept.kostet());
        System.out.println(rezept.kostetProPerson());
        System.out.println(rezept.laktoseFrei());
        System.out.println(rezept.menge());

        rezept.aenderePersonen(1);
        rezept.aenderePersonen(10);

        System.out.println(rezept.getZutaten());

        System.out.println(rezept.getAnzahlPersonen());
        System.out.println(rezept.kostetProPerson());
        System.out.println(rezept.menge());


    }
}
