import java.util.Random;

public class Ork {

    int orkXCoord;
    int orkYCoord;
    char orkSymbol;

    public Ork(Random random, int kaardiKorgus, int kaardiLaius) {
        orkXCoord = saaKoordinaat(random, kaardiLaius); // initsialiseerin (annan esimest korda väärtuse)
        orkYCoord = saaKoordinaat(random, kaardiKorgus);
        orkSymbol = 'ⓞ';
    }


    private int saaKoordinaat(Random random, int kaart) {
        return random.nextInt(1, kaart - 1);
    }

}
