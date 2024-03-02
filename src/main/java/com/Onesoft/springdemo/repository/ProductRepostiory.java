package com.Onesoft.springdemo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Onesoft.springdemo.entity.Product;

public interface ProductRepostiory  extends JpaRepository<Product, Integer>{

}
