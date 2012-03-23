package by.mgvrk.dao;

/**
 * User: sharitonchik
 */
public abstract class Dao {
    protected DBConnection dbConnection;

    protected Dao(DBConnection dbConnection) {
        this.dbConnection = dbConnection;
    }
}
