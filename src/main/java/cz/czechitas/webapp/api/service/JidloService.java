package cz.czechitas.webapp.api.service;

import java.time.*;
import java.util.*;
import cz.czechitas.webapp.api.dto.*;

public interface JidloService {

    List<JidloDto> vratVsechnyJidla();
    List<JidloDto> vratJidlaOdDo(LocalDate datumOd, LocalDate datumDo);

}
