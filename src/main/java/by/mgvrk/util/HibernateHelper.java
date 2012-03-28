package by.mgvrk.util;

import org.hibernate.HibernateException;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 * User: sharitonchik
 */
public class HibernateHelper {
    private static final SessionFactory instance;

    static {
        try {
            instance = new Configuration()
                    .configure().buildSessionFactory();
        } catch (Throwable e) {
            throw new ExceptionInInitializerError(e);

        }
    }

    public static SessionFactory getSessionFactory() throws HibernateException {
        return instance;
    }
}

