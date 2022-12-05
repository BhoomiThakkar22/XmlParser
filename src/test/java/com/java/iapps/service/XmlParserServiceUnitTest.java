package com.java.iapps.service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.doReturn;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;

import com.java.iapps.entity.Epaper;
import com.java.iapps.repository.EpaperRepository;
import com.java.iapps.util.PaginatedResponse;

@RunWith(MockitoJUnitRunner.class)
@ExtendWith(MockitoExtension.class)
public class XmlParserServiceUnitTest { 
	
	@InjectMocks
	private XmlParserServiceImpl service;
	
	@Mock
	private EpaperRepository repository;
	
	@Test
	public void testgetAllEpaperList(){
		
		Epaper epaper = new  Epaper();
		String s = "abb";
		Pageable pageable = Pageable.ofSize(1);
		List<Epaper> epaprList = new ArrayList<Epaper>();
		epaprList.add(epaper);
		Page<Epaper> epaperPage = new PageImpl<>(epaprList, Pageable.ofSize(1), 1);
		
		doReturn(epaperPage).when(repository).findAllByNewsPapereNameContains(s, pageable);
		PaginatedResponse res = service.getAllEpaper(s,pageable);
		
		assertEquals(epaprList, res.getEpaperList());
	}
	 
}
