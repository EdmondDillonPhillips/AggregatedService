package com.example.demo;

import java.util.ArrayList;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AggregatedServiceController {
	
	@PostMapping(path="/api/experiment", consumes = "application/json", produces = "application/json")
	public void addExperimentData(@RequestBody ExperimentModel experimentData ) {
		
	}
	
	@GetMapping(path="/api/experiment/{id}")
	public ArrayList<ExperimentModel> getExperimentData() {
		
	}
}
