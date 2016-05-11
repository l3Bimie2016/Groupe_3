package fr.imie.groupe3.project.service;

import fr.imie.groupe3.project.dao.DevisHabitationDao;
import fr.imie.groupe3.project.dto.DevisHabitation;
import fr.imie.groupe3.project.dto.Tuple;
import org.apache.commons.collections.IteratorUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Axel on 10/05/2016.
 */
@Service
public class DevisHabitationService {

    @Autowired
    private DevisHabitationDao devisHabitationDao;

    public String setDevisHabitationToVertX(DevisHabitation devisHabitation) {

        String result = null;
        RestTemplate restTemplate = new RestTemplate();
        String url = "http://localhost:8080/devisHabitation";

        result = restTemplate.postForObject(url, devisHabitation, String.class);
        return result;
    }

    public List getDevisHabitationToVertX() {

        RestTemplate restTemplate = new RestTemplate();
        String url = "http://localhost:8080/devisHabitation";
        return restTemplate.getForObject(url, List.class);
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

    public List getResume(DevisHabitation devisHabitation) {
        List<Tuple> listes = new ArrayList<>();
        Field[] fields = DevisHabitation.class.getDeclaredFields();
        for (Field f : fields) {
            try {
                f.setAccessible(true);
                if (f.getName().equals("prix") || f.getName().equals("formule1") || f.getName().equals("formule2")) {
                    System.out.println(f.getName());
                } else {
                    listes.add(new Tuple(f.getName(), f.get(devisHabitation)));
                }
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
        }
        return listes;
    }
}
