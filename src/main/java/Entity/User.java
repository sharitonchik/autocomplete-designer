package Entity;

/**
 * User: sharitonchik
 */
public class User {
    private int ID;
    private String name;
    private String password;
    private String email;
    private String phone;
    private String country;

    public User(int ID, String name, String password) {
        this.ID = ID;
        this.name = name;
        this.password = password;
    }

    public int getID() {
        return ID;
    }

    public String getName() {
        return name;
    }

    public String getPassword() {
        return password;
    }
}

