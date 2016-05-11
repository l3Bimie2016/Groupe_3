package fr.imie.groupe3.project.web.controller;

import fr.imie.groupe3.project.dto.DevisHabitation;
import fr.imie.groupe3.project.service.DevisHabitationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

/**
 * Created by le1cool on 10/05/16.
 */
@Controller
public class SyntheseController {

    @Autowired
    private DevisHabitationService devisHabitationService;

//    @RequestMapping("/")
//    public ModelAndView synthese() {
//        List devisHabitations = devisHabitationService.getDevisHabitationToVertX();
//        return new ModelAndView("synthese", "devisHabitationList", devisHabitations);
//    }
}
