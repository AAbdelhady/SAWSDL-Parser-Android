//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-792 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2010.02.16 at 03:46:51 PM CET 
//


package org.ow2.easywsdl.wsdl.org.xmlsoap.schemas.wsdl;

import java.util.ArrayList;
import java.util.List;
import ae.javax.xml.bind.JAXBElement;
import ae.javax.xml.bind.annotation.XmlAccessType;
import ae.javax.xml.bind.annotation.XmlAccessorType;
import ae.javax.xml.bind.annotation.XmlAttribute;
import ae.javax.xml.bind.annotation.XmlElementRef;
import ae.javax.xml.bind.annotation.XmlElementRefs;
import ae.javax.xml.bind.annotation.XmlSchemaType;
import ae.javax.xml.bind.annotation.XmlType;
import ae.javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import ae.javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
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
 * <p>Java class for tOperation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="tOperation">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.xmlsoap.org/wsdl/}tExtensibleDocumented">
 *       &lt;sequence>
 *         &lt;choice>
 *           &lt;group ref="{http://schemas.xmlsoap.org/wsdl/}request-response-or-one-way-operation"/>
 *           &lt;group ref="{http://schemas.xmlsoap.org/wsdl/}solicit-response-or-notification-operation"/>
 *         &lt;/choice>
 *       &lt;/sequence>
 *       &lt;attribute name="name" use="required" type="{http://www.w3.org/2001/XMLSchema}NCName" />
 *       &lt;attribute name="parameterOrder" type="{http://www.w3.org/2001/XMLSchema}NMTOKENS" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tOperation", propOrder = {
    "rest"
})
public class TOperation
    extends TExtensibleDocumented
    implements CopyTo, Copyable, Equals, HashCode, ToString
{

    @XmlElementRefs({
        @XmlElementRef(name = "input", namespace = "http://schemas.xmlsoap.org/wsdl/", type = JAXBElement.class),
        @XmlElementRef(name = "fault", namespace = "http://schemas.xmlsoap.org/wsdl/", type = JAXBElement.class),
        @XmlElementRef(name = "output", namespace = "http://schemas.xmlsoap.org/wsdl/", type = JAXBElement.class)
    })
    protected List<JAXBElement<? extends TExtensibleAttributesDocumented>> rest;
    @XmlAttribute(required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NCName")
    protected String name;
    @XmlAttribute
    @XmlSchemaType(name = "NMTOKENS")
    protected List<String> parameterOrder;

    /**
     * Gets the rest of the content model. 
     * 
     * <p>
     * You are getting this "catch-all" property because of the following reason: 
     * The field name "Output" is used by two different parts of a schema. See: 
     * line 202 of file:/home/ccasadei/projets/easywsdl/modules/org.ow2.easywsdl.wsdl/target/checkout/src/main/resources/schema/wsdl/wsdl11/wsdl11.xsd
     * line 194 of file:/home/ccasadei/projets/easywsdl/modules/org.ow2.easywsdl.wsdl/target/checkout/src/main/resources/schema/wsdl/wsdl11/wsdl11.xsd
     * <p>
     * To get rid of this property, apply a property customization to one 
     * of both of the following declarations to change their names: 
     * Gets the value of the rest property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the rest property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRest().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link TFault }{@code >}
     * {@link JAXBElement }{@code <}{@link TParam }{@code >}
     * {@link JAXBElement }{@code <}{@link TParam }{@code >}
     * 
     * 
     */
    public List<JAXBElement<? extends TExtensibleAttributesDocumented>> getRest() {
        if (rest == null) {
            rest = new ArrayList<JAXBElement<? extends TExtensibleAttributesDocumented>>();
        }
        return this.rest;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the parameterOrder property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the parameterOrder property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getParameterOrder().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getParameterOrder() {
        if (parameterOrder == null) {
            parameterOrder = new ArrayList<String>();
        }
        return this.parameterOrder;
    }

    public void toString(ToStringBuilder toStringBuilder) {
        super.toString(toStringBuilder);
        {
            List<JAXBElement<? extends TExtensibleAttributesDocumented>> theRest;
            theRest = this.getRest();
            toStringBuilder.append("rest", theRest);
        }
        {
            String theName;
            theName = this.getName();
            toStringBuilder.append("name", theName);
        }
        {
            List<String> theParameterOrder;
            theParameterOrder = this.getParameterOrder();
            toStringBuilder.append("parameterOrder", theParameterOrder);
        }
    }

    public String toString() {
        final ToStringBuilder toStringBuilder = new JAXBToStringBuilder(this);
        toString(toStringBuilder);
        return toStringBuilder.toString();
    }

    public void equals(Object object, EqualsBuilder equalsBuilder) {
        if (!(object instanceof TOperation)) {
            equalsBuilder.appendSuper(false);
            return ;
        }
        if (this == object) {
            return ;
        }
        super.equals(object, equalsBuilder);
        final TOperation that = ((TOperation) object);
        equalsBuilder.append(this.getRest(), that.getRest());
        equalsBuilder.append(this.getName(), that.getName());
        equalsBuilder.append(this.getParameterOrder(), that.getParameterOrder());
    }

    public boolean equals(Object object) {
        if (!(object instanceof TOperation)) {
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
        hashCodeBuilder.append(this.getRest());
        hashCodeBuilder.append(this.getName());
        hashCodeBuilder.append(this.getParameterOrder());
    }

    public int hashCode() {
        final HashCodeBuilder hashCodeBuilder = new JAXBHashCodeBuilder();
        hashCode(hashCodeBuilder);
        return hashCodeBuilder.toHashCode();
    }

    public Object copyTo(Object target, CopyBuilder copyBuilder) {
        final TOperation copy = ((target == null)?((TOperation) createCopy()):((TOperation) target));
        super.copyTo(copy, copyBuilder);
        {
            List<JAXBElement<? extends TExtensibleAttributesDocumented>> sourceRest;
            sourceRest = this.getRest();
            List<JAXBElement<? extends TExtensibleAttributesDocumented>> copyRest = ((List<JAXBElement<? extends TExtensibleAttributesDocumented>> ) copyBuilder.copy(sourceRest));
            copy.rest = null;
            List<JAXBElement<? extends TExtensibleAttributesDocumented>> uniqueRestl = copy.getRest();
            uniqueRestl.addAll(copyRest);
        }
        {
            String sourceName;
            sourceName = this.getName();
            String copyName = ((String) copyBuilder.copy(sourceName));
            copy.setName(copyName);
        }
        {
            List<String> sourceParameterOrder;
            sourceParameterOrder = this.getParameterOrder();
            List<String> copyParameterOrder = ((List<String> ) copyBuilder.copy(sourceParameterOrder));
            copy.parameterOrder = null;
            List<String> uniqueParameterOrderl = copy.getParameterOrder();
            uniqueParameterOrderl.addAll(copyParameterOrder);
        }
        return copy;
    }

    public Object copyTo(Object target) {
        final CopyBuilder copyBuilder = new JAXBCopyBuilder();
        return copyTo(target, copyBuilder);
    }

    public Object createCopy() {
        return new TOperation();
    }

}
