//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-792 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2010.02.16 at 03:46:51 PM CET 
//


package org.ow2.easywsdl.wsdl.org.xmlsoap.schemas.wsdl;

import ae.javax.xml.bind.annotation.XmlAccessType;
import ae.javax.xml.bind.annotation.XmlAccessorType;
import ae.javax.xml.bind.annotation.XmlAttribute;
import ae.javax.xml.bind.annotation.XmlSchemaType;
import ae.javax.xml.bind.annotation.XmlType;
import ae.javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import ae.javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.namespace.QName;
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
 * <p>Java class for tPort complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="tPort">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.xmlsoap.org/wsdl/}tExtensibleDocumented">
 *       &lt;attribute name="name" use="required" type="{http://www.w3.org/2001/XMLSchema}NCName" />
 *       &lt;attribute name="binding" use="required" type="{http://www.w3.org/2001/XMLSchema}QName" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tPort")
public class TPort
    extends TExtensibleDocumented
    implements CopyTo, Copyable, Equals, HashCode, ToString
{

    @XmlAttribute(required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NCName")
    protected String name;
    @XmlAttribute(required = true)
    protected QName binding;

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
     * Gets the value of the binding property.
     * 
     * @return
     *     possible object is
     *     {@link QName }
     *     
     */
    public QName getBinding() {
        return binding;
    }

    /**
     * Sets the value of the binding property.
     * 
     * @param value
     *     allowed object is
     *     {@link QName }
     *     
     */
    public void setBinding(QName value) {
        this.binding = value;
    }

    public void toString(ToStringBuilder toStringBuilder) {
        super.toString(toStringBuilder);
        {
            String theName;
            theName = this.getName();
            toStringBuilder.append("name", theName);
        }
        {
            QName theBinding;
            theBinding = this.getBinding();
            toStringBuilder.append("binding", theBinding);
        }
    }

    public String toString() {
        final ToStringBuilder toStringBuilder = new JAXBToStringBuilder(this);
        toString(toStringBuilder);
        return toStringBuilder.toString();
    }

    public void equals(Object object, EqualsBuilder equalsBuilder) {
        if (!(object instanceof TPort)) {
            equalsBuilder.appendSuper(false);
            return ;
        }
        if (this == object) {
            return ;
        }
        super.equals(object, equalsBuilder);
        final TPort that = ((TPort) object);
        equalsBuilder.append(this.getName(), that.getName());
        equalsBuilder.append(this.getBinding(), that.getBinding());
    }

    public boolean equals(Object object) {
        if (!(object instanceof TPort)) {
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
        hashCodeBuilder.append(this.getName());
        hashCodeBuilder.append(this.getBinding());
    }

    public int hashCode() {
        final HashCodeBuilder hashCodeBuilder = new JAXBHashCodeBuilder();
        hashCode(hashCodeBuilder);
        return hashCodeBuilder.toHashCode();
    }

    public Object copyTo(Object target, CopyBuilder copyBuilder) {
        final TPort copy = ((target == null)?((TPort) createCopy()):((TPort) target));
        super.copyTo(copy, copyBuilder);
        {
            String sourceName;
            sourceName = this.getName();
            String copyName = ((String) copyBuilder.copy(sourceName));
            copy.setName(copyName);
        }
        {
            QName sourceBinding;
            sourceBinding = this.getBinding();
            QName copyBinding = ((QName) copyBuilder.copy(sourceBinding));
            copy.setBinding(copyBinding);
        }
        return copy;
    }

    public Object copyTo(Object target) {
        final CopyBuilder copyBuilder = new JAXBCopyBuilder();
        return copyTo(target, copyBuilder);
    }

    public Object createCopy() {
        return new TPort();
    }

}
