package by.mgvrk.entity.user;

import javax.persistence.*;

/**
 * User: sharitonchik
 */
@Entity
@Table(name = "PROJECTS")
public class Project {
    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long ID;

    @Column(name="ID_users")
    private Long ID_users;

    @Column(name="name_project")
    private String projectName;

    public Project() {
    }

    public Long getID() {
        return ID;
    }

    public void setID(Long ID) {
        this.ID = ID;
    }

    public Long getID_users() {
        return ID_users;
    }

    public void setID_users(Long ID_users) {
        this.ID_users = ID_users;
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }
}
