package com.java.iapps.dto;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import lombok.Data;

@Data
@XmlRootElement(name = "appInfo")
@XmlAccessorType(XmlAccessType.FIELD)
public class AppInfoDto {
	    @XmlElement
	    private String newspaperName;

	    @XmlElement
	    private Double version;
}
