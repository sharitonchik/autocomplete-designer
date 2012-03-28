package by.mgvrk.entity.properties;

import javax.persistence.*;

/**
 * User: sharitonchik
 */
@Entity
@Table(name = "PROPERTY_VALUES")
public class CssPropertyValue {
    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long ID;

    @Column(name = "ID_property")
    private Long ID_property;

    @Column(name = "property_value")
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
