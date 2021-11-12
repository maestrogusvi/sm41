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

    @GetMapping("/mercadoHttp")
    public MercadoDTO mercadoHttp() throws IOException{
        return applicationService.mercadoHttp();
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

    @GetMapping("/twichHttp")
    public TwichDTO twichHttp() throws IOException {
        return applicationService.twichHttp();
    }

    @GetMapping("/cloudflareHttp")
    public CloudflareDTO cloudflareHttp() throws IOException{
        return applicationService.cloudflareHttp();
    }

    @PostMapping("/silvaPost")
    public void silvaPostHttp(@RequestBody SilvaDTO silvaDTO) throws IOException {
        applicationService.silvaPostHttp(silvaDTO);
    }

    @GetMapping("/caamalHttp")
    public CaamalDTO caamalHttp() throws IOException {
        return applicationService.caamalHttp();
    }

    @PostMapping ("/caamalPostHttp")
    public CaamalDTO caamalPostHttp(@RequestBody CaamalDTO caamalDTO) throws IOException {
        return applicationService.caamalPostHttp(caamalDTO);
    }

    @PostMapping ("/caamalPost")
    public void caamalPost(@RequestBody CaamalDTO caamalDTO) throws IOException {
        applicationService.caamalPost(caamalDTO);
    }

    @GetMapping ("/facebookHttp")
    public FacebookDTO facebookHttp() throws IOException {
        return applicationService.facebookHttp();
    }

}
