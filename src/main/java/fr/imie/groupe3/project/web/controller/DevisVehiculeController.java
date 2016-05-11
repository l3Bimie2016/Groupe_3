package fr.imie.groupe3.project.web.controller;

import fr.imie.groupe3.project.dto.DevisHabitation;
import fr.imie.groupe3.project.dto.DevisVehicule;
import fr.imie.groupe3.project.service.DevisHabitationService;
import fr.imie.groupe3.project.service.DevisVehiculeService;
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
@SessionAttributes("devisVehicule")
public class DevisVehiculeController {


    @Autowired
    private DevisVehiculeService devisVehiculeService;

    @RequestMapping("/vehiculeWizard")
    public ModelAndView vehiculewWizard() {
        return new ModelAndView("vehiculeWizard1", "devisVehicule", new DevisVehicule());
    }

    @RequestMapping("/vehiculeWizard{nbr}")
    public ModelAndView vehiculewWizard(@PathVariable("nbr") int nbr, @ModelAttribute("devisVehicule") DevisVehicule devisVehicule) {
        devisVehiculeService.setDevisVehicule(devisVehicule);
        return new ModelAndView("vehiculeWizard" + nbr);
    }

    @RequestMapping("/vehiculeWizard4")
    public ModelAndView vehiculewWizardEnd(@ModelAttribute("devisVehicule") DevisVehicule devisVehicule) {
        devisVehiculeService.setDevisVehicule(devisVehicule);
        return new ModelAndView("vehiculeWizard4", "resumes", devisVehiculeService.getResume(devisVehicule));
    }

    @RequestMapping("/vehiculeWizardSave")
    public ModelAndView vehiculewWizardSave(@ModelAttribute("devisVehicule") DevisVehicule devisVehicule) {
        String result = null;
        result = devisVehiculeService.setDevisVehiculeToVertX(devisVehicule);
        String message = null;
        if (result.equals("1")) {
            devisVehiculeService.deleteDevisVehicule(devisVehicule);
            message = "Ok";
        } else {
            message = "Error";
        }
        return new ModelAndView("synthese");
    }
}
