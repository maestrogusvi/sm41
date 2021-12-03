package com.ut.sm41.controller;

import com.ut.sm41.dto.UserDTO;
import com.ut.sm41.model.User;
import com.ut.sm41.repository.UserRepo;
import com.ut.sm41.service.impl.AuthenticationService;
import com.ut.sm41.service.impl.GenericResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@RestController
public class PreAuthorizeRestController {



    @GetMapping("/user")
    @PreAuthorize("hasRole('USER')")
    public ResponseEntity<String> defaultPage(Model model) {
        return new ResponseEntity<String>("You have USER role.", HttpStatus.OK);
    }

    @GetMapping("/admin")
    @PreAuthorize("hasRole('ADMIN')")
    public ResponseEntity<String> getAllBlogs(Model model) {
        return new ResponseEntity<String>("You have ADMIN role.", HttpStatus.OK);


        }
}
