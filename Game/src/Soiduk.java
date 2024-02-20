import java.util.Random;

public class Soiduk {
    int kiirus;
    String nimetus;
    int XCoord;
    int YCoord;
    int Symbol;

    public Soiduk(int kiirus, String nimetus, Random random, Maailm maailm) {
        this.kiirus = kiirus;
        this.nimetus = nimetus;
        // this.xCoord = saaKoordinaat()
        this.Symbol = '➤';
    }
}
