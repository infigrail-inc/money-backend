package com.infigrail.money.controllers;

import com.infigrail.money.models.ApplicationUser;
import com.infigrail.money.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class UserController extends AbstractInfigrailController {

    @Autowired
    private UserService userService;

    @PostMapping("/sign-up")
    public void signUp(@RequestBody ApplicationUser user) {
        if (user == null) {
            throw new IllegalArgumentException("User cannot be null");
        }
        
        userService.signUp(user);
    }
}
