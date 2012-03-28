package by.mgvrk.entity.user;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

/**
 * User: sharitonchik
 */
@Entity
@Table(name = "USERS")
public class User {
    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long ID;

    @Column(name = "login")
    private String login;

    @Column(name = "password")
    private String password;

    @Column(name = "role")
    private Long role;

    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(name = "ID")
    private DataUser dataUsers;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_users")
    private List<Project> projects = new ArrayList<Project>();

    public User() {
    }

    public Long getID() {
        return ID;
    }

    private void setID(Long ID) {
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

    public Long getRole() {
        return role;
    }

    public void setRole(Long role) {
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


