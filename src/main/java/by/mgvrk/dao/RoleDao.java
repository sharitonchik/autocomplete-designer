package by.mgvrk.dao;

import by.mgvrk.entity.User;

import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * User: sharitonchik
 */
public class RoleDao extends Dao {

    public RoleDao(DBConnection dbConnection) {
        super(dbConnection);
    }

    public void getRole(User user) throws SQLException {
        String sqlQueryString = "SELECT ROLES.ROLE " +
                "FROM USERS, ROLES " +
                "WHERE USERS.NAME=? and USERS.PASSWORD=? and USERS.ROLE=ROLES.ROLE";
        PreparedStatement statement = dbConnection.getPreparedStatement(sqlQueryString);

        statement.setString(1, user.getName());
        statement.setString(2, user.getPassword());

        statement.executeUpdate();
    }
}
