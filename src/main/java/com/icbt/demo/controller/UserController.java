package com.icbt.demo.controller;

import com.icbt.demo.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
@RequestMapping("v1/user")
@RequiredArgsConstructor
public class UserController {
    private final UserService userService;

}
