package fr.imie.groupe3.project.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by luffy on 04/04/16.
 */
@Controller
public class LoginController {

    @RequestMapping("/")
    public String index() {
        return "login";
    }

    @RequestMapping(value = "/authentification", method = RequestMethod.POST)
    public String authentification() {
        return "toto";
    }
}
