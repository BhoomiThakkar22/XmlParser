package com.java.iapps.service;

import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.multipart.MultipartFile;

import com.java.iapps.util.PaginatedResponse;

public interface XmlParserService {

	ResponseEntity<?> parseXml(MultipartFile file);

	PaginatedResponse getAllEpaper(String query, Pageable pageable);

}
