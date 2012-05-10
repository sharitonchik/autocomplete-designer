package by.mgvrk.dao;

import by.mgvrk.entity.user.Role;
import org.hibernate.HibernateException;
import org.hibernate.Session;

import java.util.List;

/**
 * User: sharitonchik
 */
public class BaseInitialisation extends Dao {

    public BaseInitialisation(Session session) {
        super(session);
    }

    public void rowInit() {
        boolean adminExist = false;
        boolean userExist = false;

        session.getTransaction().begin();
        try {
            List roles = session.createQuery("from Role").list();
            for (int i = 0; i < roles.size(); i++) {
                Role role = (Role) roles.get(i);
                if (role.getRole().equals("admin")) {
                    adminExist = true;
                }
                if (role.getRole().equals("user")) {
                    userExist = true;
                }
            }

            if (!adminExist) {
                createRole("admin");
            }
            if (!userExist) {
                createRole("user");
            }
            session.getTransaction().commit();
        } catch (HibernateException e) {
            e.printStackTrace(System.out);
            session.getTransaction().rollback();
        }
    }

    private void createRole(String roleName) {
        Role role = new Role();
        role.setRole(roleName);
        session.save(role);
    }
}
