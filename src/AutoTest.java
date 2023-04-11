public class AutoTest {
    public static void main(String[] args) {


        Auto auto1 = new Auto("Toyota", "Camry", 2018,40);

        auto1.toString();
        //auto1.getGeschwindigkeit();
        auto1.gasGeben(4);
        System.out.println(auto1.toString());
        auto1.bremsen(7);
        System.out.println(auto1.toString());

    }
}
