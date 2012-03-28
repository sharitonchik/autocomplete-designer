package by.mgvrk.entity.tags;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

/**
 * User: sharitonchik
 */
@Entity
@Table(name = "TAG_ATTRIBUTES")
public class TagAttribute {
    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long ID;

    @Column(name = "ID_tag")
    private Long ID_tag;

    @Column(name = "attribute_name")
    private String attributeName;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_attribute")
    private List<TagAttributeValue> attributeValues = new ArrayList<TagAttributeValue>();

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
