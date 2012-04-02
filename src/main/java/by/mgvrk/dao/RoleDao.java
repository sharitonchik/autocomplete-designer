package by.mgvrk.dao;

import by.mgvrk.entity.user.Role;
import by.mgvrk.entity.user.User;
import org.hibernate.HibernateException;
import org.hibernate.Session;

import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * User: sharitonchik
 */
public class RoleDao extends Dao {

    public RoleDao(Session session) {
        super(session);
    }

    public String getRole(User user) throws HibernateException {
        Role role = (Role) session.load(Role.class,user.getRole());
        return role.getRole();
    }

    public Role getUserRole() {
        return (Role) session.load(Role.class, 2l);
    }
}
