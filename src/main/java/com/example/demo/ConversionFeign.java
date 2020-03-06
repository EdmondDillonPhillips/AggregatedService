package com.example.demo;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

//import com.gasolution.distanceunit.controllers.GetMapping;
//import com.gasolution.distanceunit.controllers.PathVariable;
//import com.gasolution.distanceunit.controllers.RequestParam;

@FeignClient(name="distanceunit-repository")
public interface ConversionFeign {
	
	@GetMapping("api/convert/{from}/to/{to}")
    public Double convert(@RequestParam Double unit, @PathVariable String from, @PathVariable String to);

}
