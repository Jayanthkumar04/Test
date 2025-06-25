package com.example.demo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

	
	@GetMapping("/hello")
	public String one()
	{
		return "hello world";
	}
	
	@GetMapping("/all")
	public List<String> getAll()
	{
		List<String> names = new ArrayList<>();
		names.add("jayanht");
		names.add("manish");
		names.add("ascendion");
		
		return names;
	}
	
}
