package com.temelt.arizatakip.service;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.temelt.arizatakip.entity.Cagri;

/**
 * 
 * @author taner.temel
 *
 */
@Repository
public interface CagriService extends JpaRepository<Cagri, Long> {


	List<Cagri> getByBaslik(String baslik);
	
}
