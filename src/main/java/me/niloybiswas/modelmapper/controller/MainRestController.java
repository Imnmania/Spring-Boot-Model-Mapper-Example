package me.niloybiswas.modelmapper.controller;

import lombok.extern.slf4j.Slf4j;
import me.niloybiswas.modelmapper.dto.UserDTO;
import me.niloybiswas.modelmapper.service.UserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("/api/v1")
public class MainRestController {

    private UserService service;

    @GetMapping("/user")
    public UserDTO getUser(){
        return service.getUser();
    }

}
