package com.ut.sm41.service.impl;

import com.ut.sm41.dto.UserDTO;
import com.ut.sm41.model.User;
import com.ut.sm41.repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserRepo userRepo;

    @Override
    public UserDTO saveUser(UserDTO userDTO) {
        User user = new User();
        user.setName(userDTO.getName());
        user.setPassword(userDTO.getPassword());
        user.setRole(Short.valueOf(userDTO.getRole()));
        user.setStatus(userDTO.getStatus());
        userRepo.save(user);
        return userDTO;
    }

}