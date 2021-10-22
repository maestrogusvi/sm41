package com.ut.sm41.service.impl;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.ut.sm41.dto.*;
import com.ut.sm41.exception.BusinessException;
import com.ut.sm41.service.ApplicationService;
import com.ut.sm41.service.HttpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import java.io.IOException;

@Service
public class ApplicationServiceImpl implements ApplicationService {

    @Autowired
    HttpService httpService;

    @Override
    public String firstService() {
        return "service";
    }

    public BeeceptorDTO testHttp() throws IOException {
        JsonParser parser = new JsonParser();
        JsonObject json = (JsonObject) parser.parse(httpService.sendRequestHttpS("https://utsm41.free.beeceptor.com", "GET", null, null, "json", null, null));
        if (json.get("code") == null) {
            throw new BusinessException("Code doesn´t exist", HttpStatus.FORBIDDEN);
        }
        BeeceptorDTO beeceptorDTO = new BeeceptorDTO();
        beeceptorDTO.setCode(json.get("code").getAsString());
        beeceptorDTO.setMessage(json.get("message").getAsString());
        beeceptorDTO.setStatus(json.get("status").getAsString());
        return beeceptorDTO;
    }

    @Override
    public HauDTO hauHttp() throws IOException {
        JsonParser parser = new JsonParser();
        JsonObject json = (JsonObject) parser.parse(httpService.sendRequestHttpS("https://alfasm41.free.beeceptor.com","GET",null,null,"json",null, null));
        HauDTO hauDTO = new HauDTO();
        hauDTO.setName(json.get("name").getAsString());
        hauDTO.setId(json.get("id").getAsInt());
        hauDTO.setStatus(json.get("status").getAsString());
        return hauDTO;
    }

    @Override
    public void testPostHttp() throws IOException {
        JsonParser parser = new JsonParser();
        HauDTO hauDTO = new HauDTO();
        hauDTO.setName("Gregorio Hau");
        hauDTO.setId(Integer.parseInt("0421"));
        hauDTO.setStatus("Bienvenido Sr. Stark");
        JsonObject json = (JsonObject) parser.parse(httpService.sendRequestHttpS("https://alfasm41.free.beeceptor.com/api/v1/testPost","POST",null,null,"json", hauDTO.toJson(), null));
    }

}