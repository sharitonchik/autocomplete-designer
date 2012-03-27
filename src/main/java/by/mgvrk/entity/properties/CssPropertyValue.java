package by.mgvrk.entity.properties;

/**
 * User: sharitonchik
 */
public class CssPropertyValue {
    private Long ID;
    private Long ID_property;
    private String propertyValue;

    public CssPropertyValue() {
    }

    public Long getID() {
        return ID;
    }

    public void setID(Long ID) {
        this.ID = ID;
    }

    public Long getID_property() {
        return ID_property;
    }

    public void setID_property(Long ID_property) {
        this.ID_property = ID_property;
    }

    public String getPropertyValue() {
        return propertyValue;
    }

    public void setPropertyValue(String propertyValue) {
        this.propertyValue = propertyValue;
    }
}
