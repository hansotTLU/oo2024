package ee.tlu.kodus.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@AllArgsConstructor
@Table(name = "auto") // vabatahtlik - nime vahetuseks
@Entity // andmebaasi panekuks
@NoArgsConstructor
public class AutoEntity {
    @Id
    String mudel;
    int kw;
    float mootoriSuurus;
    String mootoriTyyp;

}
