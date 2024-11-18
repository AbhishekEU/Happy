package com.shakthi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.shakthi.entity.RegisterEntity;
import com.shakthi.repository.RegisterRepo;

@Controller
@RequestMapping("/EventManagement")

public class RegisterController {
    @Autowired
private RegisterRepo repo;

    @GetMapping("app")
    public String loadIndex() {
        return"index";
   }
   @PostMapping("userRegister")
   public String userRegister(@ModelAttribute RegisterEntity user,RedirectAttributes model) {
    repo.save(user);
model.addAttribute("message", "Data saved Succesfully");
    //return "redirect:/EventManagement/app";
    return "redirect:/signup.html";
   }
   @PostMapping("userLogin")
   public String userLogin() {
    
    return"Home";
   }
}
