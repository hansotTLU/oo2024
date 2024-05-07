package ee.tlu.kontrolltoo2.controller;

import ee.tlu.kontrolltoo2.model.Tooted.Tooted;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
public class RestTemplateController {



    // https://reqres.in/api/users?page=2
    @GetMapping("/tootajad")
    public List<String> getTootajateMeilid() {
        RestTemplate restTemplate = new RestTemplate();
        String url = "https://reqres.in/api/users?page=2";

        ResponseEntity<Map> response = restTemplate.getForEntity(url, Map.class);
        List<Map<String, Object>> tootajad = (List<Map<String, Object>>) response.getBody().get("data");

        List<String> emails = new ArrayList<>();
        for (Map<String, Object> tootaja : tootajad) {
            emails.add((String) tootaja.get("email"));
        }

        return emails;
    }


    @GetMapping("suurimaHinnagaToode")
    public Tooted getSuurimaHinnagaTooted() {
        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<Tooted[]> response = restTemplate.exchange("https://api.escuelajs.co/api/v1/products", HttpMethod.GET, null, Tooted[].class);
        Tooted suurimaHinnagaTooted = null;
        int suurim = 0;
        for (Tooted t : response.getBody()){
            if(suurim < t.getPrice()){
                suurim = t.getPrice();
                suurimaHinnagaTooted = t;
            }
        }
        return suurimaHinnagaTooted;
    }
    @GetMapping("vaikseimaHinnagaToode")
    public Tooted getVaikseimaHinnagaTooted() {
        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<Tooted[]> response = restTemplate.exchange("https://api.escuelajs.co/api/v1/products", HttpMethod.GET, null, Tooted[].class);
        Tooted vaikseimaHinnagaTooted = null;
        int vaikseim = 999;
        for (Tooted t : response.getBody()){
            if(vaikseim > t.getPrice()){
                vaikseim = t.getPrice();
                vaikseimaHinnagaTooted = t;
            }
        }
        return vaikseimaHinnagaTooted;
    }

    @GetMapping("tootedSoodsamadKui/{number}")
    public List<Tooted> getVaikseimKuiAntudHinnagaTooted(@PathVariable int number) {
        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<Tooted[]> response = restTemplate.exchange("https://api.escuelajs.co/api/v1/products", HttpMethod.GET, null, Tooted[].class);
        List<Tooted> vHinnagaTooted = new ArrayList<>();
        for (Tooted t : response.getBody()){
            if(t.getPrice() < number){
                vHinnagaTooted.add(t);
            }
        }
        return vHinnagaTooted;
    }
    @GetMapping("tootedKallimadKui/{number}")
    public List<Tooted> getSuuremKuiAntudHinnagaTooted(@PathVariable int number) {
        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<Tooted[]> response = restTemplate.exchange("https://api.escuelajs.co/api/v1/products", HttpMethod.GET, null, Tooted[].class);
        List<Tooted> sHinnagaTooted = new ArrayList<>();
        for (Tooted t : response.getBody()){
            if(t.getPrice() > number){
                sHinnagaTooted.add(t);
            }
        }
        return sHinnagaTooted;
    }
    @GetMapping("tootedHinnaVahemikus/{min}/{max}")
    public List<Tooted> getSuuremKuiAntudHinnagaTooted(@PathVariable int min, @PathVariable int  max) {
        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<Tooted[]> response = restTemplate.exchange("https://api.escuelajs.co/api/v1/products", HttpMethod.GET, null, Tooted[].class);
        List<Tooted> vahemikusHinnagaTooted = new ArrayList<>();
        for (Tooted t : response.getBody()){
            if(t.getPrice() > min && t.getPrice() < max ){
                vahemikusHinnagaTooted.add(t);
            }
        }
        return vahemikusHinnagaTooted;
    }
}
