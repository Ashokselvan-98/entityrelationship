package com.Onesoft.springdemo.controller;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component("senior")
@Primary
public class Senioremp implements Emp {
	public String getmsg() {
		return "this is senior";
	}

}
