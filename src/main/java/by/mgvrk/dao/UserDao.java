package by.mgvrk.dao;

import by.mgvrk.entity.User;
import by.mgvrk.util.ExceptionHandlerTemplateDao;

import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * UserDao: sharitonchik
 */
public class UserDao extends ExceptionHandlerTemplateDao {
    User user;

    public UserDao() {
    }

    public boolean addUser(User user) {
        String sqlQueryString = "INSERT INTO USERS VALUES (?,?,?)";
        this.user = user;
        return process(sqlQueryString);
    }

    @Override
    public void executeQueryString(PreparedStatement statement) throws SQLException {
        statement.setInt(1, this.user.getID());
        statement.setString(2, this.user.getName());
        statement.setString(3, this.user.getPassword());

        statement.executeUpdate();
    }
}
