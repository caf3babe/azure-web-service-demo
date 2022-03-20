package at.strasser.nichil.azurewebservicedemo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
    @GetMapping("/demo")
    String demo() {
        return "Hello, I engineered that service.";
    }
}
