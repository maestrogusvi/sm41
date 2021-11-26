package com.ut.sm41.service;

import com.nimbusds.jose.shaded.json.JSONObject;
import com.ut.sm41.dto.*;
import org.springframework.stereotype.Service;

@Service
public interface AuthenticationService {

    JSONObject loginAuthentication(String username, String rawPassword);
    UserDTO createUser(UserDTO userDTO);

}
