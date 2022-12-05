package com.java.iapps.entity;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name="epaper")
@Getter
@Setter
public class Epaper {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Long id;
	
	@Column
	private String newsPapereName;
	
	@Column
	private Long height;
	
	@Column
	private Long width;
	
	@Column
	private Long dpi;
	
	@Column
	private LocalDateTime uploadTime;
	
	@Column
	private String fileName;
}
