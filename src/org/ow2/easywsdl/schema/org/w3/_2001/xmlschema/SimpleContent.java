//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-792 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2010.02.16 at 09:57:53 AM CET 
//


package org.ow2.easywsdl.schema.org.w3._2001.xmlschema;

import ae.javax.xml.bind.annotation.XmlAccessType;
import ae.javax.xml.bind.annotation.XmlAccessorType;
import ae.javax.xml.bind.annotation.XmlRootElement;
import ae.javax.xml.bind.annotation.XmlType;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.jvnet.jaxb2_commons.lang.CopyTo;
import org.jvnet.jaxb2_commons.lang.Copyable;
import org.jvnet.jaxb2_commons.lang.Equals;
import org.jvnet.jaxb2_commons.lang.HashCode;
import org.jvnet.jaxb2_commons.lang.ToString;
import org.jvnet.jaxb2_commons.lang.builder.CopyBuilder;
import org.jvnet.jaxb2_commons.lang.builder.JAXBCopyBuilder;
import org.jvnet.jaxb2_commons.lang.builder.JAXBEqualsBuilder;
import org.jvnet.jaxb2_commons.lang.builder.JAXBHashCodeBuilder;
import org.jvnet.jaxb2_commons.lang.builder.JAXBToStringBuilder;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.w3.org/2001/XMLSchema}annotated">
 *       &lt;choice>
 *         &lt;element name="restriction" type="{http://www.w3.org/2001/XMLSchema}simpleRestrictionType"/>
 *         &lt;element name="extension" type="{http://www.w3.org/2001/XMLSchema}simpleExtensionType"/>
 *       &lt;/choice>
 *       &lt;anyAttribute processContents='lax' namespace='##other'/>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "restriction",
    "extension"
})
@XmlRootElement(name = "simpleContent")
public class SimpleContent
    extends Annotated
    implements CopyTo, Copyable, Equals, HashCode, ToString
{

    protected SimpleRestrictionType restriction;
    protected SimpleExtensionType extension;

    /**
     * Gets the value of the restriction property.
     * 
     * @return
     *     possible object is
     *     {@link SimpleRestrictionType }
     *     
     */
    public SimpleRestrictionType getRestriction() {
        return restriction;
    }

    /**
     * Sets the value of the restriction property.
     * 
     * @param value
     *     allowed object is
     *     {@link SimpleRestrictionType }
     *     
     */
    public void setRestriction(SimpleRestrictionType value) {
        this.restriction = value;
    }

    /**
     * Gets the value of the extension property.
     * 
     * @return
     *     possible object is
     *     {@link SimpleExtensionType }
     *     
     */
    public SimpleExtensionType getExtension() {
        return extension;
    }

    /**
     * Sets the value of the extension property.
     * 
     * @param value
     *     allowed object is
     *     {@link SimpleExtensionType }
     *     
     */
    public void setExtension(SimpleExtensionType value) {
        this.extension = value;
    }

    public void toString(ToStringBuilder toStringBuilder) {
        super.toString(toStringBuilder);
        {
            SimpleRestrictionType theRestriction;
            theRestriction = this.getRestriction();
            toStringBuilder.append("restriction", theRestriction);
        }
        {
            SimpleExtensionType theExtension;
            theExtension = this.getExtension();
            toStringBuilder.append("extension", theExtension);
        }
    }

    public String toString() {
        final ToStringBuilder toStringBuilder = new JAXBToStringBuilder(this);
        toString(toStringBuilder);
        return toStringBuilder.toString();
    }

    public void equals(Object object, EqualsBuilder equalsBuilder) {
        if (!(object instanceof SimpleContent)) {
            equalsBuilder.appendSuper(false);
            return ;
        }
        if (this == object) {
            return ;
        }
        super.equals(object, equalsBuilder);
        final SimpleContent that = ((SimpleContent) object);
        equalsBuilder.append(this.getRestriction(), that.getRestriction());
        equalsBuilder.append(this.getExtension(), that.getExtension());
    }

    public boolean equals(Object object) {
        if (!(object instanceof SimpleContent)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final EqualsBuilder equalsBuilder = new JAXBEqualsBuilder();
        equals(object, equalsBuilder);
        return equalsBuilder.isEquals();
    }

    public void hashCode(HashCodeBuilder hashCodeBuilder) {
        super.hashCode(hashCodeBuilder);
        hashCodeBuilder.append(this.getRestriction());
        hashCodeBuilder.append(this.getExtension());
    }

    public int hashCode() {
        final HashCodeBuilder hashCodeBuilder = new JAXBHashCodeBuilder();
        hashCode(hashCodeBuilder);
        return hashCodeBuilder.toHashCode();
    }

    public Object copyTo(Object target, CopyBuilder copyBuilder) {
        final SimpleContent copy = ((target == null)?((SimpleContent) createCopy()):((SimpleContent) target));
        super.copyTo(copy, copyBuilder);
        {
            SimpleRestrictionType sourceRestriction;
            sourceRestriction = this.getRestriction();
            SimpleRestrictionType copyRestriction = ((SimpleRestrictionType) copyBuilder.copy(sourceRestriction));
            copy.setRestriction(copyRestriction);
        }
        {
            SimpleExtensionType sourceExtension;
            sourceExtension = this.getExtension();
            SimpleExtensionType copyExtension = ((SimpleExtensionType) copyBuilder.copy(sourceExtension));
            copy.setExtension(copyExtension);
        }
        return copy;
    }

    public Object copyTo(Object target) {
        final CopyBuilder copyBuilder = new JAXBCopyBuilder();
        return copyTo(target, copyBuilder);
    }

    public Object createCopy() {
        return new SimpleContent();
    }

}