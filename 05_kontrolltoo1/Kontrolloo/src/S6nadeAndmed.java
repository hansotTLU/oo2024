import java.util.ArrayList;
import java.util.List;

public class S6nadeAndmed {
    private List<Integer> AT2htedeArvud;
    private int s6nadeArv;
    private int koguS6nadeAT2htedeArv;
    private int koguT2htedeArv;

    public S6nadeAndmed() {
        this.AT2htedeArvud = new ArrayList<>();
        this.s6nadeArv = 0;
        this.koguS6nadeAT2htedeArv = 0;
        this.koguT2htedeArv = 0;
    }

    public void s6na(String s6na) {
        int s6naAT2htedeArvV = T2htiFailis.loeKordi(s6na, 'a');
        int s6naAT2htedeArvS = T2htiFailis.loeKordi(s6na, 'A');
        int s6naKoguAT2htedeArv = s6naAT2htedeArvV + s6naAT2htedeArvS;

        AT2htedeArvud.add(s6naKoguAT2htedeArv);
        koguS6nadeAT2htedeArv += s6naKoguAT2htedeArv;
        s6nadeArv++;
        koguT2htedeArv += s6na.length();
    }

    public String prindiS6nadeAT2htedeArvud(String[] s6nad) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < s6nad.length; i++) {
            result.append(s6nad[i]).append(" - ").append(AT2htedeArvud.get(i)).append("\n");
        }
        return result.toString();
    }

    public double arvutaKeskmineAT2htedeArv() {
        return (double) koguS6nadeAT2htedeArv / s6nadeArv;
    }

    public double arvutaSuhtarv() {
        return (double) koguS6nadeAT2htedeArv / koguT2htedeArv;
    }

    public int loeAT2htedeArv(String s6na) {
        int at2htedeArv = 0;
        for (int i = 0; i < s6na.length(); i++) {
            if (s6na.charAt(i) == 'a' || s6na.charAt(i) == 'A') {
                at2htedeArv++;
            }
        }
        return at2htedeArv;
    }
}

