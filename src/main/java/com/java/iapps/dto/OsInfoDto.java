package com.java.iapps.dto;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlRootElement;
import lombok.Data;

@Data
@XmlRootElement(name = "osInfo")
@XmlAccessorType(XmlAccessType.FIELD)
public class OsInfoDto {
	    @XmlAttribute
	    private String name;

	    @XmlAttribute
	    private Double version;
}
