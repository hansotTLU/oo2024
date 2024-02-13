//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // Main class + Enda tehtud class
        // Class constructor
        // vähemalt 2 omadust
        // vähemalt 2 funktsiooni

        //Mainis vähemalt 2 instantsi temast
        //Mainis vähemalt 2 funktsiooni väljakutset
        //Vähemalt 2 System.out.println()

        Kasutaja kasutaja = new Kasutaja("Hans", true, 20, "H", 0);
        Kasutaja kasutaja2 = new Kasutaja("Peeter", false, 26, "P", 0);

        kasutaja.muudaAktiivne();
        System.out.println(kasutaja.aktiivne);
        double kasutaja2Raha = kasutaja2.lisaRaha(500);
        System.out.println(kasutaja2Raha);

        Tellimus tellimus1 = new Tellimus("M", 199, "CocaCola");
        Tellimus tellimus2 = new Tellimus("P", 255, "Popcorn");

        double dollarites = tellimus1.tellimuseSummaDollarites();
        System.out.println(dollarites);

        tellimus2.tellijaNimeVahetus("Y");
        System.out.println(tellimus2.tellija);
    }
}