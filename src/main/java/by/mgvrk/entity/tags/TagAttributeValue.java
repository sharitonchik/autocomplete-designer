package by.mgvrk.entity.tags;

/**
 * User: sharitonchik
 */
public class TagAttributeValue {
    private Long ID;
    private Long ID_attribute;
    private String attributeValue;

    public TagAttributeValue() {
    }

    public Long getID() {
        return ID;
    }

    public void setID(Long ID) {
        this.ID = ID;
    }

    public Long getID_attribute() {
        return ID_attribute;
    }

    public void setID_attribute(Long ID_attribute) {
        this.ID_attribute = ID_attribute;
    }

    public String getAttributeValue() {
        return attributeValue;
    }

    public void setAttributeValue(String attributeValue) {
        this.attributeValue = attributeValue;
    }
}
