package com.Onesoft.springdemo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.web.bind.annotation.GetMapping;

import com.Onesoft.springdemo.entity.Order;

public interface OrderRepository extends JpaRepository<Order, Integer> {

	@Query(value = "select city,price from ordertable join producttable on ordertable.id=producttable.order_fkey", nativeQuery = true)

	public List<Object> show1();

}
