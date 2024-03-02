package com.Onesoft.springdemo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.Onesoft.springdemo.dao.Orderdao;
import com.Onesoft.springdemo.entity.Order;

@Service
public class Orderservice {
	@Autowired
	Orderdao od;

	public String sendall(List<Order> pp) {
		return od.sendall(pp);
	}

	public Object show() {
		return od.show();

	}

	public List<Object> show1() {
		return od.show1();
	}

}
