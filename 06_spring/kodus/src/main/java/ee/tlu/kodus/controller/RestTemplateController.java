package ee.tlu.kodus.controller;


import ee.tlu.kodus.model.FreeGames;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
public class RestTemplateController {

    @GetMapping("freegames")
    public List<FreeGames> getFreeGamesPMs() {
        RestTemplate restTemplate = new RestTemplate();
        String url = "https://www.freetogame.com/api/games";
        ResponseEntity<FreeGames[]> response = restTemplate.exchange(url, HttpMethod.GET, null, FreeGames[].class);
        return List.of(response.getBody());
    }

    @GetMapping("freegames/{genre}")
    public List<FreeGames> getFreeGamesPMsByCountry(@PathVariable String genre) {
        RestTemplate restTemplate = new RestTemplate();
        String url = "https://www.freetogame.com/api/games";
        ResponseEntity<FreeGames[]> response = restTemplate.exchange(url, HttpMethod.GET, null, FreeGames[].class);

        List<FreeGames> freeGames = new ArrayList<>();
        for (FreeGames g : response.getBody()) {
            if (g.getGenre().equals(genre)) {
                freeGames.add(g);
            }
        }

        return freeGames;
    }
}
