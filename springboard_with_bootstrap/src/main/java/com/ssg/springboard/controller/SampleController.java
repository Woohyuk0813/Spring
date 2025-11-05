package com.ssg.springboard.controller;

import com.ssg.springboard.domain.SampleDTOList;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@Log4j2
@RequestMapping(value = "/sample")
public class SampleController {
    @GetMapping("/basic")
    public void basic() {

        log.info("basic 요청");
    }

    //2. url: /ex1 get 방식으로 name과 age를 전달하여 전달받은 name와 age 로그를 메시지로 출력
    @GetMapping("/ex1")
    public void ex1(
            @RequestParam("name") String name,
            @RequestParam(value = "age", required = false, defaultValue = "20") int age) {

        log.info(name, age);
    }
    //3. url: /ex02Bean SampleDTOList 받아서 해당 list 로그 출력
    public void ex02Bean(SampleDTOList sampleDTOList){log.info(sampleDTOList);
    }
}
