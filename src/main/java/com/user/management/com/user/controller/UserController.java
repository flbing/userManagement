package com.user.management.com.user.controller;



import com.alibaba.fastjson.JSON;
import com.user.management.com.user.domain.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;



@Controller
@CrossOrigin(origins = "http://localhost:4444")
@RequestMapping("/base/user")
public class UserController {
    @RequestMapping(value="/login", method = RequestMethod.POST)
    public ModelAndView login(@RequestBody User user){


        System.out.println(user.getUserName());
        return null;
    }
}
