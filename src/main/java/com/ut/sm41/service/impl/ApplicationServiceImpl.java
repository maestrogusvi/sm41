package com.ut.sm41.service.impl;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.ut.sm41.dto.BeeceptorDTO;
import com.ut.sm41.dto.CaamalDTO;
import com.ut.sm41.dto.DominguezDTO;
import com.ut.sm41.dto.TunDTO;
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
        JsonObject Json = (JsonObject) parser.parse(httpService.sendRequestHttpS("https://sm41caamal.free.beeceptor.com","GET",null,null,"json",null, null));
        BeeceptorDTO beeceptorDTO = new BeeceptorDTO();
        beeceptorDTO.setCode(json.get("code").getAsString());
        beeceptorDTO.setMessage(json.get("message").getAsString());
        beeceptorDTO.setStatus(json.get("status").getAsString());
        return beeceptorDTO;
    }

    public CaamalDTO caamalHttp() throws IOException {
        JsonParser parser = new JsonParser();
        JsonObject json = (JsonObject) parser.parse(httpService.sendRequestHttpS("https://sm41caamal.free.beeceptor.com","GET",null,null,"json",null, null));
        CaamalDTO caamalDTO = new CaamalDTO();
        caamalDTO.setName(json.get("name").getAsString());
        caamalDTO.setId(json.get("id").getAsInt());
        caamalDTO.setStatus(json.get("status").getAsString());
        return caamalDTO;
    }

    public TunDTO tunHttp() throws IOException {
        JsonParser parser = new JsonParser();
        JsonObject json = (JsonObject) parser.parse(httpService.sendRequestHttpS("https://sm41tun.free.beeceptor.com","GET",null,null,"json",null, null));
        TunDTO tunDTO = new TunDTO();
        tunDTO.setName(json.get("name").getAsString());
        tunDTO.setId(json.get("id").getAsInt());
        tunDTO.setStatus(json.get("status").getAsString());
        return tunDTO;
    }

    public DominguezDTO dominguezHttp() throws IOException {
        JsonParser parser = new JsonParser();
        JsonObject json = (JsonObject) parser.parse(httpService.sendRequestHttpS("https://ernestodp11.free.beeceptor.com","GET",null,null,"json",null, null));
        DominguezDTO dominguezDTO = new DominguezDTO();
        dominguezDTO.setName(json.get("name").getAsString());
        dominguezDTO.setId(json.get("id").getAsInt());
        dominguezDTO.setStatus(json.get("status").getAsString());
        return dominguezDTO;
    }

    @Override
    public void tunPostHttp() throws IOException {
        JsonParser parser = new JsonParser();
        TunDTO tunDTO = new TunDTO();
        tunDTO.setId(01);
        tunDTO.setName("Emiliano Tun");
        tunDTO.setStatus("Success");
        JsonObject json = (JsonObject) parser.parse(httpService.sendRequestHttpS("https://sm41tun.free.beeceptor.com/api/v1/testPost","POST",null,null,"json",tunDTO.toJson(), null));

    }
}
