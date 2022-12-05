package com.java.iapps.service;

import java.net.URL;

import javax.xml.XMLConstants;
import javax.xml.transform.stream.StreamSource;
import javax.xml.validation.Schema;
import javax.xml.validation.SchemaFactory;
import javax.xml.validation.Validator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;
import org.xml.sax.SAXException;

import com.java.iapps.dto.EpaperRequestDto;
import com.java.iapps.entity.Epaper;
import com.java.iapps.mapper.EpaperMapper;
import com.java.iapps.repository.EpaperRepository;
import com.java.iapps.util.PaginatedResponse;

import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.Unmarshaller;

@Service
public class XmlParserServiceImpl implements XmlParserService{

	@Autowired
	EpaperRepository repository;
	
	@Autowired
    private EpaperMapper mapper;
	
	@Override
	public ResponseEntity<?> parseXml(MultipartFile file) {
		
		try {
			SchemaFactory sf = SchemaFactory.newInstance(XMLConstants.W3C_XML_SCHEMA_NS_URI);

            JAXBContext context = JAXBContext.newInstance(EpaperRequestDto.class);
            Unmarshaller un = context.createUnmarshaller();
            
            // Create schema from xsd to validate xml
            URL url = getClass().getClassLoader().getResource("EpaperRequest.xsd");
            Schema schema = sf.newSchema(url);
            un.setSchema(schema);

            // Validate XML with XSD
            Validator validator = schema.newValidator();
            validator.validate(new StreamSource(file.getInputStream()));

            EpaperRequestDto epaperRequest = (EpaperRequestDto) un.unmarshal(file.getInputStream());
            Epaper epaper = mapper.mapModelToEntity(epaperRequest, file.getOriginalFilename());

            epaper = repository.save(epaper);
            return ResponseEntity.ok(epaper);
		}catch (SAXException ex) {
            ex.printStackTrace();
            return ResponseEntity.badRequest().body("Given XML is not valid, please check.");
        } catch (Exception e) {
            e.printStackTrace();
            return ResponseEntity.badRequest().build();
        }
	}

	@Override
	public PaginatedResponse getAllEpaper(String query, Pageable pageable) {
		Page<Epaper> ePapers = repository.findAllByNewsPapereNameContains(query, pageable);
        return PaginatedResponse.builder()
                .numberOfItems(ePapers.getTotalElements()).numberOfPages(ePapers.getTotalPages())
                .epaperList(ePapers.getContent())
                .build();
	}

}
