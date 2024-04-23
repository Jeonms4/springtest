package com.green.springtest.controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class SampleJSONController {
    @GetMapping("/helloArr")
    public String[] helloArr(Model model){


        String[] strarr = new String[]{"AAA","BBB","CCC"};

        return strarr;
    }

    @GetMapping("/helloList")
    public List<String> helloList(){

        List<String> list = Arrays.asList("AAA", "BBB", "CCC");
        return list;
    }
}
