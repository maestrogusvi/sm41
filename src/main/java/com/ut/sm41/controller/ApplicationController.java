
package com.ut.sm41.controller;

import com.google.gson.JsonObject;
import com.ut.sm41.dto.BeeceptorDTO;
import com.ut.sm41.dto.EstradaDTO;
import com.ut.sm41.dto.RamirezDTO;
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

    @GetMapping("/estradaHttp")
    public EstradaDTO estradaHttp() throws IOException {
        return applicationService.estradaHttp();
    }

    @PostMapping("/estradaPostHttp")
    public EstradaDTO estradaPostHttp(@RequestBody EstradaDTO estradaDTO) throws IOException {
        return applicationService.estradaPostHttp(estradaDTO);
    }

    @GetMapping("/ramirezHttp")
    public RamirezDTO ramirezHttp() throws IOException {
        return applicationService.ramirezHttp();
    }

    @GetMapping("/ramirezPostHttp")
    public void ramirezPostHttp() throws IOException {
        applicationService.ramirezPostHttp();
    }

    @GetMapping("/hauHttp")
    public HauDTO hauHttp() throws IOException {
        return applicationService.hauHttp();
    }

    @GetMapping("/hauPostHttp")
    public void hauPostHttp() throws IOException {
        applicationService.hauPostHttp();
    }

}
