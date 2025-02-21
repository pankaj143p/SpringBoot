package com.hellorest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloRest {
    @GetMapping(value="/hello")
    public String index(){
        return "Hello from Pankaj!";
    }
}
