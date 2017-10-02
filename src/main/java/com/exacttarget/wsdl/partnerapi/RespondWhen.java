
package com.exacttarget.wsdl.partnerapi;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RespondWhen.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="RespondWhen"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Never"/&gt;
 *     &lt;enumeration value="OnError"/&gt;
 *     &lt;enumeration value="Always"/&gt;
 *     &lt;enumeration value="OnConversationError"/&gt;
 *     &lt;enumeration value="OnConversationComplete"/&gt;
 *     &lt;enumeration value="OnCallComplete"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "RespondWhen")
@XmlEnum
public enum RespondWhen {

    @XmlEnumValue("Never")
    NEVER("Never"),
    @XmlEnumValue("OnError")
    ON_ERROR("OnError"),
    @XmlEnumValue("Always")
    ALWAYS("Always"),
    @XmlEnumValue("OnConversationError")
    ON_CONVERSATION_ERROR("OnConversationError"),
    @XmlEnumValue("OnConversationComplete")
    ON_CONVERSATION_COMPLETE("OnConversationComplete"),
    @XmlEnumValue("OnCallComplete")
    ON_CALL_COMPLETE("OnCallComplete");
    private final String value;

    RespondWhen(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static RespondWhen fromValue(String v) {
        for (RespondWhen c: RespondWhen.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
