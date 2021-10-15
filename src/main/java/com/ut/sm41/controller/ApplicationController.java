package com.ut.sm41.controller;

import com.google.gson.JsonObject;
import com.ut.sm41.dto.BeeceptorDTO;
import com.ut.sm41.dto.CaamalDTO;
import com.ut.sm41.dto.TunDTO;
import com.ut.sm41.service.ApplicationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;

@RestController
@RequestMapping("/api/v1")
public class ApplicationController {

    @Autowired
    ApplicationService applicationService;

    @GetMapping("/")
    public String inicio(){
        return applicationService.firstService();
    }

    @GetMapping("/testHttp")
    public BeeceptorDTO testHttp() throws IOException {
        return applicationService.testHttp();
    }

    @GetMapping("/testHttp")
    public CaamalDTO caamalHttp() throws IOException {
        return applicationService.caamalHttp();
    }

    @GetMapping("/testHttp")
    public TunDTO tunHttp() throws IOException {
        return applicationService.tunHttp();
    }
}
