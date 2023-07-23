package com.brindabhattarai.Shopping.controller;

import com.brindabhattarai.Shopping.pojo.AdminPojo;
import com.brindabhattarai.Shopping.pojo.UserPojo;
import com.brindabhattarai.Shopping.services.AdminServices;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.security.authentication.AnonymousAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequiredArgsConstructor
@RequestMapping("/admin")
public class Adminlogin {
    private final AdminServices adminServices;

    @GetMapping("/adminlogin")
    public String login() {
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        if (authentication==null||authentication instanceof AnonymousAuthenticationToken){
            return "/login";
        }
        return "redirect:/admin/dash";
    }


//    @GetMapping("/dash")
//    public String homePage(){
//        return "Admindashboard";
//    }



    @GetMapping("/create")
    public String createUser(Model model){
        model.addAttribute("user",new AdminPojo());

        return "admincreate";
    }



    @PostMapping("/save")
    public String saveUser(@Valid AdminPojo adminPojo){
        adminServices.save(adminPojo);
        return "redirect:/admin/adminlogin";
    }
}
