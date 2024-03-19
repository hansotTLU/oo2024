package ee.tlu.salat;

// jpa moodulist pärinev. Hibernate.
// Kui räägite ChatGPT'ga:
// import javax.persistence.Table;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@AllArgsConstructor
@Table(name = "toiduaine") // vabatahtlik - nime vahetuseks
@Entity // andmebaasi panekuks
@NoArgsConstructor
public class ToiduaineEntity {
    @Id // alati unikaalne - kustutamiseks. võtmiseks, muutmiseks (nagu tavaline sql andmebaas)
    String nimetus;
    int valk;
    int rasv;
    int sysivesik;

    /*public ToiduaineEntity(String nimetus, int valk, int rasv, int sysivesik) {
        this.nimetus = nimetus;
        this.valk = valk;
        this.rasv = rasv;
        this.sysivesik = sysivesik;
    }*/
}
