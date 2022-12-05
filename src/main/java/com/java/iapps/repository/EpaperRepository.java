package com.java.iapps.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.java.iapps.entity.Epaper;

@Repository
public interface EpaperRepository extends JpaRepository<Epaper, Long>{
    Page<Epaper> findAllByNewsPapereNameContains(String name, Pageable pageable);

}
