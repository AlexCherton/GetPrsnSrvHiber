package org.home.SpringBootRestService;

import org.springframework.web.bind.annotation.*;

@RestController
//@RequestMapping("/user")
public class SimpleController {
	//	@PostMapping
//	public SimpleResponse get(@RequestBody SimpleRequest request) {
//	int UserID = request.getId();
//	final SimpleResponse response= new SimpleResponse();
//	return response;
	@RequestMapping("/hello")
	public String hello() {
		return "Hello World RESTful with Spring Boot";
	}
}
//	}
//}
