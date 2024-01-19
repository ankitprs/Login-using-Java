package com.ankit.login_backend;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/user")
public class UserController {


    private final UserService userService;

    @Autowired
    public  UserController(UserService userService){
        this.userService = userService;
    }

    @GetMapping()
    public List<User> getStudent() {
        return studentService.getStudents();
    }

    @PostMapping("/sign_up")
    public String signUp(@RequestBody User user){

    }


    @PostMapping("/login")
    public String login() {

    }


    @GetMapping("/hello")
    public String hello(){
        return "Hello from GreenStitch";
    }




}
