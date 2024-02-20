import java.util.Random;

public class Draakon extends Tegelane implements JuhuslikKoordinaat{

    public Draakon(Random random, int kaardiKorgus, int kaardiLaius) {
        XCoord = saaKoordinaat(random, kaardiLaius); // initsialiseerin (annan esimest korda väärtuse)
        YCoord = saaKoordinaat(random, kaardiKorgus);
        Symbol = 'Ⓓ';
    }


    public int saaKoordinaat(Random random, int kaart) {
        return random.nextInt(1, kaart - 1);
    }

}
