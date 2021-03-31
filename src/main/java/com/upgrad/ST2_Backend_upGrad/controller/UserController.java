package com.upgrad.ST2_Backend_upGrad.controller;

import com.upgrad.ST2_Backend_upGrad.model.User;
import com.upgrad.ST2_Backend_upGrad.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpSession;

@Controller
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping(method = RequestMethod.GET, value = "/users/registration")
    public String registerUser(Model model) {

        User user = new User();
        model.addAttribute("user", user);


        return "users/registration";
    }

    @RequestMapping(method = RequestMethod.POST, value = "/users/registration")
    public String userRegistration(User user) {

        userService.registerUser(user);
        return "redirect:/users/login";
    }

}

