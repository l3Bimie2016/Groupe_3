package fr.imie.groupe3.project.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by le1cool on 10/05/16.
 */
@Controller
public class SyntheseController {

    @RequestMapping("/synthese")
    public String synthese() {
        return "synthese";
    }
}
