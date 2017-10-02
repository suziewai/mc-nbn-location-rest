
package com.exacttarget.wsdl.partnerapi;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DailyRecurrencePatternTypeEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="DailyRecurrencePatternTypeEnum"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Interval"/&gt;
 *     &lt;enumeration value="EveryWeekDay"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "DailyRecurrencePatternTypeEnum")
@XmlEnum
public enum DailyRecurrencePatternTypeEnum {

    @XmlEnumValue("Interval")
    INTERVAL("Interval"),
    @XmlEnumValue("EveryWeekDay")
    EVERY_WEEK_DAY("EveryWeekDay");
    private final String value;

    DailyRecurrencePatternTypeEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DailyRecurrencePatternTypeEnum fromValue(String v) {
        for (DailyRecurrencePatternTypeEnum c: DailyRecurrencePatternTypeEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
