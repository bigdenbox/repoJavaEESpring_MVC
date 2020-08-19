package ua.bigdenbox.springLearning;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloController {

    @GetMapping("/spring-mvc-app1")
    public String sayHello() {
        return "helloworld";
    }
}
