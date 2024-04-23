package ee.tlu.kodus.controller;


import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
public class AutoController {
    List<String> autod = new ArrayList<>();

    @GetMapping("autod") // localhost:8080/autod
    public List<String> saaAutod() {
        return autod;
    }

    @PostMapping("autod/{auto}") // POST localhost:8080/autod/4
    public List<String> lisaAuto(@PathVariable String auto) {
        autod.add(auto);
        return autod;
    }

    @DeleteMapping("autod/{index}") // DELETE localhost:8080/autod/1
    public List<String> kustutaAuto(@PathVariable int index) {
        autod.remove(index);
        return autod;
    }

    @PutMapping("autod/{index}/{newValue}") // PUT localhost:8080/autod/1/NissanR34
    public List<String> muudaAuto(@PathVariable int index, @PathVariable String newValue) {
        autod.set(index, newValue);
        return autod;
    }

    @GetMapping("autod/{index}")
    public String saaYksAuto(@PathVariable int index) {
        return autod.get(index);
    }
}
