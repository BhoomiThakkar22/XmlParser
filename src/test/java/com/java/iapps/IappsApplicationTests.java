package com.java.iapps;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class IappsApplicationTests {
	
	@Test
	void contextLoads() {

	}
	
	
	//for 200
	/*
	 * @Test void testgetAllEpaperList() { MockMultipartFile file = new
	 * MockMultipartFile("data", "filename.xml", "text/plain",
	 * "some xml".getBytes());
	 * when(service.parseXml(ArgumentMatchers.any())).thenReturn(ResponseEntity.ok()
	 * .build()); ResponseEntity<?> res = controller.parseXml(file);
	 * assertEquals(200, res.getStatusCode()); }
	 */
	
	//for badRequest
	/*
	 * @Test void testgetAllEpaperList401() {
	 * when(service.parseXml(ArgumentMatchers.any())).thenReturn(ResponseEntity.ok()
	 * .build()); MockMultipartFile file = new MockMultipartFile("data",
	 * "filename.xml", "text/plain", "some xml".getBytes()); ResponseEntity<?> res =
	 * controller.parseXml(file); assertEquals(400, res.getStatusCode()); }
	 */

}
