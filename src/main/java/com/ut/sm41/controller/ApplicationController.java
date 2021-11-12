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

    @GetMapping("/estradaHttp")
    public EstradaDTO estradaHttp() throws IOException {
        return applicationService.estradaHttp();
    }

    @PostMapping("/estradaPostHttp")
    public EstradaDTO estradaPostHttp(@RequestBody EstradaDTO estradaDTO) throws IOException {
        return applicationService.estradaPostHttp(estradaDTO);
    }

    @PostMapping("/estradapost")
    public void testPostHttpEstrada (@RequestBody EstradaDTO estradaDTO) throws IOException {
        applicationService.testObject(estradaDTO);
    }

    @GetMapping("/booksHttp")
    public BooksDTO booksHttp() throws IOException {
        return applicationService.booksHttp();
    }

    @GetMapping("/ramirezHttp")
    public RamirezDTO ramirezHttp() throws IOException {
        return applicationService.ramirezHttp();
    }

    @PostMapping("/ramirezPostHttp")
    public RamirezDTO ramirezDTOPostHttp(@RequestBody RamirezDTO ramirezDTO) throws IOException {
        return applicationService.ramirezPostHttp(ramirezDTO);
    }

    @PostMapping("/ramirezpost")
    public void testPostHttp (@RequestBody RamirezDTO ramirezDTO) throws IOException {
        applicationService.testMyFirstObject(ramirezDTO);
    }

    @GetMapping("/hauHttp")
    public HauDTO hauHttp() throws IOException {
        return applicationService.hauHttp();
    }

    @PostMapping("/hauPostHttp")
    public HauDTO hauPostHttp(@RequestBody HauDTO hauDTO) throws IOException {
        return applicationService.hauPostHttp(hauDTO);
    }

}
