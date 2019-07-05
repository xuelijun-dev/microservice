package com.xue.springcloud.microserviceproviderdept8003.dao;


import com.xue.springcloud.microserviceapi.entities.Dept;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface DeptDao
{
	public boolean addDept(Dept dept);

	public Dept findById(Long id);

	public List<Dept> findAll();
}
