import java.util.Scanner;

public class Tamagochi {
    int x = 0;
    int y =0;
    int futterstand =0;

    public Tamagochi(int x, int y, int futterstand) {
        this.x = x;
        this.y = y;
        this.futterstand = futterstand;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getFutterstand() {
        return futterstand;
    }

    public void setFutterstand(int futterstand) {
        this.futterstand = futterstand;
    }

    public void bewegen (String richtung) {
        do {

            switch (richtung) {

                case "links":
                    x = x - 1;
                    break;
                case "rechts":
                    x = x + 1;
                    break;
                case "unten":
                    y = y - 1;
                    break;
                case "oben":
                    y = y + 1;
                    break;
            }
            futterstand = futterstand - 1;

        } while (futterstand >= 1);
        System.out.println("bitte fuettern");

    }

    public void futtern (int futterstand){
        this.futterstand=this.futterstand-1;








}
}
