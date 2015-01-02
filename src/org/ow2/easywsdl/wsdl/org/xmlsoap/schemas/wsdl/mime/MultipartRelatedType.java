//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-792 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2010.02.16 at 03:46:51 PM CET 
//


package org.ow2.easywsdl.wsdl.org.xmlsoap.schemas.wsdl.mime;

import java.util.ArrayList;
import java.util.List;
import ae.javax.xml.bind.annotation.XmlAccessType;
import ae.javax.xml.bind.annotation.XmlAccessorType;
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
import org.ow2.easywsdl.wsdl.org.xmlsoap.schemas.wsdl.TExtensibilityElement;


/**
 * <p>Java class for multipartRelatedType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="multipartRelatedType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.xmlsoap.org/wsdl/}tExtensibilityElement">
 *       &lt;sequence>
 *         &lt;element name="part" type="{http://schemas.xmlsoap.org/wsdl/mime/}tPart" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "multipartRelatedType", propOrder = {
    "part"
})
public class MultipartRelatedType
    extends TExtensibilityElement
    implements CopyTo, Copyable, Equals, HashCode, ToString
{

    protected List<TPart> part;

    /**
     * Gets the value of the part property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the part property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPart().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TPart }
     * 
     * 
     */
    public List<TPart> getPart() {
        if (part == null) {
            part = new ArrayList<TPart>();
        }
        return this.part;
    }

    public void toString(ToStringBuilder toStringBuilder) {
        super.toString(toStringBuilder);
        {
            List<TPart> thePart;
            thePart = this.getPart();
            toStringBuilder.append("part", thePart);
        }
    }

    public String toString() {
        final ToStringBuilder toStringBuilder = new JAXBToStringBuilder(this);
        toString(toStringBuilder);
        return toStringBuilder.toString();
    }

    public void equals(Object object, EqualsBuilder equalsBuilder) {
        if (!(object instanceof MultipartRelatedType)) {
            equalsBuilder.appendSuper(false);
            return ;
        }
        if (this == object) {
            return ;
        }
        super.equals(object, equalsBuilder);
        final MultipartRelatedType that = ((MultipartRelatedType) object);
        equalsBuilder.append(this.getPart(), that.getPart());
    }

    public boolean equals(Object object) {
        if (!(object instanceof MultipartRelatedType)) {
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
        hashCodeBuilder.append(this.getPart());
    }

    public int hashCode() {
        final HashCodeBuilder hashCodeBuilder = new JAXBHashCodeBuilder();
        hashCode(hashCodeBuilder);
        return hashCodeBuilder.toHashCode();
    }

    public Object copyTo(Object target, CopyBuilder copyBuilder) {
        final MultipartRelatedType copy = ((target == null)?((MultipartRelatedType) createCopy()):((MultipartRelatedType) target));
        super.copyTo(copy, copyBuilder);
        {
            List<TPart> sourcePart;
            sourcePart = this.getPart();
            List<TPart> copyPart = ((List<TPart> ) copyBuilder.copy(sourcePart));
            copy.part = null;
            List<TPart> uniquePartl = copy.getPart();
            uniquePartl.addAll(copyPart);
        }
        return copy;
    }

    public Object copyTo(Object target) {
        final CopyBuilder copyBuilder = new JAXBCopyBuilder();
        return copyTo(target, copyBuilder);
    }

    public Object createCopy() {
        return new MultipartRelatedType();
    }

}