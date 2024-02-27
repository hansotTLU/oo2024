

import java.util.List;

public class Kolmnurk {
    // 1:
    List<Integer> xCoords;
    List<Integer> yCoords;

    public Kolmnurk(List<Integer> xCoords, List<Integer> yCoords) {
        this.xCoords = xCoords;
        this.yCoords = yCoords;
    }

    // 2:
    public int lisaKoordinaadid(int newXCoord, int newYCoord){
        xCoords.add(newXCoord);
        yCoords.add(newYCoord);


        // pole päris see mida on mõeldud, lih näide kuidas listi läbi käia
        int summa = 0;
        for (int x: xCoords){
            summa += x;
        }
    /*  for (int i = 0; i < xCoords.size(); i++) {
            summa += xCoords.get(i);
        }   kuidas sama asja fori'ga teha*/
        return summa;
    }
}