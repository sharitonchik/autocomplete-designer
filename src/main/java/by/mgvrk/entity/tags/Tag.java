package by.mgvrk.entity.tags;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

/**
 * User: sharitonchik
 */
@Entity
@Table(name = "TAGS")
public class Tag {
    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long ID;

    @Column(name = "tag_name")
    private String tagName;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_tag")
    private List attributes = new ArrayList<TagAttribute>();

    public Tag() {
    }

    public Long getID() {
        return ID;
    }

    public void setID(Long ID) {
        this.ID = ID;
    }

    public String getTagName() {
        return tagName;
    }

    public void setTagName(String tagName) {
        this.tagName = tagName;
    }

    public List getAttributes() {
        return attributes;
    }

    public void setAttributes(List attributes) {
        this.attributes = attributes;
    }
}
