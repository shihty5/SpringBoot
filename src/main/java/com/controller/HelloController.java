package com.controller;

import com.prop.GirlProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/hello")
public class HelloController {

    @Autowired
    private GirlProperties girl;

    @GetMapping(value = "/say/{id}")
    public String sayRest(@PathVariable("id") Integer id) {
        return "id : " + id;
    }

    @GetMapping(value = "/say")
    public String sayParam(@RequestParam(value = "id", required = false, defaultValue = "0") Integer id) {
        return "id : " + id;
    }

    @PostMapping(value = "/{post}")
    public String sayPost(@PathVariable("post") String post) {
        return post + girl.getCupSize();
    }
}
