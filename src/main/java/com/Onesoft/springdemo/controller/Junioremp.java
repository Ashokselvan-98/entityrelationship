package com.Onesoft.springdemo.controller;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("junior")

public class Junioremp implements Emp {
	public String getmsg() {
		return "this is junior";
	}

}
