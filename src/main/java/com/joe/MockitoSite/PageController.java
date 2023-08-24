package com.joe.MockitoSite;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PageController {

	@GetMapping("/test")
	public String test() {
		return "test";
	}
	
	@GetMapping("/red")
	public String red() {
		return "red";
	}
	
	@GetMapping("/yellow")
	public String yellow() {
		return "yellow";
	}
	
	@GetMapping("/blue")
	public String blue() {
		return "blue";
	}
}
