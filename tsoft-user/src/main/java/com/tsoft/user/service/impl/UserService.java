package com.tsoft.user.service.impl;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

public interface UserService {

    @PostMapping("/getUserInfo")
    public String getUserInfo(@RequestParam("name") String name);
}
