package com.java.iapps.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.java.iapps.service.XmlParserService;

@RestController
@RequestMapping("/api")
public class XmlParserController {
		
	@Autowired
	private XmlParserService xmlParserService;
	
	@PostMapping("/parse/xml")
	public ResponseEntity<?> parseXml(@RequestParam("xmlFile") MultipartFile file){
		return xmlParserService.parseXml(file);
	}
	
	@GetMapping("/epapers")
    public ResponseEntity<?> getAllEpaperList(@RequestParam(defaultValue = "abb") String query, Pageable pageable) {
        return ResponseEntity.ok(xmlParserService.getAllEpaper(query,pageable));
    }
	
}
