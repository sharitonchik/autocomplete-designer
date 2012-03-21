package by.mgvrk.dao;

import by.mgvrk.service.DBConnection;

import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * User: sharitonchik
 */
public class ProjectsDao {
    DBConnection dbConnection;

    public ProjectsDao() {
        dbConnection = DBConnection.getInstance();
    }

    public boolean setProject(String project_name) throws SQLException {
        String sqlQueryString = "INSERT INTO PROJECTS VALUES(?,?,?)";
        PreparedStatement statement = dbConnection.getPreparedStatement(sqlQueryString);

        statement.setInt(1, 1);
        statement.setInt(2, 1);
        statement.setString(3, project_name);

        statement.executeUpdate();
        return false;
    }
}
