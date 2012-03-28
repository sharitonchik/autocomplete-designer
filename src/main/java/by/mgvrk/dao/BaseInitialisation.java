package by.mgvrk.dao;

import by.mgvrk.entity.user.User;
import org.hibernate.HibernateException;
import org.hibernate.Session;

import java.sql.SQLException;

/**
 * User: sharitonchik
 */
public class BaseInitialisation extends Dao {

    public BaseInitialisation(Session session) {
        super(session);
    }

    public void createTables() {
        session.getTransaction().begin();
        try {
            createTable("CREATE TABLE USERS (" +
                    "ID INT NOT NULL AUTO_INCREMENT, " +
                    "login varchar(20), " +
                    "password varchar(20), " +
                    "role int," +
                    "PRIMARY KEY (ID));");

            createTable("CREATE TABLE DATA_USER (" +
                    "ID INT NOT NULL AUTO_INCREMENT, " +
                    "country varchar(20), " +
                    "phone varchar(20)," +
                    "email varchar(20), " +
                    "gender varchar(20)," +
                    "PRIMARY KEY (ID));");

            createTable("CREATE TABLE ROLES (" +
                    "ID INT NOT NULL AUTO_INCREMENT, " +
                    "role varchar(20)," +
                    "PRIMARY KEY (ID));");
            session.createSQLQuery("INSERT INTO ROLES (role) VALUES ('admin');").executeUpdate();
            session.createSQLQuery("INSERT INTO ROLES (role) VALUES ('user');").executeUpdate();
            createTable("CREATE TABLE PROJECTS (" +
                    "ID INT NOT NULL AUTO_INCREMENT, " +
                    "ID_users int," +
                    "name_project varchar(20)," +
                    "PRIMARY KEY (ID));");
            session.getTransaction().commit();
        } catch (HibernateException e) {
            e.printStackTrace(System.out);
            session.getTransaction().rollback();
        }
    }

    private void createTable(String sqlQuery) {
        session.createSQLQuery(sqlQuery);
    }

}
