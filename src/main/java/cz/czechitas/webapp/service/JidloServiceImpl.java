package cz.czechitas.webapp.service;

import java.time.*;
import java.util.*;
import java.util.stream.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.stereotype.*;
import cz.czechitas.webapp.api.dto.*;
import cz.czechitas.webapp.api.repository.*;
import cz.czechitas.webapp.api.service.*;
import cz.czechitas.webapp.entity.*;
import cz.czechitas.webapp.repository.*;

@Service
public class JidloServiceImpl implements JidloService {

    @Autowired
    private JidloRepository jidloRepository;

    @Autowired
    private JidloIngredienceRepository jidloIngredienceRepository;

    @Autowired
    private IngredienceRepository ingredienceRepository;

    @Override
    public List<JidloDto> vratVsechnyJidla() {

//        List<IngredienceDto> rizekIngredience = new ArrayList<>();
//        rizekIngredience.add(new IngredienceDto("vepřové maso", "g", 200));
//        rizekIngredience.add(new IngredienceDto("strouhanka", "g", 20));
//        rizekIngredience.add(new IngredienceDto("vejce", "ks", 1));
//        rizekIngredience.add(new IngredienceDto("hladká mouka", "g", 20));
//        rizekIngredience.add(new IngredienceDto("sůl", "g", 2));
//        rizekIngredience.add(new IngredienceDto("brambory", "g", 200));
//        rizekIngredience.add(new IngredienceDto("máslo", "g", 20));
//
//        List<JidloDto> jidla = new ArrayList<>();
//        LocalDate  datum = LocalDate.of(2020, 11, 29);
//        LocalTime cas = LocalTime.of(12, 0);
//
//
//        jidla.add(new JidloDto(1L, cas, datum, "Řízek s brambory", rizekIngredience ));
//
//        return jidla;
//

        List<JidloEntity> jidloEntities = jidloRepository.vratVsechny();
        List<JidloIngredienceEntity> jidloIngredienceEntities = jidloIngredienceRepository.vratVsechny();
        List<IngredienceEntity> ingredienceEntities = ingredienceRepository.vratVsechny();


        List<JidloDto> jidla = new ArrayList<>();
        for (JidloEntity jidloEntity : jidloEntities) {

            Long id = jidloEntity.getId();
            LocalTime cas = jidloEntity.getCas();
            LocalDate datum = jidloEntity.getDatum();
            String nazev = jidloEntity.getNazev();
            List<IngredienceDto> ingredienceDtos = najdiIngredience(jidloEntity.getId(),
                    jidloIngredienceEntities,
                    ingredienceEntities);

            jidla.add(new JidloDto(id, cas, datum, nazev, ingredienceDtos));
        }
        return jidla;
    }

    @Override
    public List<JidloDto> vratJidlaOdDo(LocalDate datumOd, LocalDate datumDo) {
        List<JidloDto> vsechnyJidla = vratVsechnyJidla();
        return vsechnyJidla
                .stream()
                .filter(jidlo -> jidlo.getDatum().isEqual(datumOd) || jidlo.getDatum().isAfter(datumOd))
                .filter(jidlo -> jidlo.getDatum().isEqual(datumDo) || jidlo.getDatum().isBefore(datumDo))
                .collect(Collectors.toList());
    }

    private List<IngredienceDto> najdiIngredience(Long jidloId,
                                                  List<JidloIngredienceEntity> jidloIngredienceEntities,
                                                  List<IngredienceEntity> ingredienceEntities) {

        List<IngredienceDto> ingredienceDtos = new ArrayList<>();
        for (JidloIngredienceEntity jidloIngredienceEntity : jidloIngredienceEntities) {
            if (jidloId.equals(jidloIngredienceEntity.getIdJidlo())) {
                Long idIngredience = jidloIngredienceEntity.getIdIngredience();
                IngredienceEntity ingredienceEntity = najdiIngredienci(idIngredience, ingredienceEntities);

                String nazevIngredince = ingredienceEntity.getNazev();
                String jednotka = ingredienceEntity.getJednotka();
                Integer mnozstvi = jidloIngredienceEntity.getMnozstvi();
                ingredienceDtos.add(new IngredienceDto(nazevIngredince, jednotka, mnozstvi));
            }
        }
        return ingredienceDtos;

    }

    private IngredienceEntity najdiIngredienci(Long ingredienceId, List<IngredienceEntity> ingredienceEntities) {
        for (IngredienceEntity ingredienceEntity : ingredienceEntities) {
            if (ingredienceEntity.getId().equals(ingredienceId)) {
                return ingredienceEntity;
            }
        }
        return null;
    }

}
