package com.example.demo;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class HomeController {

    @GetMapping("/")
    public String getIndex() {
        return "hello";
    }

    @PostMapping("/add")
    public List<Obj> postRequest(@RequestBody List<Obj> obj) {
        System.out.println(obj);
        return obj;
    }

}
