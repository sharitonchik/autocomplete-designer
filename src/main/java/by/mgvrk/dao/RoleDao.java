package by.mgvrk.dao;

import by.mgvrk.entity.User;
import by.mgvrk.service.DBConnection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * User: sharitonchik
 */
public class RoleDao {
    DBConnection dbConnection;

    public RoleDao() {
        dbConnection = DBConnection.getInstance();
    }

    public void setRole(User user) throws SQLException {
        String sqlQueryString = "INSERT INTO ROLES VALUES (?,?)";
        PreparedStatement statement = dbConnection.getPreparedStatement(sqlQueryString);

        statement.setInt(1, user.getID());
        statement.setString(2, user.getRole());

        statement.executeUpdate();
    }
}
