package com.vahtang.testtask.controller;

import com.vahtang.testtask.model.User;
import com.vahtang.testtask.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by VAH on 09.03.2017.
 */

@Controller
public class UserController {

    private UserService userService;

    @Autowired(required = true)  //automatic binding
    @Qualifier(value = "userService")
    public void setUserService(UserService userService) {
        this.userService = userService;
    }

    @RequestMapping(value = "users", method = RequestMethod.GET)
    public String listUsers( Model model){
        model.addAttribute("user", new User());
        model.addAttribute("listUsers", this.userService.listUsers());

        return "users";
    }

    @RequestMapping(value = "/users/add", method = RequestMethod.POST)
    public String addUser(@ModelAttribute("user") User user){
        if (user.getId() == 0){
            this.userService.addUser(user);
        }
        else {
            this.userService.updateUser(user);
        }

        return "redirect:/users";
    }

    @RequestMapping("/remove/{id}")
    public String removeUser(@PathVariable("id") int id){
        this.userService.removeUser(id);

        return "redirect:/users";
    }

    @RequestMapping("edit/{id}")
    public String editUser(@PathVariable("id") int id, Model model){
        model.addAttribute("user", this.userService.getUserById(id));

        model.addAttribute("listUsers", this.userService.listUsers());
        return "users";
    }

    @RequestMapping("userdata/{id}")  //each user on separate page
    public String  userData(@PathVariable("id") int id, Model model){
        model.addAttribute("user", this.userService.getUserById(id));

        return "userdata";
    }

    @RequestMapping(value = "/search")
    public String seachUser(@RequestParam("searchString") String searchString, Model model){

        if (searchString != null){
            List<User> searchResult = this.userService.findByName(searchString);
            model.addAttribute("searchResult", searchResult);

        }
        return "search";
    }
}
