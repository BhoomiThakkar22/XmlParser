package com.java.iapps.dto;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlElements;
import jakarta.xml.bind.annotation.XmlRootElement;
import lombok.Data;

/**
 * Model class for epaper request tag.
 */

@Data
@XmlRootElement(name = "epaperRequest")
@XmlAccessorType(XmlAccessType.FIELD)
public class EpaperRequestDto {

    @XmlElement
    private DeviceInfoDto deviceInfo;

    @XmlElement
    private GetPagesDto getPages;
}
