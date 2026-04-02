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

    @PostMapping("/register")
    public User register(@RequestBody User user) {
        return userService.saveUser(user);
    }

    @GetMapping("/t")
    private void test(){
        System.out.println("test passed");
    }
}
