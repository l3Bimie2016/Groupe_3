package fr.imie.groupe3.project.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by luffy on 04/04/16.
 */
@Controller
public class LoginController {

    @RequestMapping("/")
    public String index(ModelAndView modelAndView) {
        return "test";
    }
}
