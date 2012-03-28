package by.mgvrk.dao;

import org.hibernate.Session;

/**
 * User: sharitonchik
 */
public abstract class Dao {
    protected Session session;

    protected Dao(Session session) {
        this.session = session;
    }
}
