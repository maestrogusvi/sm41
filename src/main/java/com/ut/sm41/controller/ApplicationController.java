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
    public String inicio() {
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

    @PostMapping ("/anotaPostHttp")
    public AnotaDTO anotaPostHttp(@RequestBody AnotaDTO anotaDTO) throws IOException {
        return applicationService.anotaPostHttp(anotaDTO);
    }

    @PostMapping ("/anotaPost")
    public void anotaPost(@RequestBody AnotaDTO anotaDTO) throws IOException {
        applicationService.anotaPost(anotaDTO);
    }

    @GetMapping("/villagranHttp")
    public VillagranDTO villagranHttp() throws IOException {
        return applicationService.villagranHttp();
    }

    @PostMapping("/villagranPost")
    public void villagranPostHttp(@RequestBody VillagranDTO villagranDTO) throws IOException {
         applicationService.villagranPostHttp(villagranDTO);
    }

    @GetMapping("/silvaHttp")
    public SilvaDTO silvaHttp() throws IOException {
        return applicationService.silvaHttp();
    }

    @PostMapping("/silvaPost")
    public void silvaPostHttp(@RequestBody SilvaDTO silvaDTO) throws IOException {
        applicationService.silvaPostHttp(silvaDTO);
    }

    @GetMapping("/caamalpostHttp")
    public CaamalDTO caamalHttp() throws IOException {
        return applicationService.caamalHttp();
    }

    @PostMapping("/caamalPost")
    public void caamalPost(@RequestBody CaamalDTO caamalDTO) throws IOException{
         applicationService.caamalPost(caamalDTO);
    }


}
