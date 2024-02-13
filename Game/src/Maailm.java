public class Maailm {
    int kaardiKorgus;
    int kaardiLaius;

    public Maailm(int korgus, int laius) {
        kaardiKorgus = korgus;
        kaardiLaius = laius;
    }

    public void prindiKaart(Mangija mangija, Draakon draakon, Ork ork) {
        for (int y = 0; y < kaardiKorgus; y++) {
            for (int x = 0; x < kaardiLaius; x++) {
                char symbol = ' ';

                if (y == 0 || y == kaardiKorgus -1) {
                    // System.out.print('-');
                    symbol = '-';
                } else if (x == 0 || x == kaardiLaius -1) {
                    // System.out.print('|');
                    symbol = '|';
                } else {
                    if (x == mangija.XCoord && y == mangija.YCoord) {
                        // System.out.print(mangijaSymbol);
                        symbol = mangija.Symbol;
                    } else if (x == draakon.draakonXCoord && y == draakon.draakonYCoord) {
                        // System.out.print(draakonSymbol);
                        symbol = draakon.draakonSymbol;
                    } else if (x == ork.orkXCoord && y == ork.orkYCoord) {
                        // System.out.print(orkSymbol);
                        symbol = ork.orkSymbol;
                    } else {
                        // System.out.print(' ');
                        symbol = ' ';
                    }
                }
                System.out.print(symbol);
            }
            System.out.println();
        }
    }
}
