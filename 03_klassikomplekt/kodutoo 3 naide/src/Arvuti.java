public class Arvuti {
    //samade spec'idega arvutid võivad olla erinevates poodides ja erinevate hindadega
    Info info;
    int hind;
    String pood;

    public Arvuti(Info info, int hind, String pood) {
        this.info = info;
        this.hind = hind;
        this.pood = pood;
    }

    public void muudaPood(String pood) {
        this.pood = pood;
    }

    public int paneAllahindlus(int allahindlus) {
        this.hind = this.hind - allahindlus;
        return this.hind;
    }
}
