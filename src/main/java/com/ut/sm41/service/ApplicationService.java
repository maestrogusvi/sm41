package com.ut.sm41.service;

import ch.qos.logback.core.pattern.parser.Parser;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.ut.sm41.dto.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
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
        if(json.get("code")== null){
            throw new BusinessException("Code doesn´t exist", HttpStatus.FORBIDDEN);
        }
        BeeceptorDTO beeceptorDTO = new BeeceptorDTO();
        beeceptorDTO.setCode(json.get("code").getAsString());
        beeceptorDTO.setMessage(json.get("message").getAsString());
        beeceptorDTO.setStatus(json.get("status").getAsString());
        return beeceptorDTO;
    }

    public ZapataDTO zapataHttp() throws IOException {
        JsonParser parser = new JsonParser();
        JsonObject json = (JsonObject) parser.parse(httpService.sendRequestHttpS("https://zapatasm41.free.beeceptor.com", "GET", null, null, "json", null, null));
        ZapataDTO zapataDTO = new ZapataDTO();
        zapataDTO.setName(json.get("name").getAsString());
        zapataDTO.setId(json.get("id").getAsInt());
        zapataDTO.setStatus(json.get("status").getAsString());
        return zapataDTO;
    }

        public BautistaDTO bautistaHttp() throws IOException{
        JsonParser parser = new JsonParser();
        JsonObject json = (JsonObject) parser.parse(httpService.sendRequestHttpS("https://bautistasm41.free.beeceptor.com","GET",null,null,"json",null, null));
        BautistaDTO bautistaDTO = new BautistaDTO();
        bautistaDTO.setId(json.get("id").getAsInt());
        bautistaDTO.setName(json.get("name").getAsString());
        bautistaDTO.setStatus(json.get("status").getAsString());
        return bautistaDTO;
    }

        public AriasDTO ariasHttp() throws IOException{
        JsonParser parser = new JsonParser();
        JsonObject json = (JsonObject) parser.parse(httpService.sendRequestHttpS("https://ariasmaysm41.free.beeceptor.com","GET",null,null,"json",null, null));
        AriasDTO ariasDTO = new AriasDTO();
        ariasDTO.setId(json.get("id").getAsInt());
        ariasDTO.setName(json.get("name").getAsString());
        ariasDTO.setStatus(json.get("status").getAsString());
        return ariasDTO;
    }

        public SotoDTO sotoHttp() throws IOException{
        JsonParser parser = new JsonParser();
        JsonObject json = (JsonObject) parser.parse(httpService.sendRequestHttpS("https://miner512.free.beeceptor.com","GET",null,null,"json",null, null));
        SotoDTO sotoDTO = new SotoDTO();
        sotoDTO.setId(json.get("id").getAsInt());
        sotoDTO.setName(json.get("name").getAsString());
        sotoDTO.setStatus(json.get("status").getAsString());
        return sotoDTO;
    }
}
