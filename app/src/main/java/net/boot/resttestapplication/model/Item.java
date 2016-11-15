
package net.boot.resttestapplication.model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.Generated;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

@Generated("org.jsonschema2pojo")
public class Item {

    private String kind;
    private String title;
    private String htmlTitle;
    private String link;
    private String displayLink;
    private String snippet;
    private String htmlSnippet;
    private String cacheId;
    private String formattedUrl;
    private String htmlFormattedUrl;
    private List<Label> labels = new ArrayList<Label>();
    private Pagemap pagemap;
    private String mime;
    private String fileFormat;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * @return
     *     The kind
     */
    public String getKind() {
        return kind;
    }

    /**
     * 
     * @param kind
     *     The kind
     */
    public void setKind(String kind) {
        this.kind = kind;
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

    /**
     * 
     * @return
     *     The htmlTitle
     */
    public String getHtmlTitle() {
        return htmlTitle;
    }

    /**
     * 
     * @param htmlTitle
     *     The htmlTitle
     */
    public void setHtmlTitle(String htmlTitle) {
        this.htmlTitle = htmlTitle;
    }

    /**
     * 
     * @return
     *     The link
     */
    public String getLink() {
        return link;
    }

    /**
     * 
     * @param link
     *     The link
     */
    public void setLink(String link) {
        this.link = link;
    }

    /**
     * 
     * @return
     *     The displayLink
     */
    public String getDisplayLink() {
        return displayLink;
    }

    /**
     * 
     * @param displayLink
     *     The displayLink
     */
    public void setDisplayLink(String displayLink) {
        this.displayLink = displayLink;
    }

    /**
     * 
     * @return
     *     The snippet
     */
    public String getSnippet() {
        return snippet;
    }

    /**
     * 
     * @param snippet
     *     The snippet
     */
    public void setSnippet(String snippet) {
        this.snippet = snippet;
    }

    /**
     * 
     * @return
     *     The htmlSnippet
     */
    public String getHtmlSnippet() {
        return htmlSnippet;
    }

    /**
     * 
     * @param htmlSnippet
     *     The htmlSnippet
     */
    public void setHtmlSnippet(String htmlSnippet) {
        this.htmlSnippet = htmlSnippet;
    }

    /**
     * 
     * @return
     *     The cacheId
     */
    public String getCacheId() {
        return cacheId;
    }

    /**
     * 
     * @param cacheId
     *     The cacheId
     */
    public void setCacheId(String cacheId) {
        this.cacheId = cacheId;
    }

    /**
     * 
     * @return
     *     The formattedUrl
     */
    public String getFormattedUrl() {
        return formattedUrl;
    }

    /**
     * 
     * @param formattedUrl
     *     The formattedUrl
     */
    public void setFormattedUrl(String formattedUrl) {
        this.formattedUrl = formattedUrl;
    }

    /**
     * 
     * @return
     *     The htmlFormattedUrl
     */
    public String getHtmlFormattedUrl() {
        return htmlFormattedUrl;
    }

    /**
     * 
     * @param htmlFormattedUrl
     *     The htmlFormattedUrl
     */
    public void setHtmlFormattedUrl(String htmlFormattedUrl) {
        this.htmlFormattedUrl = htmlFormattedUrl;
    }

    /**
     * 
     * @return
     *     The labels
     */
    public List<Label> getLabels() {
        return labels;
    }

    /**
     * 
     * @param labels
     *     The labels
     */
    public void setLabels(List<Label> labels) {
        this.labels = labels;
    }

    /**
     * 
     * @return
     *     The pagemap
     */
    public Pagemap getPagemap() {
        return pagemap;
    }

    /**
     * 
     * @param pagemap
     *     The pagemap
     */
    public void setPagemap(Pagemap pagemap) {
        this.pagemap = pagemap;
    }

    /**
     * 
     * @return
     *     The mime
     */
    public String getMime() {
        return mime;
    }

    /**
     * 
     * @param mime
     *     The mime
     */
    public void setMime(String mime) {
        this.mime = mime;
    }

    /**
     * 
     * @return
     *     The fileFormat
     */
    public String getFileFormat() {
        return fileFormat;
    }

    /**
     * 
     * @param fileFormat
     *     The fileFormat
     */
    public void setFileFormat(String fileFormat) {
        this.fileFormat = fileFormat;
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
        return new HashCodeBuilder().append(kind).append(title).append(htmlTitle).append(link).append(displayLink).append(snippet).append(htmlSnippet).append(cacheId).append(formattedUrl).append(htmlFormattedUrl).append(labels).append(pagemap).append(mime).append(fileFormat).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Item) == false) {
            return false;
        }
        Item rhs = ((Item) other);
        return new EqualsBuilder().append(kind, rhs.kind).append(title, rhs.title).append(htmlTitle, rhs.htmlTitle).append(link, rhs.link).append(displayLink, rhs.displayLink).append(snippet, rhs.snippet).append(htmlSnippet, rhs.htmlSnippet).append(cacheId, rhs.cacheId).append(formattedUrl, rhs.formattedUrl).append(htmlFormattedUrl, rhs.htmlFormattedUrl).append(labels, rhs.labels).append(pagemap, rhs.pagemap).append(mime, rhs.mime).append(fileFormat, rhs.fileFormat).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}
