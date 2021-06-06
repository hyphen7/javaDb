package com.example.demo.service;

import java.util.List;

import com.example.demo.dto.Emp;

public interface EmpService {

	public List<Emp> retrive();
	
	public Emp retrive(String id);
}
