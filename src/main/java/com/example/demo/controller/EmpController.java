package com.example.demo.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.Emp;
import com.example.demo.service.EmpService;

@RestController
@RequestMapping(value = "/")
public class EmpController {

	EmpService service;
	
	EmpController(EmpService service) {
		this.service = service;
	}
	
	@GetMapping
	public List<Emp> emplist() {
		return service.retrive();
	}
	
	@GetMapping("/{id}")
	public Emp emp(@PathVariable("id") String id) {
		return service.retrive(id);
	}
}
