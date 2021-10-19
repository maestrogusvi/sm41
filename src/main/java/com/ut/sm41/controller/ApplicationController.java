package com.ut.sm41.controller;

import com.ut.sm41.dto.*;
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

    @GetMapping("/estradaHttp")
    public EstradaDTO estradaHttp() throws IOException {
        return applicationService.estradaHttp();
    }

    @GetMapping("/ramirezHttp")
    public RamirezDTO ramirezHttp() throws IOException {
        return applicationService.ramirezHttp();
    }

    @GetMapping("/hauHttp")
    public HauDTO hauHttp() throws IOException {
        return applicationService.hauHttp();
    }

    @GetMapping("/figueroaHttp")
    public FigueroaDTO figueroaHttp() throws IOException {
        return applicationService.figueroaHttp();
    }
}
