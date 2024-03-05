import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("tekst.txt"));
        String rida = br.readLine();

        int kokkuAT2hti = 0;


        // 1.
        while (rida != null){
            int reasAT2htiV = T2htiFailis.loeKordi(rida, 'a');
            int reasAT2htiS = T2htiFailis.loeKordi(rida, 'A');
            kokkuAT2hti += reasAT2htiV;
            kokkuAT2hti += reasAT2htiS;

            rida = br.readLine();
        }

        System.out.println("A-tähti failis: " + kokkuAT2hti);


        // 2.

        // loob SõnadeAndmed objekti
        S6nadeAndmed s6nadeAndmed = new S6nadeAndmed();

        // teeb väljundfaili
        PrintWriter pw = new PrintWriter(new FileWriter("valjund.txt"));

        // loeb tekstifailist iga sõna kohta a-tähtede arvu
        BufferedReader br2 = new BufferedReader(new FileReader("tekst.txt"));
        String rida2 = br2.readLine();
        StringBuilder koguRida = new StringBuilder();
        while (rida2 != null) {
            koguRida.append(rida2).append(" ");
            rida2 = br2.readLine();
        }
        String[] s6nad = koguRida.toString().split(" ");

        // prindib ülemise välja
        for (String s6na : s6nad) {
            s6nadeAndmed.s6na(s6na);
        }
        System.out.println(s6nadeAndmed.prindiS6nadeAT2htedeArvud(s6nad));

        String s6nadeAT2htedeArvud = s6nadeAndmed.prindiS6nadeAT2htedeArvud(s6nad);
        pw.println(s6nadeAT2htedeArvud);


        // väljastab keskmise a-tähtede arvu sõnades
        double keskmineAT2htedeArv = s6nadeAndmed.arvutaKeskmineAT2htedeArv();
        System.out.println("Keskmine a-tähtede arv sõnades: " + keskmineAT2htedeArv);
        pw.println("Keskmine a-tähtede arv sõnades: " + keskmineAT2htedeArv);

        // väljastame suhtarvu a-tähtede arvu sõnades tähtede üldarvu suhtes
        double suhtarv = s6nadeAndmed.arvutaSuhtarv();
        System.out.println("Suhtarv a-tähtede arv sõnades tähtede üldarvu suhtes: " + suhtarv);
        pw.println("Suhtarv a-tähtede arv sõnades tähtede üldarvu suhtes: " + suhtarv);

        pw.close();


        // 3.

        // loeb kokku, mitu sõna oli ühe, kahe, kolme jne a-tähega ja koostab tekstifaili tabeli
        int[] AT2htedeArv = new int[11]; // indeks 0 - sõnade arv, kus ei ole a-tähti, indeks 1 - sõnade arv, kus on 1 a-täht, jne
        for (int i = 0; i < s6nad.length; i++) {
            int s6naAT2htedeArv = s6nadeAndmed.loeAT2htedeArv(s6nad[i]);
            if (s6naAT2htedeArv < AT2htedeArv.length) {
                AT2htedeArv[s6naAT2htedeArv]++;
            } else {
                AT2htedeArv[AT2htedeArv.length - 1]++;
            }
        }

        // kirjutab tabeli tekstifaili
        PrintWriter pw2 = new PrintWriter(new FileWriter("tabel.txt"));
        pw2.println("Tähtede arv sõnas\tSõnade arv");
        for (int i = 0; i < AT2htedeArv.length; i++) {
            pw2.println(i + "\t\t\t" + AT2htedeArv[i]);
        }
        pw2.close();
    }
}