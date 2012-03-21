package by.mgvrk.entity;

import java.util.ArrayList;
import java.util.List;

/**
 * User: sharitonchik
 */
public class User {       //need the user class??
    private int ID;
    private String name;
    private String password;
    private String email;
    private String phone;
    private String country;
    private String gender;
    private String role;
    private String project;

    public User() {
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setProject(String project_name) {
        this.project = project_name;
    }

    public String getProject() {
        return project;
    }
}


