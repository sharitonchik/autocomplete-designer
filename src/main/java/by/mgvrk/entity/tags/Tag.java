package by.mgvrk.entity.tags;

import java.util.ArrayList;
import java.util.List;

/**
 * User: sharitonchik
 */
public class Tag {
    private Long ID;
    private String tagName;
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
