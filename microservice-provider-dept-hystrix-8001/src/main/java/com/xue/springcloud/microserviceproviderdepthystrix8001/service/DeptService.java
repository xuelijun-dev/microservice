package com.xue.springcloud.microserviceproviderdepthystrix8001.service;


import com.xue.springcloud.microserviceapi.entities.Dept;

import java.util.List;

public interface DeptService
{
	public boolean add(Dept dept);

	public Dept get(Long id);

	public List<Dept> list();
}
