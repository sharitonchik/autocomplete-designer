package by.mgvrk.entity.tags;

import javax.persistence.*;

/**
 * User: sharitonchik
 */
@Entity
@Table(name = "ATTRIBUTE_VALUE")
public class TagAttributeValue {
    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long ID;

    @Column(name = "ID_attribute")
    private Long ID_attribute;

    @Column(name = "attribute_value")
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
