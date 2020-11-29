package cz.czechitas.webapp.controller;

import java.time.*;
import java.util.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.format.annotation.*;
import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*;
import cz.czechitas.webapp.api.dto.*;
import cz.czechitas.webapp.api.service.*;

@Controller
public class JidloController {

    @Autowired
    private JidloService jidloService;

    @RequestMapping(value = "/jidla", method = RequestMethod.GET)
    public @ResponseBody
    List<JidloDto> zobrazJidlo() {
        return jidloService.vratVsechnyJidla();
    }

    @RequestMapping(value = "/jidla", method = RequestMethod.GET, params = {"datumOd", "datumDo"})
    public @ResponseBody
    List<JidloDto> zobrazJidloSFiltrem(@RequestParam @DateTimeFormat(pattern = "yyyy-MM-dd") LocalDate datumOd,
                                       @RequestParam @DateTimeFormat(pattern = "yyyy-MM-dd") LocalDate datumDo) {
        return jidloService.vratJidlaOdDo(datumOd, datumDo);
    }

//    @GetMapping("test/all/{date}")
//    public List<Test> getAllTestsByBeginDate(@PathVariable @DateTimeFormat(pattern = "yyyy-MM-dd") LocalDate date) {

}
