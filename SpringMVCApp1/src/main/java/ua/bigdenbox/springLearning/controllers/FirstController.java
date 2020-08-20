package ua.bigdenbox.springLearning.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
//@RequestMapping()
public class FirstController {

	@GetMapping("/hello")
	public String helloPage(@RequestParam(value = "name", required = false) String name,
			@RequestParam(value = "surname", required = false) String surname, Model model) {
//		System.out.println("helloPage:\nName = " + name + " \nSurname = " + surname);
		model.addAttribute("message", "helloPage:\nName = " + name + " \nSurname = " + surname);

		return "first/hello_page";
	}

	@GetMapping("/goodbye")
	public String goodbyePage(@RequestParam(value = "name", required = false) String name,
			@RequestParam(value = "surname", required = false) String surname) {
		System.out.println("goodbyePage:\nName = " + name + " \nSurname = " + surname);
		return "first/goodbye_page";
	}

	@GetMapping("/calculator")
	public String calculator(@RequestParam(value = "a", required = false) Double a,
			@RequestParam(value = "b", required = false) Double b,
			@RequestParam(value = "action", required = false) String action, Model model) {
		Double answer = null;
		System.out.println("action = " + action);
		switch (action) {
		case "multiplication":
			answer = a * b;
			break;
		case "addition":
			answer = a + b;
			break;
		case "subraction":
			answer = a - b;
			break;
		case "division":
			answer = a / b;
			break;
		default:
			answer = null;
			break;
		}
		model.addAttribute("message", a + " " + action + " " + b + " = " + answer);
		return "first/calculator_page";
	}

}
