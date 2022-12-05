package com.java.iapps.dto;

import java.util.Date;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlRootElement;
import lombok.Data;

@Data
@XmlRootElement(name = "getPages")
@XmlAccessorType(XmlAccessType.FIELD)
public class GetPagesDto {
	@XmlAttribute
    private Long editionDefId;

    @XmlAttribute
    private Date publicationDate;
}
