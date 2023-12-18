package com.almoatasem.demo.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
@CrossOrigin("*") // need to change in the future
public class UserController {

    @GetMapping("/")
    public String helloAdminController(){
        return "user Access level";
    }
}
