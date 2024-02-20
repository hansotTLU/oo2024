import java.util.Random;

public class Ese {
    String nimetus;
    double tugevus;
    int kasutuskorrad;
    boolean aktiivne;
    int XCoord;
    int YCoord;
    char Symbol;

    public Ese(String nimetus, double tugevus, int kasutuskorrad, Random random, Maailm maailm) {
        this.nimetus = nimetus;
        this.tugevus = tugevus;
        this.kasutuskorrad = kasutuskorrad;
        this.aktiivne = true;
        XCoord = saaKoordinaat(random, maailm.kaardiLaius);
        YCoord = saaKoordinaat(random, maailm.kaardiKorgus);
        this.Symbol = '▪';
    }

    public void hit() {
        System.out.println("Lõid vastast!");
    }

    private int saaKoordinaat(Random random, int kaart) { //main'i sees on static ka, klasside see ei ole
        return random.nextInt(1, kaart - 1);
    }
}
