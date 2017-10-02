
package com.exacttarget.wsdl.partnerapi;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DateTimeUnitOfMeasure.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="DateTimeUnitOfMeasure"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Days"/&gt;
 *     &lt;enumeration value="Weeks"/&gt;
 *     &lt;enumeration value="Months"/&gt;
 *     &lt;enumeration value="Years"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "DateTimeUnitOfMeasure")
@XmlEnum
public enum DateTimeUnitOfMeasure {

    @XmlEnumValue("Days")
    DAYS("Days"),
    @XmlEnumValue("Weeks")
    WEEKS("Weeks"),
    @XmlEnumValue("Months")
    MONTHS("Months"),
    @XmlEnumValue("Years")
    YEARS("Years");
    private final String value;

    DateTimeUnitOfMeasure(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DateTimeUnitOfMeasure fromValue(String v) {
        for (DateTimeUnitOfMeasure c: DateTimeUnitOfMeasure.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
