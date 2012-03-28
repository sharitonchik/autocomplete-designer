package by.mgvrk.entity.properties;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

/**
 * User: sharitonchik
 */
@Entity
@Table(name = "PROPERTIES")
public class CssProperty {
    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long ID;

    @Column(name = "property")
    private String propertyName;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_property")
    private List<CssPropertyValue> propertyValues = new ArrayList<CssPropertyValue>();

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
