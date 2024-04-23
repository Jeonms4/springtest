package com.green.springtest.controller;

import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

@Controller
@Log4j2
public class SampleController2 {
    @GetMapping("/ex/ex2")
    public void ex2(Model model) {

        log.info("ex/ex2................");

        List<String> strList = IntStream.range(1,10)
                .mapToObj(i -> "Data"+i)
                .collect(Collectors.toList());

        model.addAttribute("list", strList);

        Map<String, String> map = new HashMap<>();
        map.put("A","AAAA");
        map.put("B","BBBB");

        model.addAttribute("map", map);

        SampleDTO sampleDTO = new SampleDTO();
        sampleDTO.p1 ="Value -- p1";
        sampleDTO.p2 ="Value -- p2";
        sampleDTO.p3 ="Value -- p3";

        model.addAttribute("dto", sampleDTO);
    }
}
