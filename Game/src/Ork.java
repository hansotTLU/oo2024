import java.util.Random;

public class Ork extends Tegelane implements JuhuslikKoordinaat{


    public Ork(Random random, int kaardiKorgus, int kaardiLaius) {
        XCoord = saaKoordinaat(random, kaardiLaius); // initsialiseerin (annan esimest korda väärtuse)
        YCoord = saaKoordinaat(random, kaardiKorgus);
        Symbol = 'ⓞ';
    }


    public int saaKoordinaat(Random random, int kaart) {
        return random.nextInt(1, kaart - 1);
    }

}
