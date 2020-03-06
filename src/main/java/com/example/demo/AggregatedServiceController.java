package com.example.demo;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AggregatedServiceController {
	
	 @Autowired
	 AggregatedFeign aggregatedFeign;
	 
	 @Autowired ConversionFeign conversionFeign;
	 
	 @GetMapping("/hi")
		public String sayhello() {
		return aggregatedFeign.sayHello();

	}
	 
	 @GetMapping("/api/convert/{from}/to/{to}")
	 public Double convert(@RequestParam Double unit, @PathVariable String from, @PathVariable String to) {
		return conversionFeign.convert(unit, from, to);
	}
	 
	
}
