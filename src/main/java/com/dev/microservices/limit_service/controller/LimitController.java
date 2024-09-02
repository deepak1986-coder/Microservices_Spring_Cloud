package com.dev.microservices.limit_service.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dev.microservices.limit_service.beans.Limits;

@RestController
public class LimitController {

	@GetMapping("/limits")
	public Limits retrieveLimits() {

		return new Limits(1, 1000);
	}

}
