package ee.tlu.kodus.controller;


import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class NumbriController {
    List<Integer> numbrid = new ArrayList<>();

    @GetMapping("numbrid") // localhost:8080/numbrid
    public List<Integer> saaNumbrid() {
        return numbrid;
    }

    @PostMapping("numbrid/{number}") // POST localhost:8080/numbrid/4
    public List<Integer> lisaNumber(@PathVariable int number) {
        numbrid.add(number);
        return numbrid;
    }

    @DeleteMapping("numbrid/{index}") // DELETE localhost:8080/numbrid/1
    public List<Integer> kustutaNumber(@PathVariable int index) {
        numbrid.remove(index);
        return numbrid;
    }

    @GetMapping("numbrid/kogus") // localhost:8080/numbrid/kogus
    public int saaNumbriteKogus() {
        return numbrid.size();
    }

    @GetMapping("numbrid/summa") // localhost:8080/numbrid/summa
    public int saaNumbriteSumma() {
        int summa = 0;
        for (int i = 0; i < numbrid.size(); i++) {
            summa += numbrid.get(i);
        }
        return summa;
    }

    @GetMapping("numbrid/keskmine") // localhost:8080/numbrid/keskmine
    public float saaNumbriteKeskmine() {
        int summa = 0;
        for (int i = 0; i < numbrid.size(); i++) {
            summa += numbrid.get(i);
        }
        float keskmine = (float) summa / numbrid.size();
        return keskmine;
    }
}
