package ee.tlu.proovikt;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.List;

@Getter
@NoArgsConstructor
@Entity
public class Kategooria {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nimi;

    // @ManyToMany
    // List<Toode> tooted;
}




// Vanemate all on lapsed
// Tellimuste sees on tooted

// Kategooriate all on tooted
// 1. Kategooriat lisades saab lisada kõik tooted koos temaga (ManyToMany)
// 2. Kategooriat lisades on tühi array. Eraldy API otspunkt, millega saab todet sisestada (ManyToMany)
// 3. Toodet lisades lisame ka kategooria (ManyToOne)