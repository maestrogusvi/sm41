package com.ut.sm41.service;

import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.ut.sm41.dto.BeeceptorDTO;
import com.ut.sm41.dto.RomanoDTO;
import com.ut.sm41.dto.VazquezDTO;
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
        JsonObject json = (JsonObject) parser.parse(httpService.sendRequestHttpS("https://utsm41-safalu.free.beeceptor.com","GET",null,null,"json",null, null));
        BeeceptorDTO beeceptorDTO = new BeeceptorDTO();
        beeceptorDTO.setCode(json.get("code").getAsString());
        beeceptorDTO.setMessage(json.get("message").getAsString());
        beeceptorDTO.setStatus(json.get("status").getAsString());
        return beeceptorDTO;
    }

    public VazquezDTO vazquezHttp() throws IOException {
        JsonParser parser = new JsonParser();
        JsonObject json = (JsonObject) parser.parse(httpService.sendRequestHttpS("https://utsm41-safalu.free.beeceptor.com","GET",null,null,"json",null, null));
        VazquezDTO vazquezDTO = new VazquezDTO();
        vazquezDTO.setName(json.get("name").getAsString());
        vazquezDTO.setId(json.get("id").getAsInt());
        vazquezDTO.setStatus(json.get("status").getAsString());
        return vazquezDTO;
    }
    public RomanoDTO romanoHttp() throws IOException {
        JsonParser parser = new JsonParser();
        JsonObject json = (JsonObject) parser.parse(httpService.sendRequestHttpS("https://utsm41-safalu.free.beeceptor.com","GET",null,null,"json",null, null));
        RomanoDTO romanoDTO = new RomanoDTO();
        romanoDTO.setName(json.get("name").getAsString());
        romanoDTO.setId(json.get("id").getAsInt());
        romanoDTO.setStatus(json.get("status").getAsString());
        return romanoDTO;
    }
}
