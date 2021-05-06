package com.bkwblz.geocoordinates.hello;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("hello")
public class HelloResource {

    @GetMapping("default")
    public String getDefault(){
        return "Hello World";
    }

    @GetMapping("someone/{anonymous}")
    public String getHelloSomeone(@PathVariable("anonymous") String someone){
        return "Hello ".concat(someone);
    }
}
