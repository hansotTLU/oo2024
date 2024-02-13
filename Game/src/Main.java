import java.util.Random;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        // klass - saab enda terve hunniku funktsioone ja muutujaid (allpool nt nimega 'random)
        Random random = new Random();

        Maailm maailm = new Maailm(5, 10);

        Mangija mangija = new Mangija(random, maailm.kaardiKorgus, maailm.kaardiLaius); //kõige vasakul pool on klass (siin nt Mangija), sulgude sees asi mida tahad nt klassile saata
        Draakon draakon = new Draakon(random, maailm.kaardiKorgus, maailm.kaardiLaius);
        Ork ork = new Ork(random, maailm.kaardiKorgus, maailm.kaardiLaius);

        Scanner scanner = new Scanner(System.in); // järgmine tund (2) selgitame

        maailm.prindiKaart(mangija, draakon, ork);
        String sisend = scanner.nextLine();
        mangija.liigu(sisend, maailm);

        while (!sisend.equals("end")) { // .equals --> ==     !m.equals() --> !=
            maailm.prindiKaart(mangija, draakon, ork);
            sisend = scanner.nextLine();
            mangija.liigu(sisend, maailm);
        }
    } // Main (args[])
} // Main ()