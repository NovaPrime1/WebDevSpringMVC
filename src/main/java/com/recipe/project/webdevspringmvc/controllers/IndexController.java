package com.recipe.project.webdevspringmvc.controllers;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {

    @RequestMapping({"", "/", "index"})
    public String getIndexPage(){
//        System.out.println(" Some message to say...1234564646");
        return "index";
    }
}
