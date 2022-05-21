package com.usman.controllers;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.usman.dao.ModelMapper;
import com.usman.model.Model;

import lombok.extern.log4j.Log4j2;

@Log4j2
@RestController
@RequestMapping("/")
public class Pages {
	
	@Autowired
	ModelMapper mapper ;
	@RequestMapping("/message")
	public String Message() {
		
		log.info("this inside mapping") ;
		
		List<Model> elist = mapper.getEmployeeList() ;
		
		return new Date().toString() + elist;
		
		
	}

	
	
	
}
