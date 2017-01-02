package com.myzone.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by shanjianhui on 2017/1/2.
 */
@Controller
public class IndexController {

    @RequestMapping(path = {"/"})
    @ResponseBody
    public String homePage(){
        return "HelloWorld!";
    }
}
