package com.helloword.spring;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloController {
    @GetMapping("/message")
    public String message(Model model) {
        model.addAttribute("message", "Hello World!");
        return "message";
    }
}