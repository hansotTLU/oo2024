public class Auto {
    String mark;
    String mudel;
    int aasta;
    String värv;
    Modifikatsioon modifikatsioon;

    public Auto(String mark, String mudel, int aasta, String värv) {
        this.mark = mark;
        this.mudel = mudel;
        this.aasta = aasta;
        this.värv = värv;
    }

    public void lisaModifikatsioon(String nimetus, int hind) {
        modifikatsioon = new Modifikatsioon(nimetus, hind);
    }
}