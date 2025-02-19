package com.devops.mysql;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class EmployeeController {
	@GetMapping("/hello/{name}")
	public String index(@PathVariable("name") String name) {
		return "Hello World ..... !"+name;
	}

}
