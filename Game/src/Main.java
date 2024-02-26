import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        // klass - saab enda terve hunniku funktsioone ja muutujaid (allpool nt nimega 'random)
        Random random = new Random();

        Maailm maailm = new Maailm(5, 10);

        Mangija mangija = new Mangija(random, maailm.kaardiKorgus, maailm.kaardiLaius); // kõige vasakul pool on klass (siin nt Mangija), sulgude sees asi mida tahad nt klassile saata
        Draakon draakon = new Draakon(random, maailm.kaardiKorgus, maailm.kaardiLaius);
        Ork ork = new Ork(random, maailm.kaardiKorgus, maailm.kaardiLaius);
        List<Tegelane> tegelased = new ArrayList<>();
        tegelased.add(mangija);
        tegelased.add(draakon);
        tegelased.add(ork);

        Ese m66k = new Ese("Mõõk", 10, 1, random, maailm);
        Ese haamer = new Ese("Haamer", 5, 3, random, maailm);
        Ese saabas = new Ese("Saabas", 1, 5, random, maailm);
        List<Ese> esemed = new ArrayList<>();
        //    List<Integer> t2isarvulised;
        //    List<String> s6nalised;
        esemed.add(m66k);
        esemed.add(haamer);
        esemed.add(saabas);

        Scanner scanner = new Scanner(System.in); // tund 2 selgitame

        maailm.prindiKaart(tegelased, esemed);
        String sisend = scanner.nextLine();
        mangija.liigu(sisend, maailm);

        while (!sisend.equals("end")) { // .equals --> ==     !m.equals() --> !=
            maailm.prindiKaart(tegelased, esemed);
            sisend = scanner.nextLine();
            mangija.liigu(sisend, maailm);
            for (Ese e: esemed) {
                if (mangija.XCoord == e.XCoord && mangija.YCoord == e.YCoord) {
                    mangija.ese = e;
                    System.out.println("Korjasid üles eseme: " + e.nimetus);
                    break;
                }
            }
            // JavaScript: esemed.forEach(e => { if ( e.xCoord && e.yCoord)})
        }
    } // Main (args[])
} // Main ()