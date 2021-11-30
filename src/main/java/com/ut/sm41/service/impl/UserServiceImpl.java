package com.ut.sm41.service.impl;

import com.ut.sm41.dto.UserDTO;
import com.ut.sm41.model.User;
import com.ut.sm41.repository.UserRepositoryUser;
import com.ut.sm41.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;

public class UserServiceImpl implements UserService {

    @Autowired
    UserRepositoryUser userRepositoryUser;

    @Override
    public UserDTO saveUser(UserDTO userDTO) {
        User user = new User();
        user.setName(userDTO.getName());
        user.setRole(Short.valueOf(userDTO.getRole()));
        user.setPassword(userDTO.getPassword());
        user.setStatus(userDTO.getStatus());
        userRepositoryUser.save(user);
        return userDTO;
    }
}
