package cz.czechitas.webapp.controller;

        import org.springframework.stereotype.*;
        import org.springframework.web.bind.annotation.*;
        import org.springframework.web.servlet.*;
        import cz.czechitas.webapp.entity.*;

@Controller
public class HlavniController {

    @RequestMapping("/")
    public ModelAndView zobrazIndex() {
        return new ModelAndView("index");
    }





}
