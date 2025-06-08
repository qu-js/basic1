package com.sbs.basic1.boundedContext.home.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
// mvc패턴을 사용하여 아래 클래스를 controller 클래스로 만들겠다는 의미
public class HomeController {
    @GetMapping("home/main")
    // "/home/main" 요청이 들어오면 아래의 메소드를 실행시키라는 의미
    @ResponseBody
    // 아래 메서드가 실행된 결과를 body의 response로 보내라는 의미
    public String showHomeMain() {
        return "Hello Wolrd!";
    }
}
