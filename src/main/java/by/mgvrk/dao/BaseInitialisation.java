package by.mgvrk.dao;

import com.mysql.jdbc.DatabaseMetaData;
import com.mysql.jdbc.PreparedStatement;

import java.sql.ResultSet;

import java.sql.SQLException;

/**
 * User: sharitonchik
 */
public class BaseInitialisation extends Dao {
    PreparedStatement statement;
    DatabaseMetaData data;

    public BaseInitialisation(DBConnection dbConnection) {
        super(dbConnection);
    }

    public void createTables() {
        dbConnection.startTransaction();
        try {
            createTable("USERS", "CREATE TABLE USERS (" +
                    "ID INT NOT NULL AUTO_INCREMENT, " +
                    "login varchar(20), " +
                    "password varchar(20), " +
                    "role int," +
                    "PRIMARY KEY (ID));");

            createTable("DATA_USER", "CREATE TABLE DATA_USER (" +
                    "ID INT NOT NULL AUTO_INCREMENT, " +
                    "country varchar(20), " +
                    "phone varchar(20)," +
                    "email varchar(20), " +
                    "gender varchar(20)," +
                    "PRIMARY KEY (ID));");

            createTable("ROLES", "CREATE TABLE ROLES (" +
                    "ID INT NOT NULL AUTO_INCREMENT, " +
                    "role varchar(20)," +
                    "PRIMARY KEY (ID));");

            createTable("PROJECTS", "CREATE TABLE PROJECTS (" +
                    "ID INT NOT NULL AUTO_INCREMENT, " +
                    "ID_users int," +
                    "name_project varchar(20)," +
                    "PRIMARY KEY (ID));");

             createTable("HIB", "CREATE TABLE HIB (" +
                    "ID INT NOT NULL AUTO_INCREMENT, " +
                    "text varchar(20)," +
                    "PRIMARY KEY (ID));");
            dbConnection.commitTransaction();
        } catch (SQLException e) {
            e.printStackTrace(System.out);
            dbConnection.rollBackTransaction();
        }
    }

    private void createTable(String tableName, String sqlQuery) throws SQLException {
        data = dbConnection.getConnectionMetaData();
        ResultSet table = null;

        table = data.getTables(null, null, tableName, null);
        if (table.next()) {
            System.out.println("Table exist. Do not create");
        } else {
            statement = (PreparedStatement) dbConnection.
                    getPreparedStatement(sqlQuery);
            statement.executeUpdate();
        }

    }

}
