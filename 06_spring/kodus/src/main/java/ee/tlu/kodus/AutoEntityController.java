package ee.tlu.kodus;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "http://localhost:3000") // see ütleb, mis rakendus mulle ligi pääseb
public class AutoEntityController {

    @Autowired
    AutoRepository autoRepository;

    @GetMapping("autod") // localhost:8080/api/autod
    public List<AutoEntity> saaAutod() {
        return autoRepository.findAll();
    }

    @PostMapping("autod/{mudel}/{kw}/{mootoriSuurus}/{mootoriTyyp}") // POST localhost:8080/api/autod/MustangGT/224/4.6/V8
    public List<AutoEntity> lisaAuto(
            @PathVariable String mudel,
            @PathVariable int kw,
            @PathVariable float mootoriSuurus,
            @PathVariable String mootoriTyyp
    ) {
        AutoEntity auto = new AutoEntity(mudel, kw, mootoriSuurus, mootoriTyyp);
        autoRepository.save(auto);
        return autoRepository.findAll();
    }

    @PostMapping("autod")
    public List<AutoEntity> lisaAuto(@RequestBody AutoEntity auto) {
        autoRepository.save(auto);
        return autoRepository.findAll();
    }

    @DeleteMapping("autod/{mudel}") // DELETE localhost:8080/api/autod/0
    public List<AutoEntity> kustutaAuto(
            @PathVariable String mudel
    ) {
        autoRepository.deleteById(mudel);
        return autoRepository.findAll();
    }

    @PutMapping("autod") // localhost:8080/api/autod/1?mudel=NissanR35&kw=206&mootoriSuurus=2.8&mootoriTyyp=V6
    public List<AutoEntity> muudaAuto(
            @PathVariable int index,
            @RequestParam String mudel,
            @RequestParam int kw,
            @RequestParam float mootoriSuurus,
            @RequestParam String mootoriTyyp
    ) {
        AutoEntity auto = new AutoEntity(mudel, kw, mootoriSuurus, mootoriTyyp);
        autoRepository.save(auto);
        return autoRepository.findAll();
    }

    @GetMapping("autod/{mudel}")
    public AutoEntity saaYksAuto(
            @PathVariable String mudel
    ) {
        return autoRepository.findById(mudel).get();
    }

    @GetMapping("autod-koguarv")
    public int autodeKoguarv() {
        return autoRepository.findAll().size();
    }


    /*@GetMapping("autod/kw-summa") // localhost:8080/api/autod/kw-summa
    public int saaKWSumma() {
        int summa = 0;
        for (AutoEntity auto : autod) {
            summa += auto.kw;
        }
        return summa;
    }*/
}
