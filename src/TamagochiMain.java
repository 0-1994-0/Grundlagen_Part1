public class TamagochiMain {
    public static void main(String[] args) {

        Tamagochi t1 = new Tamagochi(4, 5, 5);
        //t1.futtern(5);


        int futterstand=t1.getFutterstand();

        for (int i = 0; i < futterstand; i++) {
            if (t1.getX() != 0) {
                t1.bewegen("Links");
            }

            if (t1.getY() != 0) {
                t1.bewegen("rechts");
            }
        }
    }
}
