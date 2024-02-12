//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        double autoHP = saaAutoHP(224);
        System.out.println(autoHP);
        double autoHP2 = saaAutoHP(89);
        System.out.println(autoHP2);

        System.out.println();

        prindiTervitus("Ken");
        prindiTervitus("Hans");

        System.out.println();

        String aeg = saaAeg(9);
        System.out.println(aeg);
        String aeg2 = saaAeg(22);
        System.out.println(aeg2);
    }



    private static double saaAutoHP(double autoKW) {
        return autoKW * 1.36;
    }

    private static void prindiTervitus(String nimi) {
        System.out.println("Tere, " + nimi + "!");
    }

    private static String saaAeg(double tund) {
        if (tund < 12) {
            return "Hommik";
        } else if (tund < 18) {
            return "Päev";
        } else {
            return "Õhtu";
        }
    }
}