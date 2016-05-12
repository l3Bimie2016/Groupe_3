package fr.imie.groupe3.project.dao;

import fr.imie.groupe3.project.dto.DevisHabitation;
import org.springframework.data.repository.CrudRepository;


/**
 * Devis habitation Crud repository
 *
 * Created by Axel on 10/05/2016.
 */
public interface DevisHabitationDao extends CrudRepository<DevisHabitation, Integer> {
}
