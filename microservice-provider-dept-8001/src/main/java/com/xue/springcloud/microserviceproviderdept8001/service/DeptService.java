package com.xue.springcloud.microserviceproviderdept8001.service;


import com.xue.springcloud.microserviceapi.entities.Dept;
import org.springframework.stereotype.Service;

import java.util.List;

public interface DeptService
{
	public boolean add(Dept dept);

	public Dept get(Long id);

	public List<Dept> list();
}
