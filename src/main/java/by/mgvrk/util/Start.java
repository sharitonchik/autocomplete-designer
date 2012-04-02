package by.mgvrk.util;

import by.mgvrk.dao.BaseInitialisation;
import org.hibernate.Session;

/**
 * User: sharitonchik
 */
public class Start {
    public static void main(String[] args) {
        Session session = HibernateHelper.getSessionFactory().getCurrentSession();
        BaseInitialisation baseInitialisation = new BaseInitialisation(session);
        baseInitialisation.rowInit();
    }
}
