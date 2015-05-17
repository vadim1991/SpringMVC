package com.epam.controller;

import com.epam.entity.User;
import com.epam.entity.UserRole;
import com.epam.service.user.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.validation.Valid;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by swift-seeker-89717 on 08.05.2015.
 */
@Controller
@RequestMapping("/registration")
public class RegistrationController {

    @Autowired
    private IUserService userService;

    @RequestMapping(method = RequestMethod.GET)
    public String showRegistrationForm(Model model) {
        model.addAttribute("user", new User());
        return "registration";
    }

    @RequestMapping(method = RequestMethod.POST)
    public String addNewUser(@Valid User user, BindingResult result) {
        System.out.println(user);
        System.out.println(result);
        if (result.hasErrors()) {
            return "registration";
        }
        user.setEnabled(true);
        Set<UserRole> userRoleSet = new HashSet<>();
        userRoleSet.add(new UserRole());
        user.setUserRoleSet(userRoleSet);
        userService.save(user);
        return "redirect:/login";
    }


}
