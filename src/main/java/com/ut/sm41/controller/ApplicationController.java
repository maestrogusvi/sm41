
package com.ut.sm41.controller;

import com.ut.sm41.dto.BeeceptorDTO;
import com.ut.sm41.dto.HauDTO;
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

    @GetMapping("/hauHttp")
    public HauDTO hauHttp() throws IOException {
        return applicationService.hauHttp();
    }

    @GetMapping("/testPostHttp")
    public void testPostHttp() throws IOException {
        applicationService.testPostHttp();
    }
}
