package com.ut.sm41.service;

import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.ut.sm41.dto.BeeceptorDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.IOException;

@Service
public class ApplicationService {

    @Autowired
    HttpService httpService;

    public String firstService(){
        return "service";
    }

    public BeeceptorDTO testHttp() throws IOException {
        JsonParser parser = new JsonParser();
        JsonObject json = (JsonObject) parser.parse(httpService.sendRequestHttpS("https://utsm41.free.beeceptor.com","GET",null,null,"json",null, null));
        BeeceptorDTO beeceptorDTO = new BeeceptorDTO();
        beeceptorDTO.setCode(json.get("code").getAsString());
        beeceptorDTO.setMessage(json.get("message").getAsString());
        beeceptorDTO.setStatus(json.get("status").getAsString());
        return beeceptorDTO;
    }

    public EstradaDTO testHttp() throws IOException {
        JsonParser parser = new JsonParser();
        JsonObject json = (JsonObject) parser.parse(httpService.sendRequestHttpS("https://estrada.free.beeceptor.com","GET",null,null,"json",null, null));
        EstradaDTO estradaDTO = new EstradaDTO();
        estradaDTO.setCode(json.get("name").getAsString());
        estradaDTO.setMessage(json.get("id").getAsInt());
        estradaDTO.setStatus(json.get("status").getAsString());
        return estradaDTO;
    }

    public RamirezDTO testHttp() throws IOException {
        JsonParser parser = new JsonParser();
        JsonObject json = (JsonObject) parser.parse(httpService.sendRequestHttpS("https://christopher.free.beeceptor.com","GET",null,null,"json",null, null));
        RamirezDTO ramirezDTO = new RamirezDTO();
        ramirezDTO.setCode(json.get("name").getAsString());
        ramirezDTO.setMessage(json.get("id").getAsInt());
        ramirezDTO.setStatus(json.get("status").getAsString());
        return ramirezDTO;
    }
}
