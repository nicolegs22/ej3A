package com.example.clientservice.service;

import com.example.clientservice.model.User;
import org.springframework.stereotype.Service;

@Service
public class ClientService {

    public void saveUser(User user) {
        // Lógica para guardar el usuario (en este caso, un simple mensaje)
        System.out.println("User saved: " + user.getNombre() + " " + user.getApellidoPaterno());
    }
}
