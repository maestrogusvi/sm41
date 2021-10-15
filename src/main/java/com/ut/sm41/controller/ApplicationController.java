package com.ut.sm41.controller;

import com.google.gson.JsonObject;
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

    @GetMapping("/AnotaHttp")
    public AnotaDTO AnotaHttp() throws IOException {
        return applicationService.AnotaHttp();
    }
    @GetMapping("/VillagranHttp")
    public VillagranDTO VillagranHttp() throws IOException {
        return applicationService.VillagranHttp();
    }
    @GetMapping("/SilvaHttp")
    public SilvaDTO SilvaHttp() throws IOException {
        return applicationService.SilvaHttp();
    }

    @GetMapping("/CaamalHttp")
    public CaamalDTO CaamalHttp() throws IOException {
        return applicationService.CaamalHttp();
    }


}
