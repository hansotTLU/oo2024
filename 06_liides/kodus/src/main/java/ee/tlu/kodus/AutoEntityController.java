package ee.tlu.kodus;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")
public class AutoEntityController {

    List<AutoEntity> autod = new ArrayList<>();

    @GetMapping("autod") // localhost:8080/api/autod
    public List<AutoEntity> saaAutod() {
        return autod;
    }

    @PostMapping("autod/{mudel}/{kw}/{mootoriSuurus}/{mootoriTyyp}") // POST localhost:8080/api/autod/MustangGT/224/4.6/V8
    public List<AutoEntity> lisaAuto(
            @PathVariable String mudel,
            @PathVariable int kw,
            @PathVariable float mootoriSuurus,
            @PathVariable String mootoriTyyp
    ) {
        AutoEntity auto = new AutoEntity(mudel, kw, mootoriSuurus, mootoriTyyp);
        autod.add(auto);
        return autod;
    }

    @DeleteMapping("autod/{index}") // DELETE localhost:8080/api/autod/0
    public List<AutoEntity> kustutaAuto(
            @PathVariable int index
    ) {
        autod.remove(index);
        return autod;
    }

    @PutMapping("autod/{index}") // localhost:8080/api/autod/1?mudel=NissanR35&kw=206&mootoriSuurus=2.8&mootoriTyyp=V6
    public List<AutoEntity> muudaAuto(
            @PathVariable int index,
            @RequestParam String mudel,
            @RequestParam int kw,
            @RequestParam float mootoriSuurus,
            @RequestParam String mootoriTyyp
    ) {
        AutoEntity auto = new AutoEntity(mudel, kw, mootoriSuurus, mootoriTyyp);
        autod.set(index, auto);
        return autod;
    }

    @GetMapping("autod/kw-summa") // localhost:8080/api/autod/kw-summa
    public int saaKWSumma() {
        int summa = 0;
        for (AutoEntity auto : autod) {
            summa += auto.kw;
        }
        return summa;
    }
}
