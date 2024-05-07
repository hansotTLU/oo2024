package ee.tlu.kontrolltoo2.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Tootajad {
    private int id;
    private String email;
    private String firstName;
    private String lastName;
    private String avatar;
}
