package com.devops.mysql;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class EmployeeController {
	@GetMapping("/hello")
	public String index() {
		return "Hello World !";
	}

}
