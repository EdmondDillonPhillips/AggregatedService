package com.example.demo;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name="experimentrepo")
public interface AggregatedFeign {

	@GetMapping("/hi")
	public String sayHello();
	
	@GetMapping("/{from}/to/{to}")
	public String convert();
}
