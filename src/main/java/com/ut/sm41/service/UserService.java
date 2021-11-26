package com.ut.sm41.service;

import com.ut.sm41.dto.UserDTO;
import org.springframework.stereotype.Service;

@Service
public interface UserService {

    UserDTO saveUser(UserDTO userDTO);

}
