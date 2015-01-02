//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-792 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2010.02.16 at 03:46:51 PM CET 
//


package org.ow2.easywsdl.wsdl.org.w3.ns.wsdl.rpc;

import ae.javax.xml.bind.annotation.XmlEnum;
import ae.javax.xml.bind.annotation.XmlEnumValue;
import ae.javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for directionToken.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="directionToken">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="#in"/>
 *     &lt;enumeration value="#out"/>
 *     &lt;enumeration value="#inout"/>
 *     &lt;enumeration value="#return"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "directionToken", namespace = "http://www.w3.org/ns/wsdl/rpc")
@XmlEnum
public enum DirectionToken {

    @XmlEnumValue("#in")
    IN("#in"),
    @XmlEnumValue("#out")
    OUT("#out"),
    @XmlEnumValue("#inout")
    INOUT("#inout"),
    @XmlEnumValue("#return")
    RETURN("#return");
    private final String value;

    DirectionToken(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DirectionToken fromValue(String v) {
        for (DirectionToken c: DirectionToken.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}