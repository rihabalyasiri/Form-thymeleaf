package com.example.formspring;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class GreetingController {

    //map to GET Request
    @GetMapping("/greeting")   //map HTTP requests to specific controller methods
    public String greetingForm(Model model) {
        model.addAttribute("greeting", new Greeting());
        return "greeting";  //returning name of view in templates
    }

    // map to Post Request
    @PostMapping("/greeting")
    public String greetingSubmit(@ModelAttribute Greeting greeting) {
        return "result";
    }

}