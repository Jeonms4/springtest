package com.green.springtest.controller;

import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@Log4j2
public class SampleController {

    @GetMapping("/hello")
    public void hello(Model model) {

        model.addAttribute("msg", "HELLO WORLD");
        String[] animal = new String[]{"코끼리", "사자" , "레오파드"};
        model.addAttribute("animal", animal);
    }

    @GetMapping("/helloArray")
    public void helloArray(Model model) {
        String[] animal = new String[]{"코끼리", "사자" , "레오파드"};
        model.addAttribute("animal", animal);
    }
}
