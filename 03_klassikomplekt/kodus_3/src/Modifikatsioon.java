public class Modifikatsioon {
    String muudatus;
    int hind;

    public Modifikatsioon(String muudatus, int hind) {
        this.muudatus = muudatus;
        this.hind = hind;
    }

    public void paigaldaTehaseHeliSüsteem(String brand) {
        this.hind += 500; // Tehase helisüsteem lisab 500
    }

    public void lisaVeljed(String brand, int suurus) {
        this.hind += (suurus * 100); // Iga velje suurus lisab 100
    }

    public int getHind() {
        return hind;
    }
}