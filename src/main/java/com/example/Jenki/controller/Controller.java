package com.example.Jenki.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @GetMapping("/abc")
    public String xx(){
        return "Jenki up";
    }
}
