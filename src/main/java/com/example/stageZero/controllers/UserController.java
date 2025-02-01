package com.example.stageZero.controllers;

import org.springframework.web.bind.annotation.*;
import com.example.stageZero.dto.UserInfo;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api")

public class UserController {
    @GetMapping("/user")
    public UserInfo getUserInfo(){
        return new UserInfo(
            "dikedaniel7917@gmail.com",
            "https://github.com/Danny-Kyle/HNG_Stage_Zero"
        );
    }
}
