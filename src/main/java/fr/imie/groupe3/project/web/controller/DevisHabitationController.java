package fr.imie.groupe3.project.web.controller;

import fr.imie.groupe3.project.dto.DevisHabitation;
import fr.imie.groupe3.project.dto.Tuple;
import fr.imie.groupe3.project.service.DevisHabitationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by le1cool on 09/05/16.
 */
@Controller
@SessionAttributes("devisHabitation")
public class DevisHabitationController {


    @Autowired
    private DevisHabitationService devisHabitationService;

    @RequestMapping("/habitationWizard")
    public ModelAndView habitationwWizard() {
        return new ModelAndView("habitationWizard1", "devisHabitation", new DevisHabitation());
    }

    @RequestMapping("/habitationWizard{nbr}")
    public ModelAndView habitationwWizard(@PathVariable("nbr") int nbr, @ModelAttribute("devisHabitation") DevisHabitation devisHabitation) {
        devisHabitationService.setDevisHabitation(devisHabitation);
        return new ModelAndView("habitationWizard" + nbr);
    }

    @RequestMapping("/habitationWizard4")
    public ModelAndView habitationwWizardEnd(@ModelAttribute("devisHabitation") DevisHabitation devisHabitation) {
        devisHabitationService.setDevisHabitation(devisHabitation);
        return new ModelAndView("habitationWizard4", "resumes", devisHabitationService.getResume(devisHabitation));
    }

    @RequestMapping("/habitationWizardSave")
    public ModelAndView habitationwWizardSave(@ModelAttribute("devisHabitation") DevisHabitation devisHabitation) {
        String result = null;
        result = devisHabitationService.setDevisHabitationToVertX(devisHabitation);
        String message = null;
        if (result.equals("1")) {
            devisHabitationService.deleteDevisHabitation(devisHabitation);
            message = "Ok";
        } else {
            message = "Error";
        }
        return new ModelAndView("synthese");
    }
}
