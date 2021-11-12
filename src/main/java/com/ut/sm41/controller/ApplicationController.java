package com.ut.sm41.controller;

import com.google.gson.JsonObject;
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

    @GetMapping("/martinezHttp")
    public MartinezDTO martinezHttp() throws IOException {
        return applicationService.martinezHttp();
    }

    @PostMapping("/vazquezPostHttp")
    public void vazquezPostHttp(@RequestBody VazquezDTO vazquezDTO) throws IOException{
         applicationService.vazquezPostHttp(vazquezDTO);
    }

    @PostMapping("/romanoPostHttp")
    public void romanoPostHttp(@RequestBody RomanoDTO romanoDTO) throws IOException{
         applicationService.romanoPostHttp(romanoDTO);
    }

    @PostMapping("/martinezPostHttp")
    public void martinezPostHttp(@RequestBody MartinezDTO martinezDTO) throws IOException{
        applicationService.martinezPostHttp(martinezDTO);
    }

    @GetMapping("/discordDTO")
    public DiscordDTO discordHttp() throws  IOException{
        return applicationService.discordHttp();
    }
}
