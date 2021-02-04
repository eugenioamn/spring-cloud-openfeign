package com.eugenioamn.springcloudopenfeign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "users", url = "http://localhost:8080/users")
public interface UserFeignClient {

    @GetMapping
    User getUser();
}
