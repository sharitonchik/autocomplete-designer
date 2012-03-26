package by.mgvrk.util;

import by.mgvrk.hibernate.DataUserDao;
import by.mgvrk.hibernate.Hib;
import by.mgvrk.hibernate.UserDao;
import com.sun.xml.internal.bind.v2.model.core.ID;
import org.hibernate.Hibernate;
import org.hibernate.Session;

import java.util.List;

/**
 * User: sharitonchik
 */
public class StartHib {
    public static void main(String[] args) {
        Session session = HibernateHelper.getSessionFactory().getCurrentSession();

        session.beginTransaction();

//        UserDao userDao = new UserDao();
//        DataUserDao dataUserDao = new DataUserDao();
//
//        userDao.setLogin("stuart");
//        userDao.setPassword("little");
//        userDao.setRole(2);
//
//        dataUserDao.setCountry("rb");
//        dataUserDao.setPhone("123123");
//        dataUserDao.setEmail("@345");
//        dataUserDao.setGender("Male");
//
//        userDao.setDataUsers(dataUserDao);
//        dataUserDao.setUserDao(userDao);
//
//        session.save(userDao);
        UserDao user = (UserDao) session.load(UserDao.class, 1l);
        System.out.println("user from load: " + user.getLogin());
        System.out.println("user from load: " + user.getDataUsers().getGender());
        List users = session.createQuery("from HIB").list();
        Hib hib = (Hib) users.get(1);
        System.out.println("hib " + hib.getText());
        session.getTransaction().commit();
//        UserDao user1 = (UserDao) users.get(1);
//        System.out.println("user from list: " + user1.getLogin());
    }
}
