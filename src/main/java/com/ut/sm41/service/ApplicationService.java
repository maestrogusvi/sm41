package com.ut.sm41.service;

import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.ut.sm41.dto.BeeceptorDTO;
import com.ut.sm41.dto.MartinezDTO;
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
        JsonObject json = (JsonObject) parser.parse(httpService.sendRequestHttpS("https://pavelsm41.free.beeceptor.com","GET",null,null,"json",null, null));
        BeeceptorDTO beeceptorDTO = new BeeceptorDTO();
        beeceptorDTO.setCode(json.get("code").getAsString());
        beeceptorDTO.setMessage(json.get("message").getAsString());
        beeceptorDTO.setStatus(json.get("status").getAsString());
        return beeceptorDTO;
    }

    public MartinezDTO martinezHttp() throws IOException {
        JsonParser parser = new JsonParser();
        JsonObject json = (JsonObject) parser.parse(httpService.sendRequestHttpS("https://pavelsm41.free.beeceptor.com","GET",null,null,"json",null, null));
        MartinezDTO martinezDTO = new MartinezDTO();
        martinezDTO.setName(json.get("name").getAsString());
        martinezDTO.setId(json.get("id").getAsInt());
        martinezDTO.setStatus(json.get("status").getAsString());
        return martinezDTO;
    }
}
