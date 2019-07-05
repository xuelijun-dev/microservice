package com.xue.springcloud.microserviceapi.service;

import com.xue.springcloud.microserviceapi.entities.Dept;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.validation.Valid;
import java.util.List;
//一个实现了FallbackFactory接口的类DeptClientServiceFallbackFactory

//@FeignClient(value = "MICROSERVICECLOUD-DEPT")
@FeignClient(value = "MICROSERVICE-PROVIDER-DEPT",fallbackFactory = DeptClientServiceFallBackFactory.class)
public interface DeptClientService
{
 @RequestMapping(value = "/dept/get/{id}", method = RequestMethod.GET)
 public Dept get(@PathVariable("id") long id);

 @RequestMapping(value = "/dept/list", method = RequestMethod.GET)
 public List<Dept> list();

 @RequestMapping(value = "/dept/add", method = RequestMethod.POST)
 public boolean add(Dept dept);
}