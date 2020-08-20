package ua.bigdenbox.springLearning.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class SecondController {
	
	@GetMapping("/exit")
	public String goExit(@RequestParam(value = "text", required = false) String text) {
		System.out.println("goExit is started:\nText = " + text);
		return "second/exit_page";
	}

}
