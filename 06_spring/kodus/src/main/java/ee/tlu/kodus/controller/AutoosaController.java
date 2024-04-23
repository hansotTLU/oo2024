package ee.tlu.kodus.controller;


import ee.tlu.kodus.entity.Autoosa;
import ee.tlu.kodus.repository.AutoosaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
public class AutoosaController {

    @Autowired
    AutoosaRepository autoosaRepository;

    // http://localhost:8080/autoosad
    @GetMapping("autoosad")
    public List<Autoosa> getAutoosad() {
        return autoosaRepository.findAll();
    }


    // PathVariable: http://localhost:8080/autoosad/4
    // RequestParam: http://localhost:8080/autoosad?id=4
    @DeleteMapping("autoosad/{id}")
    public List<Autoosa> deleteAutoosa(@PathVariable Long id) {
        autoosaRepository.deleteById(id);
        return autoosaRepository.findAll();
    }

    @PostMapping("autoosad")
    public List<Autoosa> addAutoosa(@RequestBody Autoosa autoosa) {
        autoosaRepository.save(autoosa);
        return autoosaRepository.findAll();
    }
}
