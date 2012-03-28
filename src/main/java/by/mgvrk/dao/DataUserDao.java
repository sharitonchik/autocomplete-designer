package by.mgvrk.dao;

import by.mgvrk.entity.user.User;
import org.hibernate.Session;

import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * User: sharitonchik
 */
public class DataUserDao extends Dao {

    public DataUserDao(Session session) {
        super(session);
    }

//    public void setDataUser(User user) throws SQLException {
//        String sqlQueryString = "INSERT INTO DATA_USER (country, phone, email, gender) VALUES (?,?,?,?)";
//        PreparedStatement statement = dbConnection.getPreparedStatement(sqlQueryString);
//
////        statement.setString(1, user.getCountry());
////        statement.setString(2, user.getPhone());
////        statement.setString(3, user.getEmail());
////        statement.setString(4, user.getGender());
//
//        statement.executeUpdate();
//    }
}
