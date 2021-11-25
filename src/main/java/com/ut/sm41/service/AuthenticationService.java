package com.ut.sm41.service;

import com.ut.sm41.dto.*;

public interface AuthenticationService {

    UserDTO loginAuthentication(String username, String rawPassword);
    UserDTO createUser(UserDTO userDTO);
}
