package ua.bigdenbox.springLearning;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloController {

    @GetMapping("/helloworld")
    public String sayHello() {
        return "helloworld";
    }
}
