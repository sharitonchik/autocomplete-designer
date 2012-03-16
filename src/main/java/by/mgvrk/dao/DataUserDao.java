package by.mgvrk.dao;

/**
 * User: sharitonchik
 */
public class DataUserDao {
    private int ID;
    private int ID_users;
    private String phone;
    private String email;
    private String country;

    public DataUserDao(String phone, String email, String country) {
        this.phone = phone;
        this.email = email;
        this.country = country;
    }
}
