package com.ut.sm41.controller;

import com.ut.sm41.dto.BadilloDTO;
import com.ut.sm41.dto.BeeceptorDTO;
import com.ut.sm41.dto.MartinezDTO;
import com.ut.sm41.dto.VarguezDTO;
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
    @GetMapping("/BatunHttp")
    public BatunDTO BatunHttp() throws IOException {
        return applicationService.BatunHttp();
    }

    @GetMapping("/BadilloHttp")
    public BadilloDTO BadilloHttp() throws IOException {
        return applicationService.BadilloHttp();
    }

    @GetMapping("/martinezHttp")
    public MartinezDTO martinezHttp() throws IOException {
        return applicationService.martinezHttp();
    }

    @GetMapping("/varguezHttp")
    public VarguezDTO varguezHttp() throws IOException {
        return applicationService.varguezHttp();
    }
}
