package com.usman.controller;

import java.util.Date;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.usman.dao.ModelDao;
import com.usman.model.Model;

@RestController
public class RestAPI {
	
	@GetMapping("/welcome")
	public String welcome() {
		
		Date dt = new Date() ;
		
		String d = dt.toString() ;
		
		List<Model> elist =  ModelDao.getCustomers() ;
		
		return d + "List is" + elist ;
		
	}

}
