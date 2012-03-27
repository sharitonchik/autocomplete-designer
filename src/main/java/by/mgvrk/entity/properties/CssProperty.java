package by.mgvrk.entity.properties;

import java.util.ArrayList;
import java.util.List;

/**
 * User: sharitonchik
 */
public class CssProperty {
    private Long ID;
    private String propertyName;
    private List propertyValues = new ArrayList<CssPropertyValue>();

    public CssProperty() {
    }

    public Long getID() {
        return ID;
    }

    public void setID(Long ID) {
        this.ID = ID;
    }

    public String getPropertyName() {
        return propertyName;
    }

    public void setPropertyName(String propertyName) {
        this.propertyName = propertyName;
    }

    public List getPropertyValues() {
        return propertyValues;
    }

    public void setPropertyValues(List propertyValues) {
        this.propertyValues = propertyValues;
    }
}
