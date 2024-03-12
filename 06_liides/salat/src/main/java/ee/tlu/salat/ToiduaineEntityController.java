package ee.tlu.salat;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")
public class ToiduaineEntityController {

    List<ToiduaineEntity> toiduained = new ArrayList<>(); // imiteerime andmebaasi

    // localhost:8080/api/toiduained  ---> []
    @GetMapping("toiduained")
    public List<ToiduaineEntity> saaToiduained() {
        return toiduained;
    }

    // PostMapping'ut ei saa brauser teha, saab kasutada POSTMAN'i
    // localhost:8080/api/toiduained/Kartul/10/5/5 POST
    @PostMapping("toiduained/{nimi}/{valk}/{rasv}/{sysivesik}")
    public List<ToiduaineEntity> lisaToiduaine(
            @PathVariable String nimi,
            @PathVariable int valk,
            @PathVariable int rasv,
            @PathVariable int sysivesik
    ) {
        if (valk + rasv + sysivesik > 100) {
            return toiduained;
        }
        ToiduaineEntity toiduaine = new ToiduaineEntity(nimi, valk, rasv, sysivesik);
        toiduained.add(toiduaine);
        return toiduained;
    }

    // DeleteMapping'ut ei saa brauser teha, saab kasutada POSTMAN'i
    // localhost:8080/api/toiduained/0 DELETE
    @DeleteMapping("toiduained/{index}")
    public List<ToiduaineEntity> kustutaToiduaine(
            @PathVariable int index
    ) {
        toiduained.remove(index);
        return toiduained;
    }

    // PutMapping'ut ei saa brauser teha, saab kasutada POSTMAN'i
    // localhost:8080/api/toiduained/Vorst/15/5/1
    // localhost:8080/api/toiduained?index=0&nimi=Vorst&valk=15&rasv=5&sysivesik=1   saab tühjaks jätta mingid asjad
    @PutMapping("toiduained")
    public List<ToiduaineEntity> muudaToiduaine(
            @RequestParam int index,
            @RequestParam String nimi,
            @RequestParam int valk,
            @RequestParam int rasv,
            @RequestParam int sysivesik
    ) {
        ToiduaineEntity toiduaine = new ToiduaineEntity(nimi, valk, rasv, sysivesik);
        toiduained.set(index, toiduaine);
        return toiduained;
    }

    @GetMapping("toiduained/{index}")
    public ToiduaineEntity saaYksToiduaine(
            @PathVariable int index
    ) {
        return toiduained.get(index);
    }



// koduseks tööks näide:
    @GetMapping("toiduained-koguarv")
    public int toiduaineteKoguarv() {
        return toiduained.size();
    }
}