package com.br.zup.validateions.controllers;

import com.br.zup.validateions.controllers.dtos.UserDTO;
import com.br.zup.validateions.controllers.dtos.UserRegisterDTO;
import com.br.zup.validateions.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public UserDTO registerUser(@Valid @RequestBody UserRegisterDTO user){
        return userService.save(user);
    }
}
