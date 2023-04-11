public class Cooking {

    private int age;
    private boolean vegan;
    private boolean veggie;
    private int activePerWeek;


    String firstBox(int age, boolean vegan, boolean veggie, int activePerWeek) {
        if (vegan == true) {
            return "Vegan";
        }
        if (veggie == true) {
            return "Veggie";
        }
        if (age <= 60 && activePerWeek >= 4) {
            return "Fish";
        } else if (age <= 20 && age > 60) {
            return "Veggie";
        } else {
            return "Vegane";
        }
    }

    double[] suggestPrice(String box, int age) {
        double [] preis2 =new double[2];

        switch (box) {
            case "Fish":
                if (age <= 25) {
                    double[] preis = {39.90, 80};
                    System.out.println("Erste vier Woche "+  preis[0]+" danach "+ preis[1]);
                    preis[0]=39.90;
                    preis[1]=49.90;
                } else {
                    double[] preis = {49.90, 80};
                    System.out.println("Erste vier Woche "+  preis[0]+" danach "+ preis[1]);
                }
                break;
            case "Veggie":
                if (age <= 25 && age > 60) {
                    double[] preis = {19.90, 42};
                    System.out.println("Erste vier Woche "+  preis[0]+" danach "+ preis[1]);
                } else {
                    double[] preis = {29.90, 42};
                    System.out.println("Erste vier Woche "+  preis[0]+" danach "+ preis[1]);
                }
                break;
            case "Vegan":
                if (age < 30) {
                    double[] preis = {45, 49.90};
                    System.out.println("Erste vier Woche "+  preis[0]+" danach "+ preis[1]);
                } else {
                    double[] preis = {15, 49.90};
                    System.out.println("Erste vier Woche "+  preis[0]+" danach "+ preis[1]);
                }
                break;
        }
        return null;
    }
}