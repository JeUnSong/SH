package com.example.sh.controller;

import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/house")
@Log4j2
public class SHController {

    @GetMapping("/index")
    public void index(){}

    @GetMapping("/login")
    public void login(){}
}


