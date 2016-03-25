package com.training.site.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by norris on 3/17/2016.
 */
@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public UserEntity register(UserEntity userEntity) {
        return userRepository.save(userEntity);
    }

    public UserEntity update(UserEntity userEntity) {
        return userRepository.save(userEntity);
    }
}
