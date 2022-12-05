package com.java.iapps.mapper;

import java.time.LocalDateTime;

import org.springframework.stereotype.Component;

import com.java.iapps.dto.EpaperRequestDto;
import com.java.iapps.entity.Epaper;

@Component
public class EpaperMapper {

	public Epaper mapModelToEntity(final EpaperRequestDto epaperRequestDto, final String originalFilename) {
		Epaper epaper = new Epaper();
        epaper.setFileName(originalFilename);
        epaper.setNewsPapereName(epaperRequestDto.getDeviceInfo().getAppInfo().getNewspaperName());
        epaper.setHeight(epaperRequestDto.getDeviceInfo().getScreenInfo().getHeight());
        epaper.setWidth(epaperRequestDto.getDeviceInfo().getScreenInfo().getWidth());
        epaper.setDpi(epaperRequestDto.getDeviceInfo().getScreenInfo().getDpi());
        epaper.setUploadTime(LocalDateTime.now());
        return epaper;
	}

}
