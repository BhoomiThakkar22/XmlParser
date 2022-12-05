package com.java.iapps.dto;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlRootElement;
import lombok.Data;

@Data
@XmlRootElement(name = "screenInfoDto")
@XmlAccessorType(XmlAccessType.FIELD)
public class ScreenInfoDto {
	@XmlAttribute
    private Long width;

    @XmlAttribute
    private Long height;

    @XmlAttribute
    private Long dpi;
}
