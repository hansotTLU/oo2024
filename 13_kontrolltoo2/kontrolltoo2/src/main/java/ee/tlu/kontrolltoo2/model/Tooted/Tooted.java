package ee.tlu.kontrolltoo2.model.Tooted;

import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.List;

@Getter
@NoArgsConstructor
public class Tooted {
    private int id;
    private String title;
    private int price;
    private String description;
    private List<String> images;
    private Date creationAt;
    private Date updatedAt;
    private Kategooria kategooria;
}
