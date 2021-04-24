package com.docker.dockerspringboot.resources;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/sayHi")
public class Controller {

    @GetMapping
    public String sayHi(){
        return "Hi";
    }
}
