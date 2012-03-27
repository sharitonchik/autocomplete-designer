package by.mgvrk.entity.user;

import java.util.ArrayList;
import java.util.List;

/**
 * User: sharitonchik
 */
public class User {
    private Long ID;
    private String login;
    private String password;
    private Role role;
    private DataUser dataUsers;
    private List projects = new ArrayList<Project>();

    public User() {
    }

    public Long getID() {
        return ID;
    }

    public void setID(Long ID) {
        this.ID = ID;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public DataUser getDataUsers() {
        return dataUsers;
    }

    public void setDataUsers(DataUser dataUsers) {
        this.dataUsers = dataUsers;
    }

    public List getProjects() {
        return projects;
    }

    public void setProjects(List projects) {
        this.projects = projects;
    }
}


