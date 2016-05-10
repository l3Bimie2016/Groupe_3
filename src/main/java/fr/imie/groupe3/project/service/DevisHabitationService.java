package fr.imie.groupe3.project.service;

import fr.imie.groupe3.project.dao.DevisHabitationDao;
import fr.imie.groupe3.project.dto.DevisHabitation;
import org.apache.commons.collections.IteratorUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

/**
 * Created by Axel on 10/05/2016.
 */
@Service
public class DevisHabitationService {

    @Autowired
    private DevisHabitationDao devisHabitationDao;

    public String sendDevisHabitationToVertX(DevisHabitation devisHabitation) {

        String result = null;
        RestTemplate restTemplate = new RestTemplate();
        String url = "http://localhost:8080/devisHabitation";

        result = restTemplate.postForObject(url, devisHabitation, String.class);
        return result;
    }

    public void setDevisHabitation(DevisHabitation devisHabitation) {
        devisHabitationDao.save(devisHabitation);
    }

    public void deleteDevisHabitation(DevisHabitation devisHabitation) {
        devisHabitationDao.delete(devisHabitation);
    }

    public List getListDevisHabitation(){
        return IteratorUtils.toList(devisHabitationDao.findAll().iterator());
    }
}
