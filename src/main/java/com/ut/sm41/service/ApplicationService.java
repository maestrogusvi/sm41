package com.ut.sm41.service;

import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.ut.sm41.dto.*;
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
    public AnotaDTO AnotaHttp() throws IOException {
        JsonParser parser = new JsonParser();
        JsonObject json = (JsonObject) parser.parse(httpService.sendRequestHttpS("https://sm41dinamita.free.beeceptor.com","GET",null,null,"json",null, null));
        AnotaDTO anotaDTO = new AnotaDTO();
        anotaDTO.setName(json.get("name").getAsString());
        anotaDTO.setId(json.get("id").getAsInt());
        anotaDTO.setStatus(json.get("status").getAsString());
        return anotaDTO;
    }
    public VillagranDTO VillagranHttp() throws IOException {
        JsonParser parser = new JsonParser();
        JsonObject json = (JsonObject) parser.parse(httpService.sendRequestHttpS("https://dinamita-sm41.free.beeceptor.com","GET",null,null,"json",null, null));
        VillagranDTO villagranDTO = new VillagranDTO();
        villagranDTO.setName(json.get("name").getAsString());
        villagranDTO.setId(json.get("id").getAsInt());
        villagranDTO.setStatus(json.get("status").getAsString());
        return villagranDTO;
    }
    public SilvaDTO SilvaHttp() throws IOException {
        JsonParser parser = new JsonParser();
        JsonObject json = (JsonObject) parser.parse(httpService.sendRequestHttpS("https://sm41-dinamita.free.beeceptor.com","GET",null,null,"json",null, null));
        SilvaDTO silvaDTO = new SilvaDTO();
        silvaDTO.setName(json.get("name").getAsString());
        silvaDTO.setId(json.get("id").getAsInt());
        silvaDTO.setStatus(json.get("status").getAsString());
        return silvaDTO;
    }

    public CaamalDTO CaamalHttp() throws IOException {
        JsonParser parser = new JsonParser();
        JsonObject json = (JsonObject) parser.parse(httpService.sendRequestHttpS("https://sm41dinamita-team.free.beeceptor.com", "GET", null, null, "json", null, null));
        CaamalDTO CaamalDTO = new CaamalDTO();
        CaamalDTO.setName(json.get("name").getAsString());
        CaamalDTO.setId(json.get("id").getAsInt());
        CaamalDTO.setStatus(json.get("status").getAsString());
        return CaamalDTO;
    }


}
