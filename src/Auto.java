public class Auto {

    private String marke;
    private String modell;
    private int jahr;
   private double geschwindigkeit;

    public Auto(String marke, String modell, int jahr,double geschwindigkeit) {
        this.marke = marke;
        this.modell = modell;
        this.jahr = jahr;
        this.geschwindigkeit = geschwindigkeit;
    }
    public String getMarke() {
        return marke;
    }

    public void setMarke(String marke) {
        this.marke = marke;
    }
    public String getModell() {
        return modell;
    }
    public void setModell(String modell) {
        this.modell = modell;
    }

    public int getJahr() {
        return jahr;
    }

    public void setJahr(int jahr) {
        this.jahr = jahr;
    }

    public double getGeschwindigkeit() {
        return geschwindigkeit;
    }

    public void setGeschwindigkeit(double geschwindigkeit) {
        this.geschwindigkeit = geschwindigkeit;
    }

    public void gasGeben (double geschw){
       geschwindigkeit =geschwindigkeit+geschw;
    }

    public void bremsen(double geschw){
        geschwindigkeit=geschwindigkeit-geschw;
    }

    public String toString(){
       return "Marke: " + marke+ ",Modell: "+ modell+ ",Jahr: "+jahr+ ",Geschwindigkeit: "+geschwindigkeit;
        //System.out.println("Marke: " + getMarke()+ ",Modell: "+ getModell()+ ",Jahr: "+ getJahr()+ ",Geschwindigkeit: "+getGeschwindigkeit());


    }

}
