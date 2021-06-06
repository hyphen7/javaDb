package com.example.demo.repository;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.example.demo.dto.Emp;

@Mapper
public interface EmpMapper {
	
	public List<Emp> selectAll();
	
	public Emp select(String id);

}
