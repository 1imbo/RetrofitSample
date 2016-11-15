
package net.boot.resttestapplication.model;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.Generated;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

@Generated("org.jsonschema2pojo")
public class Label {

    private String name;
    private String displayName;
    private String labelWithOp;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * @return
     *     The name
     */
    public String getName() {
        return name;
    }

    /**
     * 
     * @param name
     *     The name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 
     * @return
     *     The displayName
     */
    public String getDisplayName() {
        return displayName;
    }

    /**
     * 
     * @param displayName
     *     The displayName
     */
    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    /**
     * 
     * @return
     *     The labelWithOp
     */
    public String getLabelWithOp() {
        return labelWithOp;
    }

    /**
     * 
     * @param labelWithOp
     *     The label_with_op
     */
    public void setLabelWithOp(String labelWithOp) {
        this.labelWithOp = labelWithOp;
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
        return new HashCodeBuilder().append(name).append(displayName).append(labelWithOp).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Label) == false) {
            return false;
        }
        Label rhs = ((Label) other);
        return new EqualsBuilder().append(name, rhs.name).append(displayName, rhs.displayName).append(labelWithOp, rhs.labelWithOp).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}
