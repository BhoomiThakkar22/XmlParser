package com.java.iapps.util;

import java.util.List;

import com.java.iapps.entity.Epaper;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
@AllArgsConstructor
public class PaginatedResponse {
	private List<Epaper> epaperList;
    private Long numberOfItems;
    private int numberOfPages;
    
}
