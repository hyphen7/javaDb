package com.example.demo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.dto.Emp;
import com.example.demo.repository.EmpMapper;

@Service
public class EmpServiceImpl implements EmpService {

	EmpMapper  mapper;
	
	EmpServiceImpl(EmpMapper mapper) {
		this.mapper = mapper;
	}
	
	public List<Emp> retrive() {
		return mapper.selectAll();
	}
	
	public Emp retrive(String id) {
		return mapper.select(id);
	}
}
