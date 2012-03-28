package by.mgvrk.entity.user;

import by.mgvrk.entity.user.User;

import javax.persistence.*;

/**
 * User: sharitonchik
 */
@Entity
@Table(name="DATA_USER")
public class DataUser {
    @Id
    @Column(name="ID")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long ID;

    @Column(name="country")
    private String country;

    @Column(name="phone")
    private String phone;

    @Column(name="email")
    private String email;

    @Column(name="gender")
    private String gender;

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
}
