
package net.boot.resttestapplication.model;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.Generated;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

@Generated("org.jsonschema2pojo")
public class Facet {

    private String label;
    private String anchor;
    private String labelWithOp;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * @return
     *     The label
     */
    public String getLabel() {
        return label;
    }

    /**
     * 
     * @param label
     *     The label
     */
    public void setLabel(String label) {
        this.label = label;
    }

    /**
     * 
     * @return
     *     The anchor
     */
    public String getAnchor() {
        return anchor;
    }

    /**
     * 
     * @param anchor
     *     The anchor
     */
    public void setAnchor(String anchor) {
        this.anchor = anchor;
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
        return new HashCodeBuilder().append(label).append(anchor).append(labelWithOp).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Facet) == false) {
            return false;
        }
        Facet rhs = ((Facet) other);
        return new EqualsBuilder().append(label, rhs.label).append(anchor, rhs.anchor).append(labelWithOp, rhs.labelWithOp).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}
