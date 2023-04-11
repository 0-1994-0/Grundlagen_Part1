public class QuaderMain {
    public static void main(String[] args) {

        Quader q1 =new Quader(2.0,3.0,4.0);


        System.out.println("Grundflaeche :"+ q1.grundflaeche());
        System.out.println("Volumen: "+ q1.volumen());
        System.out.println("Oberflaeche: "+ q1.oberflaeche());
        q1.skaliere(2);
        System.out.println("Grundflaeche nach Skalierung :"+ q1.grundflaeche());
        System.out.println("Volumen: "+q1.volumen());
        System.out.println("Oberflaeche: "+q1.oberflaeche());
    }
}
