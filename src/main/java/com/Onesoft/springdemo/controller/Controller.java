package com.Onesoft.springdemo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@RestController
public class Controller {
	@Autowired
	@Qualifier("junior")
	Emp e;
//	@Value("selva")
	@Value("$(NISHA)")
     String name;
	//int name;

	@GetMapping("get")
	public String get() {
		return "Hello " + name;
	}

	@GetMapping("getmsg")
	public String get1() {
		return e.getmsg();
	}

}
