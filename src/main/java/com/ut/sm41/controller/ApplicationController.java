package com.ut.sm41.controller;

import com.google.gson.JsonObject;
import com.ut.sm41.dto.*;
import com.ut.sm41.exception.BusinessException;
import com.ut.sm41.service.ApplicationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.ut.sm41.dto.CaamalDTO;
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

    @GetMapping("/caamalHttp")
    public CaamalDTO caamalHttp() throws IOException {
        return applicationService.caamalHttp();
    }

    @GetMapping("/tunHttp")
    public TunDTO tunHttp() throws IOException {
        return applicationService.tunHttp();
    }

    @GetMapping("/dominguezHttp")
    public DominguezDTO dominguezHttp() throws IOException {
        return applicationService.dominguezHttp();
    }

    @GetMapping("/tunPostHttp")
    public void tunPostHttp() throws IOException{
        applicationService.tunPostHttp();
    }

}
