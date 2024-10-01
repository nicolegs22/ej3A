package com.example.clientservice.controller;

import com.example.clientservice.model.User;
import com.example.clientservice.service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/clients")
public class ClientController {

    @Autowired
    private ClientService clientService;

    @PostMapping("/create")
    public String createUser(@RequestBody User user) {
        clientService.saveUser(user);
        return "User created successfully!";
    }
}
