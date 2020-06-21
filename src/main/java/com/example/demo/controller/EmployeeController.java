package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Employee;

@RestController
public class EmployeeController {
	
	
	@GetMapping("/employee")
	public String getEmployee () {
		return "hello";
	}
	
	@PostMapping("/employee")
	public String addEmployee(@RequestBody Employee emp) {
		
		System.out.println("ddd"+emp.getName());
		
		return emp.getName() ;
	}
	

}
