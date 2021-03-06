package io.atlasmap.v2;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonPropertyDescription;

public class ConvertAreaUnit extends Action implements Serializable {

    private static final long serialVersionUID = 1L;

    protected AreaUnitType fromUnit;

    protected AreaUnitType toUnit;

    /**
     * Gets the value of the fromUnit property.
     * 
     * @return
     *     possible object is
     *     {@link AreaUnitType }
     *     
     */
    public AreaUnitType getFromUnit() {
        return fromUnit;
    }

    /**
     * Sets the value of the fromUnit property.
     * 
     * @param value
     *     allowed object is
     *     {@link AreaUnitType }
     *     
     */
    @JsonPropertyDescription("The area unit to convert from")
    @AtlasActionProperty(title = "From", type = FieldType.STRING)
    public void setFromUnit(AreaUnitType value) {
        this.fromUnit = value;
    }

    /**
     * Gets the value of the toUnit property.
     * 
     * @return
     *     possible object is
     *     {@link AreaUnitType }
     *     
     */
    public AreaUnitType getToUnit() {
        return toUnit;
    }

    /**
     * Sets the value of the toUnit property.
     * 
     * @param value
     *     allowed object is
     *     {@link AreaUnitType }
     *     
     */
    @JsonPropertyDescription("The area unit to convert to")
    @AtlasActionProperty(title = "To", type = FieldType.STRING)
    public void setToUnit(AreaUnitType value) {
        this.toUnit = value;
    }

}
