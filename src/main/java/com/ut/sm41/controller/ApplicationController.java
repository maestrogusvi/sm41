package com.ut.sm41.controller;

import com.google.gson.JsonObject;
import com.ut.sm41.dto.BadilloDTO;
import com.ut.sm41.dto.BeeceptorDTO;
import com.ut.sm41.dto.MartinezDTO;
import com.ut.sm41.service.ApplicationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.ut.sm41.dto.BatunDTO;
import java.io.IOException;


@RestController
@RequestMapping("/api/v1")
public class ApplicationController {

    @Autowired
    ApplicationService applicationService;

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
}
