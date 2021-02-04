package com.eugenioamn.springcloudopenfeign;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class UserController {

    private final UserFeignClient userFeignClient;

    public UserController(UserFeignClient userFeignClient) {
        this.userFeignClient = userFeignClient;
    }

    @GetMapping
    public User getUser() {
        return userFeignClient.getUser();
    }
}
