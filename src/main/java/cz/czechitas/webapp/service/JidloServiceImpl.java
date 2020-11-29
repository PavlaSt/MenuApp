package cz.czechitas.webapp.service;

import java.util.*;
import org.springframework.stereotype.*;
import cz.czechitas.webapp.api.dto.*;
import cz.czechitas.webapp.api.service.*;

@Service
public class JidloServiceImpl implements JidloService {

    @Override
    public List<JidloDto> vratVsechnyJidla() {

        List<IngredienceDto> rizekIngredience = new ArrayList<>();
        rizekIngredience.add(new IngredienceDto("vepřové maso", "g", 200));
        rizekIngredience.add(new IngredienceDto("strouhanka", "g", 20));
        rizekIngredience.add(new IngredienceDto("vejce", "ks", 1));
        rizekIngredience.add(new IngredienceDto("hladká mouka", "g", 20));
        rizekIngredience.add(new IngredienceDto("sůl", "g", 2));
        rizekIngredience.add(new IngredienceDto("brambory", "g", 200));
        rizekIngredience.add(new IngredienceDto("máslo", "g", 20));

        List<JidloDto> jidla = new ArrayList<>();
        jidla.add(new JidloDto(1L, "12:00", "29.11.2020", "Řízek s brambory", rizekIngredience ));

        return jidla;

    }
}
