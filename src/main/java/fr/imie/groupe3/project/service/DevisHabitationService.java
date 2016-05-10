package fr.imie.groupe3.project.service;

import fr.imie.groupe3.project.dto.DevisHabitation;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * Created by Axel on 10/05/2016.
 */
@Service
public class DevisHabitationService {

    public Integer sendDevisHabitationToVertX(DevisHabitation devisHabitation){

        RestTemplate restTemplate = new RestTemplate();
        String url = "http://localhost:8080/devisHabitation";
        return restTemplate.postForObject(url, devisHabitation, Integer.class);
    }
}
