package cz.czechitas.webapp.repository;

import java.sql.*;
import java.util.*;
import org.mariadb.jdbc.*;
import org.springframework.beans.factory.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.jdbc.core.*;
import org.springframework.stereotype.*;
import cz.czechitas.webapp.api.repository.*;
import cz.czechitas.webapp.entity.*;

@Repository
public class JidloIngredienceRepositoryImpl extends AbstractRepository implements JidloIngredienceRepository, InitializingBean {


    private BeanPropertyRowMapper<JidloIngredienceEntity> prevodnik;


    public JidloIngredienceRepositoryImpl() {
        prevodnik = BeanPropertyRowMapper.newInstance(JidloIngredienceEntity.class);
    }

    public List<JidloIngredienceEntity> vratVsechny() {
        List<JidloIngredienceEntity> vsechnyJidla = odesilacDotazu.query("SELECT * from jidlo_ingredience",
                prevodnik);
        return vsechnyJidla;
    }

//    JidloIngredienceEntity findById(Long id);
//
//    void save(JidloIngredienceEntity recordToSave);
//
//    void deleteById(Long id);

}
