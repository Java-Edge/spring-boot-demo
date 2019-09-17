package com.javaedge.springbootdemo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author JavaEdge
 * @date 2019/9/16
 */
@RestController
public class TestController {

    @GetMapping("/test")
    public String test() {
        return "Hello, JavaEdge!";
    }
}
