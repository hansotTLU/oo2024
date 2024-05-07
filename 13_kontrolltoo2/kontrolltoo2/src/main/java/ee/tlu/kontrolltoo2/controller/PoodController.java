package ee.tlu.kontrolltoo2.controller;

import ee.tlu.kontrolltoo2.entity.Pood;
import ee.tlu.kontrolltoo2.repository.PoodRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
public class PoodController {

    @Autowired
    PoodRepository poodRepository;

    @GetMapping("pood")
    public List<Pood> getPoed() {
        return poodRepository.findAll();
    }

    @DeleteMapping("pood/{id}")
    public List<Pood> deletePood(@PathVariable Long id) {
        poodRepository.deleteById(id);
        return poodRepository.findAll();
    }

    @PostMapping("pood")
    public List<Pood> addPood(@RequestBody Pood pood) {
        poodRepository.save(pood);
        return poodRepository.findAll();
    }


    @GetMapping("pood/{kell}")
    public List<Pood> getPoedKellaajal(@PathVariable Long kell) {
        return poodRepository.findByAvamineLessThanEqualAndSulgemineGreaterThanEqual(kell, kell);
    }

    @PutMapping("pood/{nimetus}")
    public List<Pood> incrementVisitors(@PathVariable String nimetus) {
        Pood pood = poodRepository.findByNimetus(nimetus);
        if (pood != null) {
            pood.setKulastajad(pood.getKulastajad() + 1);
            poodRepository.save(pood);
        }
        return poodRepository.findAll();
    }

    @GetMapping("pood/populaarseim")
    public Pood getPopulaarseimPood() {
        return poodRepository.findFirstByOrderByKulastajadDesc();
    }
}
