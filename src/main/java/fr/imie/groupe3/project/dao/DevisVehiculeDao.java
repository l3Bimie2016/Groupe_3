package fr.imie.groupe3.project.dao;

import fr.imie.groupe3.project.dto.DevisHabitation;
import fr.imie.groupe3.project.dto.DevisVehicule;
import org.springframework.data.repository.CrudRepository;


/**
 * Created by Axel on 10/05/2016.
 */
public interface DevisVehiculeDao extends CrudRepository<DevisVehicule, Integer> {
}
