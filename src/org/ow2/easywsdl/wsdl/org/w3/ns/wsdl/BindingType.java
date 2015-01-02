//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-792 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2010.02.16 at 03:46:51 PM CET 
//


package org.ow2.easywsdl.wsdl.org.w3.ns.wsdl;

import java.util.ArrayList;
import java.util.List;
import ae.javax.xml.bind.JAXBElement;
import ae.javax.xml.bind.annotation.XmlAccessType;
import ae.javax.xml.bind.annotation.XmlAccessorType;
import ae.javax.xml.bind.annotation.XmlAnyElement;
import ae.javax.xml.bind.annotation.XmlAttribute;
import ae.javax.xml.bind.annotation.XmlElementRef;
import ae.javax.xml.bind.annotation.XmlElementRefs;
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
import org.w3c.dom.Element;


/**
 * <p>Java class for BindingType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BindingType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.w3.org/ns/wsdl}ExtensibleDocumentedType">
 *       &lt;choice maxOccurs="unbounded" minOccurs="0">
 *         &lt;element name="operation" type="{http://www.w3.org/ns/wsdl}BindingOperationType"/>
 *         &lt;element name="fault" type="{http://www.w3.org/ns/wsdl}BindingFaultType"/>
 *         &lt;any processContents='lax' namespace='##other'/>
 *       &lt;/choice>
 *       &lt;attribute name="name" use="required" type="{http://www.w3.org/2001/XMLSchema}NCName" />
 *       &lt;attribute name="type" use="required" type="{http://www.w3.org/2001/XMLSchema}anyURI" />
 *       &lt;attribute name="interface" type="{http://www.w3.org/2001/XMLSchema}QName" />
 *       &lt;anyAttribute processContents='lax' namespace='##other'/>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BindingType", propOrder = {
    "operationOrFaultOrAny"
})
public class BindingType
    extends ExtensibleDocumentedType
    implements CopyTo, Copyable, Equals, HashCode, ToString
{

    @XmlElementRefs({
        @XmlElementRef(name = "fault", namespace = "http://www.w3.org/ns/wsdl", type = JAXBElement.class),
        @XmlElementRef(name = "operation", namespace = "http://www.w3.org/ns/wsdl", type = JAXBElement.class)
    })
    @XmlAnyElement(lax = true)
    protected List<Object> operationOrFaultOrAny;
    @XmlAttribute(required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NCName")
    protected String name;
    @XmlAttribute(required = true)
    @XmlSchemaType(name = "anyURI")
    protected String type;
    @XmlAttribute(name = "interface")
    protected QName _interface;

    /**
     * Gets the value of the operationOrFaultOrAny property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the operationOrFaultOrAny property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOperationOrFaultOrAny().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Element }
     * {@link JAXBElement }{@code <}{@link BindingOperationType }{@code >}
     * {@link JAXBElement }{@code <}{@link BindingFaultType }{@code >}
     * {@link Object }
     * 
     * 
     */
    public List<Object> getOperationOrFaultOrAny() {
        if (operationOrFaultOrAny == null) {
            operationOrFaultOrAny = new ArrayList<Object>();
        }
        return this.operationOrFaultOrAny;
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
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setType(String value) {
        this.type = value;
    }

    /**
     * Gets the value of the interface property.
     * 
     * @return
     *     possible object is
     *     {@link QName }
     *     
     */
    public QName getInterface() {
        return _interface;
    }

    /**
     * Sets the value of the interface property.
     * 
     * @param value
     *     allowed object is
     *     {@link QName }
     *     
     */
    public void setInterface(QName value) {
        this._interface = value;
    }

    public void toString(ToStringBuilder toStringBuilder) {
        super.toString(toStringBuilder);
        {
            List<Object> theOperationOrFaultOrAny;
            theOperationOrFaultOrAny = this.getOperationOrFaultOrAny();
            toStringBuilder.append("operationOrFaultOrAny", theOperationOrFaultOrAny);
        }
        {
            String theName;
            theName = this.getName();
            toStringBuilder.append("name", theName);
        }
        {
            String theType;
            theType = this.getType();
            toStringBuilder.append("type", theType);
        }
        {
            QName theInterface;
            theInterface = this.getInterface();
            toStringBuilder.append("_interface", theInterface);
        }
    }

    public String toString() {
        final ToStringBuilder toStringBuilder = new JAXBToStringBuilder(this);
        toString(toStringBuilder);
        return toStringBuilder.toString();
    }

    public void equals(Object object, EqualsBuilder equalsBuilder) {
        if (!(object instanceof BindingType)) {
            equalsBuilder.appendSuper(false);
            return ;
        }
        if (this == object) {
            return ;
        }
        super.equals(object, equalsBuilder);
        final BindingType that = ((BindingType) object);
        equalsBuilder.append(this.getOperationOrFaultOrAny(), that.getOperationOrFaultOrAny());
        equalsBuilder.append(this.getName(), that.getName());
        equalsBuilder.append(this.getType(), that.getType());
        equalsBuilder.append(this.getInterface(), that.getInterface());
    }

    public boolean equals(Object object) {
        if (!(object instanceof BindingType)) {
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
        hashCodeBuilder.append(this.getOperationOrFaultOrAny());
        hashCodeBuilder.append(this.getName());
        hashCodeBuilder.append(this.getType());
        hashCodeBuilder.append(this.getInterface());
    }

    public int hashCode() {
        final HashCodeBuilder hashCodeBuilder = new JAXBHashCodeBuilder();
        hashCode(hashCodeBuilder);
        return hashCodeBuilder.toHashCode();
    }

    public Object copyTo(Object target, CopyBuilder copyBuilder) {
        final BindingType copy = ((target == null)?((BindingType) createCopy()):((BindingType) target));
        super.copyTo(copy, copyBuilder);
        {
            List<Object> sourceOperationOrFaultOrAny;
            sourceOperationOrFaultOrAny = this.getOperationOrFaultOrAny();
            List<Object> copyOperationOrFaultOrAny = ((List<Object> ) copyBuilder.copy(sourceOperationOrFaultOrAny));
            copy.operationOrFaultOrAny = null;
            List<Object> uniqueOperationOrFaultOrAnyl = copy.getOperationOrFaultOrAny();
            uniqueOperationOrFaultOrAnyl.addAll(copyOperationOrFaultOrAny);
        }
        {
            String sourceName;
            sourceName = this.getName();
            String copyName = ((String) copyBuilder.copy(sourceName));
            copy.setName(copyName);
        }
        {
            String sourceType;
            sourceType = this.getType();
            String copyType = ((String) copyBuilder.copy(sourceType));
            copy.setType(copyType);
        }
        {
            QName sourceInterface;
            sourceInterface = this.getInterface();
            QName copyInterface = ((QName) copyBuilder.copy(sourceInterface));
            copy.setInterface(copyInterface);
        }
        return copy;
    }

    public Object copyTo(Object target) {
        final CopyBuilder copyBuilder = new JAXBCopyBuilder();
        return copyTo(target, copyBuilder);
    }

    public Object createCopy() {
        return new BindingType();
    }

}
