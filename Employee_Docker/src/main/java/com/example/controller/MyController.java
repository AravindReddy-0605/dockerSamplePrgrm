package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.classes.MyClass;
import com.example.services.ServiceInterface;

@RestController
public class MyController {

	@Autowired
	private ServiceInterface service;
	
	@PostMapping(value = "/save")
	public void insert(@RequestBody MyClass cls) {
		
		service.saveDetails(cls);
		
	}
	
}
