package cz.czechitas.webapp.controller;

import java.util.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*;
import cz.czechitas.webapp.api.dto.*;
import cz.czechitas.webapp.api.service.*;

@Controller
public class JidloController {

    @Autowired
    private JidloService jidloService;

    @RequestMapping(value = "/jidla", method = RequestMethod.GET)
    public @ResponseBody List<JidloDto> zobrazJidlo() {
        return jidloService.vratVsechnyJidla();
    }

}
