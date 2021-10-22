package com.ut.sm41.controller;

import com.google.gson.JsonObject;
import com.ut.sm41.dto.*;
import com.ut.sm41.exception.BusinessException;
import com.ut.sm41.service.ApplicationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;

@RestController
@RequestMapping("/api/v1")
public class ApplicationController {

    @Autowired
    ApplicationService applicationService;

    @ExceptionHandler({ BusinessException.class })
    @ResponseBody
    public ResponseEntity<String> userHandler(BusinessException ex) {
        return new ResponseEntity<String>(ex.getMessage(), ex.getHttpStatus());
    }

    @GetMapping("/")
    public String inicio(){
        return applicationService.firstService();
    }

    @GetMapping("/testHttp")
    public BeeceptorDTO testHttp() throws IOException {
        return applicationService.testHttp();
    }

    @GetMapping("/zapataHttp")
    public ZapataDTO zapataHttp() throws IOException {
        return applicationService.zapataHttp();
    }

    @GetMapping("/bautistaHttp")
    public BautistaDTO bautistaHttp() throws IOException {
        return applicationService.bautistaHttp();
    }

    @GetMapping("/ariasHttp")
    public AriasDTO ariasHttp() throws IOException {
        return applicationService.ariasHttp();
    }

    @GetMapping("/sotoHttp")
    public SotoDTO sotoHttp() throws IOException {
        return applicationService.sotoHttp();
    }

    @GetMapping("/tukHttp")
    public TukDTO tukHttp() throws IOException {
        return applicationService.tukHttp();
    }
    
    @GetMapping("/bautistaPostHttp")
    public void bautistaPostHttp() throws IOException{
        applicationService.bautistaPostHttp();
    }

    @GetMapping("/zapataPostHttp")
    public void zapataPostHttp() throws IOException{
        applicationService.zapataPostHttp();
    }
}

