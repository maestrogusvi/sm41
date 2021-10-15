package com.ut.sm41.service;

import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.ut.sm41.dto.BeeceptorDTO;
import com.ut.sm41.dto.CaamalDTO;
import com.ut.sm41.dto.TunDTO;
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
        JsonObject json = (JsonObject) parser.parse(httpService.sendRequestHttpS("https://sm41caamal.free.beeceptor.com","GET",null,null,"json",null, null));
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
}
