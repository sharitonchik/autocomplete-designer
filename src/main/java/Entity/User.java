package Entity;

/**
 * User: sharitonchik
 */
public class User {
    private String name;
    private String password;
    private String email;
    private String phone;
    private String country;

    public User(String name, String passwod) {
        this.name = name;
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public String getPassword() {
        return password;
    }
}

