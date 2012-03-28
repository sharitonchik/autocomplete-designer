package by.mgvrk.entity.user;

import javax.persistence.*;

/**
 * User: sharitonchik
 */
@Entity
@Table(name = "ROLES")
public class Role {
    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long ID;

    @Column(name = "role")
    private String role;

    public Role() {
    }

    public Long getID() {
        return ID;
    }

    private void setID(Long ID) {
        this.ID = ID;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
}
