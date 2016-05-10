package fr.imie.groupe3.project.web.controller;

import fr.imie.groupe3.project.dto.DevisHabitation;
import fr.imie.groupe3.project.service.DevisHabitationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by le1cool on 09/05/16.
 */
@Controller
@SessionAttributes({"devisHabitation"})
public class DevisHabitationController {

    @Autowired
    private DevisHabitationService devisHabitationService;

    @RequestMapping("/habitationWizard1")
    public ModelAndView habitationwWizard() {
        return new ModelAndView("habitationWizard1","devisHabitation", new DevisHabitation());
    }

    @RequestMapping("/habitationWizard{nbr}")
    public ModelAndView habitationwWizard(@PathVariable("nbr") int nbr, @ModelAttribute("devisHabitation") DevisHabitation devisHabitation) {
        return new ModelAndView("habitationWizard"+nbr);
    }

    @RequestMapping("/habitationWizardSave")
    public String habitationwWizardSave(@PathVariable("nbr") int nbr, @ModelAttribute("devisHabitation") DevisHabitation devisHabitation) {
        Integer result = null;
        result = devisHabitationService.sendDevisHabitationToVertX(devisHabitation);
        String message = null;
        if(result == 1){
            message = "Ok";
        }else {
            message = "Error";
        }
        return "synthese";
    }
}
