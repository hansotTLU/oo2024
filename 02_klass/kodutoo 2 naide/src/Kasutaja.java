public class Kasutaja {
    String nimi;
    boolean aktiivne;
    int vanus;
    char lyhend;
    double raha;

    // right click -> generate -> constructor (vali kõik asjad(shift ja alumisele))
    public Kasutaja(String nimi, boolean aktiivne, int vanus, char lyhend, double raha) {
        this.nimi = nimi;
        this.aktiivne = aktiivne;
        this.vanus = vanus;
        this.lyhend = lyhend;
        this.raha = raha;
    }

    public void muudaAktiivne() {
        aktiivne = !aktiivne;
    }

    public double lisaRaha(double summa) {
        raha = raha + summa;
        return raha;
    }
}
