public class Modifikatsioon {
    String nimetus;
    int hind;

    public Modifikatsioon(String nimetus, int hind) {
        this.nimetus = nimetus;
        this.hind = hind;
    }

    public void paigaldaHeliSüsteem(String brand) {
        this.hind += 500; // Helisüsteem lisab 500
    }

    public void lisaVeljed(String brand, int suurus) {
        this.hind += (suurus * 100); // Iga velje suurus lisab 100
    }

    public int getHind() {
        return hind;
    }
}