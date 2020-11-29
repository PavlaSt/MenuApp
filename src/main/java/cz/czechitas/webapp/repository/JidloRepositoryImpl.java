package cz.czechitas.webapp.repository;

import java.sql.*;
import java.util.*;
import org.mariadb.jdbc.*;
import org.springframework.beans.factory.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.jdbc.core.*;
import org.springframework.stereotype.*;
import cz.czechitas.webapp.api.dto.*;
import cz.czechitas.webapp.api.repository.*;
import cz.czechitas.webapp.entity.*;

@Repository
public class JidloRepositoryImpl extends AbstractRepository implements JidloRepository, InitializingBean {


    private RowMapper<JidloEntity> prevodnik;



    public JidloRepositoryImpl() {
        prevodnik = BeanPropertyRowMapper.newInstance(JidloEntity.class);
    }

    public List<JidloEntity> vratVsechny() {
        List<JidloEntity> vsechnyJidla = odesilacDotazu.query("SELECT * from jidlo",
                prevodnik);
        return vsechnyJidla;
    }

//    JidloEntity findById(Long id);
//
//    void save(JidloEntity recordToSave);
//
//    void deleteById(Long id);

}
