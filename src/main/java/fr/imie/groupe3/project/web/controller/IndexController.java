package fr.imie.groupe3.project.web.controller;

import fr.imie.groupe3.project.dto.DevisHabitation;
import fr.imie.groupe3.project.dto.TupleDevis;
import fr.imie.groupe3.project.dto.TupleNameValue;
import fr.imie.groupe3.project.service.DevisHabitationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by axel on 04/04/16.
 */
@Controller
public class IndexController {

    @Autowired
    private DevisHabitationService devisHabitationService;

    /**
     * Return synthese page
     * @return
     */
    @RequestMapping("/")
    public ModelAndView synthese() {
        List<DevisHabitation> devisHabitations = devisHabitationService.getDevisHabitationToVertX();
//        List<TupleDevis> tupleDevisList = new ArrayList<>();
//        for(DevisHabitation devisHabitation : devisHabitations){
////            tupleDevisList.add(new TupleDevis (devisHabitation.getId(), devisHabitation.getNomDevis()));
//        }
        return new ModelAndView("synthese");
    }

}
