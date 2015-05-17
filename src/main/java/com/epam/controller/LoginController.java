package com.epam.controller;

import com.epam.entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by swift-seeker-89717 on 12.05.2015.
 */
@Controller
@RequestMapping("/login")
public class LoginController {

    @RequestMapping(method = RequestMethod.GET)
    public String showLoginForm(Model model) {
        model.addAttribute(new User());
        return "login";
    }

}
