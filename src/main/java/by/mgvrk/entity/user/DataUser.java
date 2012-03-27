package by.mgvrk.entity.user;

import by.mgvrk.entity.user.User;

/**
 * User: sharitonchik
 */
public class DataUser {
    private Long ID;
    private String country;
    private String phone;
    private String email;
    private String gender;
    private User user;

    public DataUser() {
    }

    public Long getID() {
        return ID;
    }

    private void setID(Long ID) {
        this.ID = ID;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
