public class Rezept {
    private int anzahlPersonen;
    private String[] zutatenName;
    private double[][] zutaten;

    public Rezept(int anzahlPersonen, String[] zutatenName, double[][] zutaten) {
        this.anzahlPersonen = anzahlPersonen;
        this.zutatenName = zutatenName;
        this.zutaten = zutaten;
    }

    public boolean allergisch(String zutat) {

        for (int i = 0; i < zutatenName.length; i++) {

            if (zutatenName[i].equals(zutat)) {
                return true;
            }
        }
        return false;
    }

    public boolean laktoseFrei() {

        boolean entfernt = false;

        for (int i = 0; i < zutatenName.length; i++) {
            String name = zutatenName[i].toLowerCase();

            if (name.contains("milch") || name.contains("käse")) {
                if (zutatenName[i].contains("kase")) {
                    zutaten[i][0] = 0;
                    zutaten[i][1] = 0;
                    return true;
                }
            }
        }
        return entfernt;
    }

    public double kostet() {
        double sum = 0;
        for (int i = 0; i < zutaten.length; i++) {
            sum = sum + zutaten[i][1];

        }
        return sum;
    }

    public double menge(){
        double amount=0;
        for (int i=0; i<zutaten.length;i++){
            amount=amount+zutaten[i][0];
        }

        return amount;
    }

    public double kostetProPerson() {

        return kostet() / anzahlPersonen;

    }

    public void aenderePersonen(int anzahl) {

        double faktor =anzahl/anzahlPersonen;


        while (anzahl > 0) {
            for (int i = 0; i < zutaten.length; i++) {

                zutaten[i][0]= zutaten[i][0]*faktor;
                zutaten[i][1]=zutaten [i][1]*faktor;
                }
            }

       anzahlPersonen=anzahl;
    }


    public int getAnzahlPersonen() {
        return anzahlPersonen;
    }

    public void setAnzahlPersonen(int anzahlPersonen) {
        this.anzahlPersonen = anzahlPersonen;
    }

    public String[] getZutatenName() {
        return zutatenName;
    }

    public void setZutatenName(String[] zutatenName) {
        this.zutatenName = zutatenName;
    }

    public double[][] getZutaten() {
        return zutaten;
    }

    public void setZutaten(double[][] zutaten) {
        this.zutaten = zutaten;
    }
}