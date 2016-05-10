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

        if (nbr == 4){
        List<Tuple> listes = new ArrayList<>();
            Field[] fields = DevisHabitation.class.getDeclaredFields();
            for (Field f : fields){
                try {
                    f.setAccessible(true);
                    if(f.getName().equals("prix") || f.getName().equals("formule1") || f.getName().equals("formule2")){
                        System.out.println(f.getName());
                    }else {
                        listes.add(new Tuple(f.getName(), f.get(devisHabitation)));
                    }
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                }
            }
            return new ModelAndView("habitationWizard"+nbr, "resumes", listes);
        }

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
