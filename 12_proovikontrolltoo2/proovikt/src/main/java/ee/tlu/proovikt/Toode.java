package ee.tlu.proovikt;

// Loo uus rakendus veebipood. Tee talle entity nimega "Toode", omadustega:
//      Id (automaatselt genereeritud)
//      nimetus String,
//      hind Int,
//      aktiivne
//  tee talle Repository
// kontroller, millega andmbebaasi panna, (saab panna, võtta, kustutada)
//   kuva välja front-end'is.

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.boot.convert.PeriodFormat;

@Getter
@Entity
@NoArgsConstructor
public class Toode {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nimi;
    private double hind;
    private boolean aktiivne;

    @ManyToOne
    private Kategooria kategooria;

    //  {
    //      "nimi": "Spagetid",
    //      "hind": 123,
    //      "aktiivne": true,
    //      "kategooria": {"id": 3}
    //  }
}
