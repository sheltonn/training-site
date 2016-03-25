package com.training.site.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

/**
 * Created by norris on 3/2/2016.
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/register")
    public String register(Map<String, Object> model) {
        UserEntity userEntity = new UserEntity();
        userEntity.setEmail(model.get("email"));
        return userService.register(userEntity);
    }

    public UserEntity update(UserEntity userEntity) {
        return userService.update(userEntity);
    }
}
