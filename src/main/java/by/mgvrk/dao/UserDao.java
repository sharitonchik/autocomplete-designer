package by.mgvrk.dao;

import by.mgvrk.entity.User;
import com.mysql.jdbc.Statement;

import javax.xml.transform.Result;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;

/**
 * UserDao: sharitonchik
 */
public class UserDao extends Dao {

    public UserDao(DBConnection dbConnection) {
        super(dbConnection);
    }

    public void setUser(User user) throws SQLException {
        String sqlQueryString = "INSERT INTO USERS (login, password, role) VALUES (?,?,?)";
        PreparedStatement statement = dbConnection.getPreparedStatement(sqlQueryString);

        statement.setString(1, user.getName());
        statement.setString(2, user.getPassword());
        statement.setInt(3, 2);


        statement.executeUpdate();
    }


    public boolean checkUser(String login, String password) throws SQLException {
        String sqlQueryString = "SELECT * FROM USERS WHERE login=? and password=?";
        PreparedStatement statement = dbConnection.getPreparedStatement(sqlQueryString);

        statement.setString(1, login);
        statement.setString(2, password);

        ResultSet result = statement.executeQuery();
        return result.next();
    }
}
