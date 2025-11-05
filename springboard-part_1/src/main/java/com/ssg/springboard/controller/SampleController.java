package com.ssg.springboard.controller;


import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@Log4j2
@RequestMapping(value = "/sample")
public class SampleController {
    //1.  url: /basic get방식 요청 구현   "basic 요청" 로그 메시지 출력
    @GetMapping("/basic")
    public void basic() {
           log.info("---- basic ----");
       }

    //2. url : /ex1 get 방식으로 name과 age 를 전달하여  전달받은 name 과 age 로그 메시지로 출력
    //          조건 : 파라메터 age 기본값 20 으로 설정

    public void ex1(@RequestParam("name") String name, @RequestParam(value = "age", required = false,defaultValue = "20") int age) {
          log.info("---- ex1 ----");
          log.info(name);
          log.info(age);
    }

    //3. url: /ex02Bean  SampleDTOList 받아서  해당 list 로그 출력

//     public void ex02Bean(SampleDTOList sampleDTOList){ log.info(sampleDTOList);}
}
