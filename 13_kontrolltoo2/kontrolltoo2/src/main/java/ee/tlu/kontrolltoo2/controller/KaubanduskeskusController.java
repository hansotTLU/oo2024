package ee.tlu.kontrolltoo2.controller;

import ee.tlu.kontrolltoo2.entity.Kaubanduskeskus;
import ee.tlu.kontrolltoo2.entity.Pood;
import ee.tlu.kontrolltoo2.repository.KaubanduskeskusRepository;
import ee.tlu.kontrolltoo2.repository.PoodRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
public class KaubanduskeskusController {
    @Autowired
    KaubanduskeskusRepository kaubanduskeskusRepository;

    @Autowired
    private PoodRepository poodRepository;

    @GetMapping("kaubanduskeskus")
    public List<Kaubanduskeskus> getKaubanduskeskus() {
        return kaubanduskeskusRepository.findAll();
    }

    @PostMapping("kaubanduskeskus")
    public List<Kaubanduskeskus> postKaubanduskeskus(@RequestBody Kaubanduskeskus kaubanduskeskus) {
        kaubanduskeskusRepository.save(kaubanduskeskus);
        return kaubanduskeskusRepository.findAll();
    }

    @DeleteMapping("kaubanduskeskus/{id}")
    public List<Kaubanduskeskus> deleteKaubanduskeskus(@PathVariable Long id) {
        kaubanduskeskusRepository.deleteById(id);
        return kaubanduskeskusRepository.findAll();
    }

    @GetMapping("kaubanduskeskus/{kaubanduskeskus}")
    public List<Pood> getPoedKaubanduskeskuses(@PathVariable String nimetus) {
        return poodRepository.findByKaubanduskeskus_Nimetus(nimetus);
    }

    @GetMapping("kaubanduskeskus/{kaubanduskeskus}/{kell}")
    public List<Pood> getPoedKaubanduskeskusesKellaajal(@PathVariable String nimetus, @PathVariable Long kell) {
        return poodRepository.findByKaubanduskeskus_NimetusAndAvamineLessThanEqualAndSulgemineGreaterThanEqual(nimetus, kell, kell);
    }
}
