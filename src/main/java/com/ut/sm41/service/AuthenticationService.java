package com.ut.sm41.service;

import com.nimbusds.jose.shaded.json.JSONObject;
import com.ut.sm41.dto.*;

public interface AuthenticationService {

    JSONObject loginAuthentication(String username, String rawPassword);
    UserDTO createUser(UserDTO userDTO);
}