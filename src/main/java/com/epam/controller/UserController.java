package com.epam.controller;

import com.epam.entity.User;
import com.epam.service.user.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by swift-seeker-89717 on 13.05.2015.
 */
@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    private IUserService userService;

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public
    @ResponseBody
    User getUser(@PathVariable String id) {
        return (User) userService.findById(Integer.parseInt(id));
    }

    @RequestMapping(value = "/name/{name}", method = RequestMethod.GET)
    public
    @ResponseBody
    String getUserByName(@PathVariable String name) {
        return "heloo!!!Dear " + name;
    }

}
