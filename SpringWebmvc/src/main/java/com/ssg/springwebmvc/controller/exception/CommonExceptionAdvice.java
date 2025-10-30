package com.ssg.springwebmvc.controller.exception;

// 스프링컨트롤러에서 발생하는 예외를 처리하는 일반적인 방식
import lombok.extern.log4j.Log4j2;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.servlet.NoHandlerFoundException;

@ControllerAdvice
@Log4j2
public class CommonExceptionAdvice {
    @ResponseBody //내가 보낸 문자열을 그대로 뿌리겠다.
    @ExceptionHandler(value = Exception.class)
    public String exceptNumber(NumberFormatException numberFormatException) {
        log.error("numberFormatException: " + numberFormatException.getMessage());
        return "number Format Exception!";
    }

    @ExceptionHandler(value = NoHandlerFoundException.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    public String notFound(){
        return "custom404";
    }
}
