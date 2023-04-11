public class Quader {
    double laenge;
    double breite;
    double hoehe;

    public Quader(double laenge, double breite, double hoehe) {
        this.laenge = laenge;
        this.breite = breite;
        this.hoehe = hoehe;
    }




    public double grundflaeche (){
        double flaeche= laenge*breite;

        return flaeche;
    }

    public void skaliere (double faktor){
        this.laenge= laenge*faktor;
        this.breite=breite*faktor;
        this.hoehe=hoehe*faktor;
    }

    public double volumen(){
        double vol = breite*laenge*hoehe;
        return vol;
    }

    public double oberflaeche (){
        double oberfla= 2*((laenge*breite)+(laenge*hoehe)+(hoehe*breite));

        return oberfla;
    }



}
