package com.akhil.app.Controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @GetMapping("/hello")
    public String getGreet(){
        return "Hello World";
    }
}
