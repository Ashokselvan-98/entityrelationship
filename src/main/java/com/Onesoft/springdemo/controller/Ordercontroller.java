package com.Onesoft.springdemo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.Onesoft.springdemo.entity.Order;
import com.Onesoft.springdemo.service.Orderservice;

@RestController
public class Ordercontroller {
	@Autowired
	Orderservice os;

	@PostMapping("senddata")
	public String sendall(@RequestBody List<Order> pp) {
		return os.sendall(pp);
	}

	@GetMapping("/show")
	public Object show() {
		return os.show();
	}

	@GetMapping("/show1")
	public List<Object> show1() {
		return os.show1();
	}
}
