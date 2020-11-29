package cz.czechitas.webapp;

import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.*;

@Controller
public class HlavniController {

    @RequestMapping("/")
    public ModelAndView zobrazIndex() {
        return new ModelAndView("index");
    }

    @RequestMapping(value = "/jidlo", method = RequestMethod.GET)
    public @ResponseBody Jidlo zobrazJidlo() {
        return new Jidlo(1L, "12:00", "29.11.2020", "Řízek s brambory");
    }



}
