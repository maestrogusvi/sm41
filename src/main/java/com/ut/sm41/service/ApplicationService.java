package com.ut.sm41.service;

import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.ut.sm41.dto.BeeceptorDTO;
import com.ut.sm41.dto.MontejoDTO;
import com.ut.sm41.dto.MartinezDTO;
import com.ut.sm41.exception.BusinessException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import com.ut.sm41.dto.RomanoDTO;
import com.ut.sm41.dto.VazquezDTO;
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
        if(json.get("code")== null){
            throw new BusinessException("Code doesn´t exist", HttpStatus.FORBIDDEN);
        }
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

    public MontejoDTO montejoHttp() throws IOException {
        JsonParser parser = new JsonParser();
        JsonObject json = (JsonObject) parser.parse(httpService.sendRequestHttpS("https://utsm41-safalu.free.beeceptor.com","GET",null,null,"json",null, null));
        MontejoDTO montejoDTO = new MontejoDTO();
        montejoDTO.setName(json.get("name").getAsString());
        montejoDTO.setId(json.get("id").getAsInt());
        montejoDTO.setStatus(json.get("status").getAsString());
        return montejoDTO;
    }

    public MartinezDTO martinezHttp() throws IOException {
        JsonParser parser = new JsonParser();
        JsonObject json = (JsonObject) parser.parse(httpService.sendRequestHttpS("https://utsm41-safalu.free.beeceptor.com","GET",null,null,"json",null, null));
        MartinezDTO martinezDTO = new MartinezDTO();
        martinezDTO.setName(json.get("name").getAsString());
        martinezDTO.setId(json.get("id").getAsInt());
        martinezDTO.setStatus(json.get("status").getAsString());
        return martinezDTO;
    }
}
