package com.springdemo.helloworldjavaspringboot;

//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RestController;

//@RestController
public class HelloWorldController {

//    @GetMapping("/")
    public String getHelloWorld() {
        return "Hey you're a nerd";
    }
}
