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
    @PostMapping("/batunPostHttp")
    public BatunDTO batunPostHttp(@RequestBody BatunDTO batunDTO) throws IOException {
         applicationService.batunPostHttp( batunDTO );
        return batunDTO;
    }

    @GetMapping("/badilloHttp")
    public BadilloDTO badilloHttp() throws IOException {
        return applicationService.badilloHttp();
    }
    @PostMapping("/badilloPostHttp")
    public void badilloPostHttp(@RequestBody BadilloDTO badilloDTO) throws IOException {
         applicationService.badilloPostHttp(badilloDTO);
    }

    @GetMapping("/martinezHttp")
    public MartinezDTO martinezHttp() throws IOException {
        return applicationService.martinezHttp();
    }

    @PostMapping("/martinezPostHttp")
    public MartinezDTO martinezPostHttp(@RequestBody MartinezDTO martinezDTO) throws IOException{
        applicationService.martinezPostHttp(martinezDTO);
        return martinezDTO;
    }

    @GetMapping("/varguezHttp")
    public VarguezDTO varguezHttp() throws IOException {
        return applicationService.varguezHttp();
    }
    @PostMapping("/PostHttp")
    public VarguezDTO varguezPostHttp(@RequestBody VarguezDTO varguezDTO) throws IOException{
        applicationService.varguezMyFirstObject(varguezDTO);
        return varguezDTO;
    }

    @GetMapping("/cadenaHttp")
    public CadenaDTO cadenaHttp() throws IOException {
        return applicationService.cadenaHttp();
    }
    @PostMapping("/cadenaPostHttp")
    public void cadenaPostHttp(@RequestBody CadenaDTO cadenaDTO) throws IOException {
       applicationService.cadenaPostHttp(cadenaDTO);
    }
}
