public class Main {
    public static void main(String[] args) {
        Auto auto1 = new Auto("Ford", "Mustang GT", 2006, "must");
        auto1.lisaModifikatsioon("sportvedrustus", 1500);
        auto1.modifikatsioon.paigaldaTehaseHeliSüsteem("Shaker1000");

        Auto auto2 = new Auto("Toyota", "Auris", 2014, "hõbedane");
        auto2.lisaModifikatsioon("keretööd", 2000);
        auto2.modifikatsioon.lisaVeljed("Toyota", 14);
    }
}