package com.technosignia.com.QuickEstate.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.technosignia.com.QuickEstate.entity.Properties;
import com.technosignia.com.QuickEstate.service.PropertiesService;


@RestController
public class PropertiesController {
	@Autowired
	PropertiesService propertiesService;
	
	@PostMapping("/properties")
	public Properties createPropertiesDetails(@RequestBody Properties properties)
	{
		return propertiesService.createDetails(properties);
	}
	
	@GetMapping("/properties")
	public List<Properties>findAll(){
		return propertiesService.findAll();
	}
}
