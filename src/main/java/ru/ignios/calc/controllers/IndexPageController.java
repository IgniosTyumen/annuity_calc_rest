package ru.ignios.calc.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexPageController {

    @RequestMapping(value = "/")
    public String index(){
        return "index";
    }
}