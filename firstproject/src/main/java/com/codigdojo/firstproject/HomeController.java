package com.codigdojo.firstproject;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class HomeController {
    @RequestMapping("/")
    public String hello()
    {
        return ("Hello Sunshine, Hope you're having a good day");
    }
    @RequestMapping("/random")
    public String random(){
        return ("This is  random message to test the route");

    }

}
