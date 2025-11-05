package com.ssg.springboard.controller;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/replys")
public class ReplyController {

    @GetMapping(value = "/sample" , produces = MediaType.APPLICATION_JSON_VALUE)
    public String sample() {
//        return Map.of("value1","AAAA", "value2","BBBB");
//    }
        return "Hello RestController";
    }
}