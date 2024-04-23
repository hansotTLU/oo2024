package ee.tlu.kodus.controller;

import ee.tlu.kodus.entity.Autoosa;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class AutoosaController2 {
    List<Autoosa> autoosad = new ArrayList<>();

    @PostMapping("autoosa")
    public List<Autoosa> lisaAutoosa(@RequestBody Autoosa osa){
        autoosad.add(osa);
        return autoosad;
    }

    @PutMapping ("autoosa/{index}")
    public List<Autoosa> lisaAutoosa(@PathVariable int index, @RequestBody Autoosa osa){
        autoosad.set(index, osa);
        return autoosad;
    }
}
