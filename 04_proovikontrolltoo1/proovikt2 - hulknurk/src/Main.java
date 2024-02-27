/*Hulknurk

1. Koosta klass, milles on üks massiiv kolmnurga x-koordinaatide hoidmiseks ning teine massiiv y-koordinaatide hoidmiseks. Koosta klassist kaks eksemplari, määra algväärtused ning trüki andmed välja.

2. Lisa klassile käsklus punkti koordinaadipaari lisamiseks. Käsklusena väljasta tekkiva hulknurga ümbermõõt (küljepikkuste summa).

3. Kuva tekkiv hulknurk graafiliselt, kirjuta külgede juurde nende pikkused ning hulknurga keskele kogu ümbermõõt.*/


import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        // 1:
        List<Integer> kolmnurk1xCoords = new ArrayList();
        kolmnurk1xCoords.add(6);
        kolmnurk1xCoords.add(8);
        kolmnurk1xCoords.add(10);

        List<Integer> kolmnurk1yCoords = new ArrayList();
        kolmnurk1yCoords.add(6);
        kolmnurk1yCoords.add(8);
        kolmnurk1yCoords.add(10);

        Kolmnurk kolmnurk = new Kolmnurk(kolmnurk1xCoords, kolmnurk1yCoords);

        System.out.println(kolmnurk.xCoords);
        System.out.println(kolmnurk.yCoords);


        int ymberm66t = kolmnurk.lisaKoordinaadid(5, 10);
        System.out.println(ymberm66t);
    }
}