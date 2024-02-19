public class Main {
    public static void main(String[] args) {
        Auto auto = new Auto("Ford Mustang GT", false, 2006, 'B', 2000);
        Auto auto2 = new Auto("Toyota Auris", true, 2014, 'D', 13000);

        auto.muudaTookorras();
        System.out.println(auto.mudel + "  töökorras: " + auto.tookorras);
        double auto2Hind = auto2.tostaHind(500);
        System.out.println(auto2.mudel + "  hind: " + auto2Hind);
    }
}