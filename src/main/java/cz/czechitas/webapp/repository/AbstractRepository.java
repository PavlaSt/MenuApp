package cz.czechitas.webapp.repository;

import java.sql.*;
import org.mariadb.jdbc.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.jdbc.core.*;

public class AbstractRepository {

    @Value("${db.external.host}")
    protected String dbExternalHost;
    @Value("${db.external.port}")
    protected String dbExternalPort;
    @Value("${db.internal.host}")
    protected String dbInternalHost;
    @Value("${db.internal.port}")
    protected String dbInternalPort;
    @Value("${db.external}")
    protected boolean dbExternal;

    protected MariaDbDataSource konfiguraceDatabaze;
    protected JdbcTemplate odesilacDotazu;

    public void afterPropertiesSet() throws Exception {
        konfiguraceDatabaze = new MariaDbDataSource();
        try {
            konfiguraceDatabaze.setUserName("dbuser");
            konfiguraceDatabaze.setPassword("HRq6ySZ6j");
            if (dbExternal) {
                konfiguraceDatabaze.setUrl("jdbc:mysql://" + dbExternalHost + ":" + dbExternalPort + "/czechitas");
            } else {

                konfiguraceDatabaze.setUrl("jdbc:mysql://" + dbInternalHost + ":" + dbInternalPort + "/czechitas");
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        odesilacDotazu = new JdbcTemplate(konfiguraceDatabaze);
    }

}
