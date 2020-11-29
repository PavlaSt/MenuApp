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
public class IngredienceRepositoryImpl extends AbstractRepository implements IngredienceRepository, InitializingBean {


    private BeanPropertyRowMapper<IngredienceEntity> prevodnik;



    public IngredienceRepositoryImpl() {
        prevodnik = BeanPropertyRowMapper.newInstance(IngredienceEntity.class);
    }

    public List<IngredienceEntity> vratVsechny() {
        List<IngredienceEntity> vsechnyJidlaingerdience = odesilacDotazu.query("SELECT * from ingredience",
                prevodnik);
        return vsechnyJidlaingerdience;
    }

//    IngredienceEntity findById(Long id);
//
//    void save(IngredienceEntity recordToSave);
//
//    void deleteById(Long id);

}
