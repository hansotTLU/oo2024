public class Auto {
    String mudel;
    boolean tookorras;
    int aasta;
    char kytuseliik;
    double hind;

    // right click -> generate -> constructor (vali kõik asjad(shift ja alumisele))
    public Auto(String mudel, boolean tookorras, int aasta, char kytuseliik, double hind) {
        this.mudel = mudel;
        this.tookorras = tookorras;
        this.aasta = aasta;
        this.kytuseliik = kytuseliik;
        this.hind = hind;
    }

    public void muudaTookorras() {
        tookorras = !tookorras;
    }

    public double tostaHind(double summa) {
        hind = hind + summa;
        return hind;
    }
}
