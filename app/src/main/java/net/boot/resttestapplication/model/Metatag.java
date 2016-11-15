
package net.boot.resttestapplication.model;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.Generated;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

@Generated("org.jsonschema2pojo")
public class Metatag {

    private String producer;
    private String creationdate;
    private String moddate;
    private String creator;
    private String title;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * @return
     *     The producer
     */
    public String getProducer() {
        return producer;
    }

    /**
     * 
     * @param producer
     *     The producer
     */
    public void setProducer(String producer) {
        this.producer = producer;
    }

    /**
     * 
     * @return
     *     The creationdate
     */
    public String getCreationdate() {
        return creationdate;
    }

    /**
     * 
     * @param creationdate
     *     The creationdate
     */
    public void setCreationdate(String creationdate) {
        this.creationdate = creationdate;
    }

    /**
     * 
     * @return
     *     The moddate
     */
    public String getModdate() {
        return moddate;
    }

    /**
     * 
     * @param moddate
     *     The moddate
     */
    public void setModdate(String moddate) {
        this.moddate = moddate;
    }

    /**
     * 
     * @return
     *     The creator
     */
    public String getCreator() {
        return creator;
    }

    /**
     * 
     * @param creator
     *     The creator
     */
    public void setCreator(String creator) {
        this.creator = creator;
    }

    /**
     * 
     * @return
     *     The title
     */
    public String getTitle() {
        return title;
    }

    /**
     * 
     * @param title
     *     The title
     */
    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(producer).append(creationdate).append(moddate).append(creator).append(title).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Metatag) == false) {
            return false;
        }
        Metatag rhs = ((Metatag) other);
        return new EqualsBuilder().append(producer, rhs.producer).append(creationdate, rhs.creationdate).append(moddate, rhs.moddate).append(creator, rhs.creator).append(title, rhs.title).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}
