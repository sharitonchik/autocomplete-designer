package by.mgvrk.util;

import by.mgvrk.hibernate.Hib;
import org.hibernate.Hibernate;
import org.hibernate.Session;

/**
 * User: sharitonchik
 */
public class StartHib {
    public static void main(String[] args) {
        Session session = HibernateHelper.getSessionFactory().getCurrentSession();

        session.beginTransaction();

        Hib table = new Hib();

        table.setText("hello world");

        session.save(table);

        session.getTransaction().commit();
    }
}
