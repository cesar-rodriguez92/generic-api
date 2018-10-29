package com.crodriguezt.genericapi.service.impl;

import com.crodriguezt.genericapi.model.entity.User;
import com.crodriguezt.genericapi.model.repository.UserRepository;
import com.crodriguezt.genericapi.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("userService")
public class UserServiceImpl implements UserService {

    private Logger log = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private UserRepository userRepository;

    @Override
    public User createUserService(User user) {
        log.info("Ini createUserService, user: " + user);
        return userRepository.save(user);
    }
}
