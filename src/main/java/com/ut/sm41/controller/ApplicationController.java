package com.ut.sm41.controller;

import com.ut.sm41.dto.*;
import com.ut.sm41.exception.BusinessException;
import com.ut.sm41.service.ApplicationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.ut.sm41.dto.BatunDTO;
import java.io.IOException;


@RestController
@RequestMapping("/api/v1")
public class ApplicationController {

    @Autowired
    ApplicationService applicationService;

    @ExceptionHandler({ BusinessException.class })
    @ResponseBody
    public ResponseEntity<String>userHandler(BusinessException ex) {
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
    @GetMapping("/batunHttp")
    public BatunDTO batunHttp() throws IOException {
        return applicationService.batunHttp ();
    }
    @GetMapping("/batunPostHttp")
    public void  batunPostHttp( ) throws IOException {
        applicationService.batunPosthttp();
    }

    @GetMapping("/badilloHttp")
    public BadilloDTO badilloHttp() throws IOException {
        return applicationService.badilloHttp();
    }

    @GetMapping("/martinezHttp")
    public MartinezDTO martinezHttp() throws IOException {
        return applicationService.martinezHttp();
    }

    @GetMapping("/varguezHttp")
    public VarguezDTO varguezHttp() throws IOException {
        return applicationService.varguezHttp();
    }

    @GetMapping("/cadenaHttp")
    public CadenaDTO cadenaHttp() throws IOException {
        return applicationService.cadenaHttp();
    }
}
