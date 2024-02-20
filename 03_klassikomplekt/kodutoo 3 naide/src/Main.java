public class Main {
    public static void main(String[] args) {
        // peab olema klassikomplekt (ühe klassi sees teine klass)

        // variant 1:
        Info info = new Info("PC", 16, "NVIDIA GTX1080");
        Arvuti arvuti = new Arvuti(info, 1050, "Ülemiste");

        arvuti.muudaPood("Mustamäe");
        arvuti.info.muudaNimetus("PC2");


        // variant 2:
        Arvuti arvuti2 = new Arvuti(
                new Info("HP", 16, "AMD 5400U"),
                1050, "Kristiine");

        arvuti2.paneAllahindlus(200);
    }
}