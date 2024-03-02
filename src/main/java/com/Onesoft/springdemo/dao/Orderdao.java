package com.Onesoft.springdemo.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.Onesoft.springdemo.entity.Order;
import com.Onesoft.springdemo.repository.OrderRepository;

@Repository
public class Orderdao {
	@Autowired
	OrderRepository or;

	public String sendall(List<Order> pp) {
		or.saveAll(pp);
		return "sucessfully";
	}

	public Object show() {
		return or.findAll();
	}

	public List<Object> show1() {
		return or.show1();
	}

}
