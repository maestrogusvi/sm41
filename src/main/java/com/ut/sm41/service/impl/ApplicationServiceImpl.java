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
import org.springframework.web.bind.annotation.RequestBody;

import java.io.IOException;

@Service
public class ApplicationServiceImpl implements ApplicationService {

    @Autowired
    HttpService httpService;

    @Override
    public String firstService(){
        return "service";
    }

    @Override
    public BeeceptorDTO testHttp() throws IOException {
        JsonParser parser = new JsonParser();
JsonObject json = (JsonObject) parser.parse(httpService.sendRequestHttpS("https://utsm41.free.beeceptor.com","GET",null,null,"json",null, null));
        if(json.get("code")== null){
            throw new BusinessException("Code doesn´t exist", HttpStatus.FORBIDDEN);
        }
        BeeceptorDTO beeceptorDTO = new BeeceptorDTO();
        beeceptorDTO.setCode(json.get("code").getAsString());
        beeceptorDTO.setMessage(json.get("message").getAsString());
        beeceptorDTO.setStatus(json.get("status").getAsString());
        return beeceptorDTO;
    }

    @Override
    public AnotaDTO anotaPostHttp(AnotaDTO anotaDTO) throws IOException {
        JsonParser parser = new JsonParser();
        JsonObject json = (JsonObject) parser.parse(httpService.sendRequestHttpS("https://sm41dinamita.free.beeceptor.com/api/v1/anotaPost","POST",null,null,"json",anotaDTO.toJson(), null));
        return anotaDTO;
    }

    @Override
    public AnotaDTO anotaHttp() throws IOException {
        JsonParser parser = new JsonParser();
        JsonObject json = (JsonObject) parser.parse(httpService.sendRequestHttpS("https://sm41dinamita.free.beeceptor.com","GET",null,null,"json",null, null));
        AnotaDTO anotaDTO = new AnotaDTO();
        anotaDTO.setName(json.get("name").getAsString());
        anotaDTO.setId(json.get("id").getAsInt());
        anotaDTO.setStatus(json.get("status").getAsString());
        return anotaDTO;
    }

    @Override
    public VillagranDTO villagranHttp() throws IOException {
        JsonParser parser = new JsonParser();
        JsonObject json = (JsonObject) parser.parse(httpService.sendRequestHttpS("https://dinamita-sm41.free.beeceptor.com","GET",null,null,"json",null, null));
        VillagranDTO villagranDTO = new VillagranDTO();
        villagranDTO.setName(json.get("name").getAsString());
        villagranDTO.setId(json.get("id").getAsInt());
        villagranDTO.setStatus(json.get("status").getAsString());
        return villagranDTO;
    }
    @Override
    public VillagranDTO villagranPostHttp(VillagranDTO villagranDTO) throws IOException{
        JsonParser parser = new JsonParser();
        JsonObject json = (JsonObject) parser.parse(httpService.sendRequestHttpS("https://dinamita-sm41.free.beeceptor.com/api/v1/villagranPostHttp","POST",null,null,"json", villagranDTO.toJson(),null));
    return villagranDTO;
    }

    @Override
    public SilvaDTO silvaHttp() throws IOException {
        JsonParser parser = new JsonParser();
        JsonObject json = (JsonObject) parser.parse(httpService.sendRequestHttpS("https://sm41-dinamita.free.beeceptor.com","GET",null,null,"json",null, null));
        SilvaDTO silvaDTO = new SilvaDTO();
        silvaDTO.setName(json.get("name").getAsString());
        silvaDTO.setId(json.get("id").getAsInt());
        silvaDTO.setStatus(json.get("status").getAsString());
        return silvaDTO;
    }

    @Override
    public SilvaDTO silvaPostHttp(SilvaDTO silvaDTO) throws IOException {
        JsonParser parser = new JsonParser();
        JsonObject json = (JsonObject) parser.parse(httpService.sendRequestHttpS("https://sm41-dinamita1.free.beeceptor.com/api/v1/silvaPostHttp","POST",null,null,"json",silvaDTO.toJson(), null));
        return silvaDTO;
    }

    @Override
    public CaamalDTO caamalHttp() throws IOException {
        JsonParser parser = new JsonParser();
        JsonObject json = (JsonObject) parser.parse(httpService.sendRequestHttpS("https://sm41dinamita-team.free.beeceptor.com", "GET", null, null, "json", null, null));
        CaamalDTO caamalDTO = new CaamalDTO();
        caamalDTO.setName(json.get("name").getAsString());
        caamalDTO.setId(json.get("id").getAsInt());
        caamalDTO.setStatus(json.get("status").getAsString());
        return caamalDTO;
    }

    @Override
    public CaamalDTO caamalPostHttp(CaamalDTO caamalDTO) throws IOException {
        JsonParser parser = new JsonParser();
        JsonObject json = (JsonObject) parser.parse(httpService.sendRequestHttpS("https://sm41dinamita-team.free.beeceptor.com/api/v1/caamalPostHttp", "POST", null, null, "json", caamalDTO.toJson(), null));
        return caamalDTO;
    }



}
