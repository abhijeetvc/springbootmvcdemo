package com.springbootmvc.springbootmvcdemo.controller;

import com.springbootmvc.springbootmvcdemo.model.Employee;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

//@RestController = @Controller + @ResponseBody

@Controller
public class MyController {

    @GetMapping("/index")
    public String index(Model model){
        model.addAttribute("employee",new Employee());
        return "index";
    }

    // Model --> addAttribute
    // @ModelAttribute

    @PostMapping("/register")
    public String register(@ModelAttribute Employee employee){
        System.out.println(employee);
        return "Welcome";
    }
}
