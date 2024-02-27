import java.io.BufferedReader;
// import java.io.FileNotFoundException; // IOException asendab selle
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("lugemine.txt"));
        String rida = br.readLine();
        while (rida != null){
            System.out.println(rida);
            String[] s6nad = rida.split(" ");
            System.out.println(Arrays.toString(s6nad));
            System.out.println("Rida läbi!");

            double ruutu = Math.pow(s6nad.length, 2); // pole sellega seotud aga näide kuidas ruutu panna
            System.out.println(ruutu);

            double ruutjuur = Math.sqrt(s6nad.length); // pole sellega seotud aga näide kuidas ruutjuurt võtta
            System.out.println(ruutjuur);

            rida = br.readLine();
        }
    }
}

// kui konsooli tekib nt @4c873330 siis see on mälukoht