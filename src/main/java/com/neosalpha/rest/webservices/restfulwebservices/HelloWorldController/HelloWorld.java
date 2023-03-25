package com.neosalpha.rest.webservices.restfulwebservices.HelloWorldController;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorld {

//    @GetMapping("/hello-world")
//
//    public String helloWorld(){
//        return "Hello World";
//    }

    @GetMapping("/hello-world-bean")
    public HelloWorldBean helloWorldBean(){
        return new HelloWorldBean("Hello World Bean");
    }


}
