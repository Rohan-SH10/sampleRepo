package com.example.loginservice.controllers;


import com.example.loginservice.model.LoginModel;

import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
@Log4j2
public class Login {
    @GetMapping("/")
    public String indexPage(){
        return "index";
    }
   @GetMapping(value = "/login")
    public String loginPage(Model model){
        model.addAttribute("login",new LoginModel());
        return "index";
    }
    @PostMapping(value = "/login")
    public String welcomePage(@ModelAttribute LoginModel loginModel, Model model){
        model.addAttribute("login",loginModel);
        return "welcome";
    }
}
