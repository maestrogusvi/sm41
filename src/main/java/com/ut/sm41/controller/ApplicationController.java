package com.ut.sm41.controller;

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

    @GetMapping("/anotaHttp")
    public AnotaDTO anotaHttp() throws IOException {
        return applicationService.anotaHttp();
    }
    @GetMapping("/anotaPostHttp")
    public void anotaPostHttp() throws IOException {
        applicationService.anotaPostHttp();
    }
    @GetMapping("/villagranHttp")
    public VillagranDTO villagranHttp() throws IOException {
        return applicationService.villagranHttp();
    }
    @GetMapping("/silvaHttp")
    public SilvaDTO silvaHttp() throws IOException {
        return applicationService.silvaHttp();
    }

    @GetMapping("/caamalHttp")
    public CaamalDTO caamalHttp() throws IOException {
        return applicationService.caamalHttp();
    }

    @GetMapping("/caamalPostHttp")
    public void caamalPostHttp() throws IOException{
        applicationService.caamalPostHttp();
    }


}
