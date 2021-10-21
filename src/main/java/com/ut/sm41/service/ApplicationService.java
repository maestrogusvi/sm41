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
        JsonObject json = (JsonObject) parser.parse(httpService.sendRequestHttpS("https://pavelsm41.free.beeceptor.com","GET",null,null,"json",null, null));
        BeeceptorDTO beeceptorDTO = new BeeceptorDTO();
        beeceptorDTO.setCode(json.get("code").getAsString());
        beeceptorDTO.setMessage(json.get("message").getAsString());
        beeceptorDTO.setStatus(json.get("status").getAsString());
        return beeceptorDTO;
    }
    public BatunDTO batunHttp() throws IOException {
        JsonParser parser = new JsonParser();
        JsonObject json = (JsonObject) parser.parse(httpService.sendRequestHttpS("https://utsm41.free.beeceptor.com","GET",null,null,"json",null, null));
        BatunDTO BatunDTO = new BatunDTO();
        BatunDTO.setName(json.get("name").getAsString());
        BatunDTO.setId(json.get("Id").getAsInt());
        BatunDTO.getStatus(json.get("status").getAsString());
        return BatunDTO;
    }

    public MartinezDTO martinezHttp() throws IOException {
        JsonParser parser = new JsonParser();
        JsonObject json = (JsonObject) parser.parse(httpService.sendRequestHttpS("https://batunsm41.free.beeceptor.com","GET",null,null,"json",null, null));
        MartinezDTO martinezDTO = new MartinezDTO();
        martinezDTO.setName(json.get("name").getAsString());
        martinezDTO.setId(json.get("id").getAsInt());
        martinezDTO.setStatus(json.get("status").getAsString());
        return martinezDTO;
    }

    public BadilloDTO BadilloHttp() throws IOException {
        JsonParser parser = new JsonParser();
        JsonObject json = (JsonObject) parser.parse(httpService.sendRequestHttpS("https://badillosm41.free.beeceptor.com","GET",null,null,"json",null, null));
        BadilloDTO badilloDTO = new BadilloDTO();
        badilloDTO.setName(json.get("name").getAsString());
        badilloDTO.setId(json.get("id").getAsInt());
        badilloDTO.setStatus(json.get("status").getAsString());
        return badilloDTO;
    }

    public VarguezDTO varguezHttp() throws IOException {
        JsonParser parser = new JsonParser();
        JsonObject json = (JsonObject) parser.parse(httpService.sendRequestHttpS("https://misael41.free.beeceptor.com","GET",null,null,"json",null, null));
        VarguezDTO varguezDTO = new VarguezDTO();
       varguezDTO.setName(json.get("name").getAsString());
        varguezDTO.setId(json.get("id").getAsInt());
        varguezDTO.setStatus(json.get("status").getAsString());
        return varguezDTO;
    }

    public CadenaDTO cadenaHttp() throws IOException {
        JsonParser parser = new JsonParser();
        JsonObject json = (JsonObject) parser.parse(httpService.sendRequestHttpS("https://cadenasm41.free.beeceptor.com","GET",null,null,"json",null, null));
        CadenaDTO cadenaDTO = new CadenaDTO();
        cadenaDTO.setName(json.get("name").getAsString());
        cadenaDTO.setId(json.get("id").getAsInt());
        cadenaDTO.setStatus(json.get("status").getAsString());
        return cadenaDTO;
    }
}


