package oimass.aeintech.loginservice.controllers;


import oimass.aeintech.loginservice.entities.User;
import oimass.aeintech.loginservice.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api/users")
public class MainController {

    @Autowired
    private UserService userService;


}
