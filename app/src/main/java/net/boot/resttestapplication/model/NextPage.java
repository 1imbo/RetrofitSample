
package net.boot.resttestapplication.model;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.Generated;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

@Generated("org.jsonschema2pojo")
public class NextPage {

    private String title;
    private String totalResults;
    private String searchTerms;
    private Integer count;
    private Integer startIndex;
    private String inputEncoding;
    private String outputEncoding;
    private String safe;
    private String cx;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

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

    /**
     * 
     * @return
     *     The totalResults
     */
    public String getTotalResults() {
        return totalResults;
    }

    /**
     * 
     * @param totalResults
     *     The totalResults
     */
    public void setTotalResults(String totalResults) {
        this.totalResults = totalResults;
    }

    /**
     * 
     * @return
     *     The searchTerms
     */
    public String getSearchTerms() {
        return searchTerms;
    }

    /**
     * 
     * @param searchTerms
     *     The searchTerms
     */
    public void setSearchTerms(String searchTerms) {
        this.searchTerms = searchTerms;
    }

    /**
     * 
     * @return
     *     The count
     */
    public Integer getCount() {
        return count;
    }

    /**
     * 
     * @param count
     *     The count
     */
    public void setCount(Integer count) {
        this.count = count;
    }

    /**
     * 
     * @return
     *     The startIndex
     */
    public Integer getStartIndex() {
        return startIndex;
    }

    /**
     * 
     * @param startIndex
     *     The startIndex
     */
    public void setStartIndex(Integer startIndex) {
        this.startIndex = startIndex;
    }

    /**
     * 
     * @return
     *     The inputEncoding
     */
    public String getInputEncoding() {
        return inputEncoding;
    }

    /**
     * 
     * @param inputEncoding
     *     The inputEncoding
     */
    public void setInputEncoding(String inputEncoding) {
        this.inputEncoding = inputEncoding;
    }

    /**
     * 
     * @return
     *     The outputEncoding
     */
    public String getOutputEncoding() {
        return outputEncoding;
    }

    /**
     * 
     * @param outputEncoding
     *     The outputEncoding
     */
    public void setOutputEncoding(String outputEncoding) {
        this.outputEncoding = outputEncoding;
    }

    /**
     * 
     * @return
     *     The safe
     */
    public String getSafe() {
        return safe;
    }

    /**
     * 
     * @param safe
     *     The safe
     */
    public void setSafe(String safe) {
        this.safe = safe;
    }

    /**
     * 
     * @return
     *     The cx
     */
    public String getCx() {
        return cx;
    }

    /**
     * 
     * @param cx
     *     The cx
     */
    public void setCx(String cx) {
        this.cx = cx;
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
        return new HashCodeBuilder().append(title).append(totalResults).append(searchTerms).append(count).append(startIndex).append(inputEncoding).append(outputEncoding).append(safe).append(cx).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof NextPage) == false) {
            return false;
        }
        NextPage rhs = ((NextPage) other);
        return new EqualsBuilder().append(title, rhs.title).append(totalResults, rhs.totalResults).append(searchTerms, rhs.searchTerms).append(count, rhs.count).append(startIndex, rhs.startIndex).append(inputEncoding, rhs.inputEncoding).append(outputEncoding, rhs.outputEncoding).append(safe, rhs.safe).append(cx, rhs.cx).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}
