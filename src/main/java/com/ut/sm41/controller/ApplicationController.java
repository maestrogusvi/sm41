package com.ut.sm41.controller;

import com.google.gson.JsonObject;
import com.ut.sm41.dto.BeeceptorDTO;
import com.ut.sm41.dto.MontejoDTO;
import com.ut.sm41.exception.BusinessException;
import com.ut.sm41.dto.RomanoDTO;
import com.ut.sm41.dto.VazquezDTO;
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

    @GetMapping("/vazquezHttp")
    public VazquezDTO vazquezHttp() throws IOException {
        return applicationService.vazquezHttp();
    }
    @GetMapping("/romanoHttp")
    public RomanoDTO romanoHttp() throws IOException {
        return applicationService.romanoHttp();
    }
    @GetMapping("/montejoHttp")
    public MontejoDTO montejoHttp() throws IOException {
        return applicationService.montejoHttp();
    }
}
