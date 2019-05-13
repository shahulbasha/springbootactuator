package org.shahul.springboot.demo.controller;

import java.time.LocalDateTime;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

	@GetMapping("/")
	public String getTime() {
		return "The current time on the server is " + LocalDateTime.now();
	}
}
