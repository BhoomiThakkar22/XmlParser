package com.java.iapps.dto;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import lombok.Data;

@Data
@XmlRootElement(name = "deviceInfo")
@XmlAccessorType(XmlAccessType.FIELD)
public class DeviceInfoDto {
	    @XmlElement
	    private ScreenInfoDto screenInfo;

	    @XmlElement
	    private OsInfoDto osInfo;

	    @XmlElement
	    private AppInfoDto appInfo;

	    @XmlAttribute
	    private String name;

	    @XmlAttribute
	    private String id;
}
