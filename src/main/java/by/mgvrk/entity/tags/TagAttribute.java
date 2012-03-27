package by.mgvrk.entity.tags;

import java.util.ArrayList;
import java.util.List;

/**
 * User: sharitonchik
 */
public class TagAttribute {
    private Long ID;
    private Long ID_tag;
    private String attributeName;
    private List attributeValues = new ArrayList<TagAttributeValue>();

    public TagAttribute() {
    }

    public Long getID() {
        return ID;
    }

    public void setID(Long ID) {
        this.ID = ID;
    }

    public Long getID_tag() {
        return ID_tag;
    }

    public void setID_tag(Long ID_tag) {
        this.ID_tag = ID_tag;
    }

    public String getAttributeName() {
        return attributeName;
    }

    public void setAttributeName(String attributeName) {
        this.attributeName = attributeName;
    }

    public List getAttributeValues() {
        return attributeValues;
    }

    public void setAttributeValues(List attributeValues) {
        this.attributeValues = attributeValues;
    }
}
