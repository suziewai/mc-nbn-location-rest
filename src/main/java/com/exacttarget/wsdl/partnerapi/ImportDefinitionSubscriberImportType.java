
package com.exacttarget.wsdl.partnerapi;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ImportDefinitionSubscriberImportType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ImportDefinitionSubscriberImportType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Email"/&gt;
 *     &lt;enumeration value="SMS"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ImportDefinitionSubscriberImportType")
@XmlEnum
public enum ImportDefinitionSubscriberImportType {

    @XmlEnumValue("Email")
    EMAIL("Email"),
    SMS("SMS");
    private final String value;

    ImportDefinitionSubscriberImportType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ImportDefinitionSubscriberImportType fromValue(String v) {
        for (ImportDefinitionSubscriberImportType c: ImportDefinitionSubscriberImportType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
