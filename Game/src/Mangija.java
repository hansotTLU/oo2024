import java.util.Random;

public class Mangija {
    int XCoord; // deklareeron (loob + mälukoht)
    int YCoord;
    char Symbol;
    Suund suund;

    public Mangija(Random random, int kaardiKorgus, int kaardiLaius) {
        XCoord = saaKoordinaat(random, kaardiLaius); // initsialiseerin (annan esimest korda väärtuse)
        YCoord = saaKoordinaat(random, kaardiKorgus);
        Symbol = '☺';
        suund = Suund.YLES;
    }

    public void liigu(String sisend, Maailm maailm) {
        switch (sisend) {
            case "w" -> suund = Suund.YLES;
            case "s" -> suund = Suund.ALLA;
            case "a" -> suund = Suund.VASAKULE;
            case "d" -> suund = Suund.PAREMALE;
        } // switch() kinniminek
        switch (suund) {
            case YLES -> {
                if (YCoord > 1) YCoord--;
            }
            case ALLA -> {
                if (YCoord < maailm.kaardiKorgus - 1) YCoord++;
            }
            case VASAKULE -> {
                if (XCoord > 1) XCoord--;
            }
            case PAREMALE -> {
                if (XCoord < maailm.kaardiLaius - 1) XCoord++;
            }
        }
    } // liigu() kinniminek

    private int saaKoordinaat(Random random, int kaart) { //main'i sees on static ka, klasside see ei ole
        return random.nextInt(1, kaart - 1);
    }
} // <-- Mangija kinniminek
