package com.technosignia.com.QuickEstate.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.technosignia.com.QuickEstate.entity.Properties;
import com.technosignia.com.QuickEstate.repository.PropertiesRepository;
@Service
public class PropertiesService {
	@Autowired
	PropertiesRepository propertiesRepository;
	
	public Properties createDetails(Properties properties) {
		return propertiesRepository.save(properties);
	}
	
	public List<Properties>findAll(){
		return propertiesRepository.findAll();
	}
}
