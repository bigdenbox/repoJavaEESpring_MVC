package ua.bigdenbox.springLearning.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
//@RequestMapping()
public class FirstController {
	
	@GetMapping("/hello")
	public String helloPage(@RequestParam("name") String name, @RequestParam("surname") String surname) {
		System.out.println("helloPage:\nName " + name + " /nSurname " + surname);
		return "first/hello_page";
	}

	@GetMapping("goodbye")
	public String goodbyePage(@RequestParam("name") String name, @RequestParam("surname") String surname) {
		System.out.println("goodbyePage:\nName " + name + " /nSurname " + surname);
		return "first/goodbye_page";
	}
}
