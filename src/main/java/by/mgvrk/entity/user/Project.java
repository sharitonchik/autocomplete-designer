package by.mgvrk.entity.user;

/**
 * User: sharitonchik
 */
public class Project {
    private Long ID;
    private Long ID_users;
    private String project_name;

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

    public String getProject_name() {
        return project_name;
    }

    public void setProject_name(String project_name) {
        this.project_name = project_name;
    }
}
