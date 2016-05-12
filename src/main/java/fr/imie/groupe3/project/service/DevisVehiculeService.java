package fr.imie.groupe3.project.service;

import fr.imie.groupe3.project.dao.DevisVehiculeDao;
import fr.imie.groupe3.project.dto.DevisVehicule;
import fr.imie.groupe3.project.dto.TupleNameValue;
import org.apache.commons.collections.IteratorUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

/**
 * Devis vehicule service
 *
 * Created by Axel on 10/05/2016.
 */
@Service
public class DevisVehiculeService {

    @Autowired
    private DevisVehiculeDao devisVehiculeDao;

    public String setDevisVehiculeToVertX(DevisVehicule devisVehicule) {

        String result = null;
        RestTemplate restTemplate = new RestTemplate();
        String url = "http://localhost:8080/devisVehicule";

        result = restTemplate.postForObject(url, devisVehicule, String.class);
        return result;
    }

    public List getDevisVehiculeToVertX() {

        RestTemplate restTemplate = new RestTemplate();
        String url = "http://localhost:8080/devisVehicule";
        return restTemplate.getForObject(url, List.class);
    }

    public void setDevisVehicule(DevisVehicule devisVehicule) {
        devisVehiculeDao.save(devisVehicule);
    }

    public void deleteDevisVehicule(DevisVehicule devisVehicule) {
        devisVehiculeDao.delete(devisVehicule);
    }

    public List getListDevisVehicule(){
        return IteratorUtils.toList(devisVehiculeDao.findAll().iterator());
    }

    public List getResume(DevisVehicule devisVehicule) {
        List<TupleNameValue> listes = new ArrayList<>();
        Field[] fields = DevisVehicule.class.getDeclaredFields();
        for (Field f : fields) {
            try {
                f.setAccessible(true);
                    System.out.println(f.getName());
                    listes.add(new TupleNameValue(f.getName(), f.get(devisVehicule)));

            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
        }
        return listes;
    }
}
