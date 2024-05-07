package ee.tlu.kontrolltoo2.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@Entity
@NoArgsConstructor
public class Pood {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nimetus;
    private Long avamine;
    private Long sulgemine;
    private Long kulastajad;

    @ManyToOne
    private Kaubanduskeskus kaubanduskeskus;

//    {
//        "nimetus": "Euronics",
//            "avamine": 9,
//            "sulgemine": 20,
//            "kulastajad": 500,
//            "kaubanduskeskus": {"id": 1}
//    }

    public void setKulastajad(Long kulastajad) {
        this.kulastajad = kulastajad;
    }


}
