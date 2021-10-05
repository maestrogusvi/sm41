package com.ut.sm41.controller;

import com.ut.sm41.service.ApplicationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class ApplicationController {

    @Autowired
    ApplicationService applicationService;

    @GetMapping("/sm/inicio")
    public String inicio(){
        return applicationService.firstService();
    }
}
