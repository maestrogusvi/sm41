package com.ut.sm41.resource;

import com.ut.sm41.dto.*;
import com.ut.sm41.repository.UserRepository;
import com.ut.sm41.service.AuthenticationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.oauth2.jwt.Jwt;
import org.springframework.web.bind.annotation.*;

import static com.ut.sm41.constants.AuthenticationConstants.URL_PRIVATE_AUTHETICATION;

@RestController
@CrossOrigin(origins = "*", methods = { RequestMethod.GET, RequestMethod.POST, RequestMethod.OPTIONS })
@RequestMapping(path = URL_PRIVATE_AUTHETICATION, produces= MediaType.APPLICATION_JSON_VALUE)
public class AuthenticationController {

    @Autowired
    private AuthenticationService auhtenticationService;

    @Autowired
    UserRepository userRepository;

    @PostMapping("/login")
    public ResponseEntity<GenericResponse>  login(@RequestParam("user") String username, @RequestParam("password") String pwd) {
        return new ResponseEntity<>(new GenericResponse(200,"success",auhtenticationService.loginAuthentication(username,pwd)), HttpStatus.ACCEPTED);
    }

    @PostMapping("/api/v1/user")
    public @ResponseBody UserDTO newUser(@RequestBody UserDTO user) {
        return auhtenticationService.createUser(user);
    }


    @GetMapping({ URL_PRIVATE_AUTHETICATION, "/" })
    public String index(@AuthenticationPrincipal Jwt jwt) {
        return String.format("Hello, %s!", jwt.getSubject());
    }

    @GetMapping("/api/v1/especialrequest/test")
    String test(){
        return "Success";
    }



}