
package com.exacttarget.wsdl.partnerapi;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UnsubscribeBehaviorEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="UnsubscribeBehaviorEnum"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="ENTIRE_ENTERPRISE"/&gt;
 *     &lt;enumeration value="BUSINESS_UNIT_ONLY"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "UnsubscribeBehaviorEnum")
@XmlEnum
public enum UnsubscribeBehaviorEnum {

    ENTIRE_ENTERPRISE,
    BUSINESS_UNIT_ONLY;

    public String value() {
        return name();
    }

    public static UnsubscribeBehaviorEnum fromValue(String v) {
        return valueOf(v);
    }

}
