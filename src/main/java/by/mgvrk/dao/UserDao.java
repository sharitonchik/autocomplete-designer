package by.mgvrk.dao;

import by.mgvrk.entity.User;
import by.mgvrk.util.ExceptionHandlerTemplateDao;

import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * UserDao: sharitonchik
 */
public class UserDao extends ExceptionHandlerTemplateDao {

    public UserDao() {}

    public boolean addUser(User user) {
        String sqlQueryString = "INSERT INTO USERS VALUES (?,?,?)";

        return process(sqlQueryString, user);
    }

    @Override
    public void executeQueryString(PreparedStatement statement, User user) throws SQLException {
        statement.setInt(1, user.getID());
        statement.setString(2, user.getName());
        statement.setString(3, user.getPassword());

        statement.executeUpdate();
    }
}
