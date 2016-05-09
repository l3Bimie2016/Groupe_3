package fr.imie.groupe3.project.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by le1cool on 09/05/16.
 */
@Controller
public class DevisHabitationController {


    @RequestMapping("/habitationWizard{nbr}")
    public String habitationwWizardStart(@PathVariable("nbr") int nbr) {
        System.out.println(nbr);
        return "habitationWizard"+nbr;
    }
}
