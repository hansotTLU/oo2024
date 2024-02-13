import java.util.Random;

public class Draakon {

    int draakonXCoord;
    int draakonYCoord;
    char draakonSymbol;

    public Draakon(Random random, int kaardiKorgus, int kaardiLaius) {
        draakonXCoord = saaKoordinaat(random, kaardiLaius); // initsialiseerin (annan esimest korda väärtuse)
        draakonYCoord = saaKoordinaat(random, kaardiKorgus);
        draakonSymbol = 'Ⓓ';
    }


    private int saaKoordinaat(Random random, int kaart) {
        return random.nextInt(1, kaart - 1);
    }

}
