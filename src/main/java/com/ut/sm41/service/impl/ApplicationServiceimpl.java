package com.ut.sm41.service.impl;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.ut.sm41.dto.*;
import com.ut.sm41.service.ApplicationService;
import com.ut.sm41.service.HttpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.IOException;

@Service
public class ApplicationServiceimpl implements ApplicationService {

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
        BeeceptorDTO beeceptorDTO = new BeeceptorDTO();
        beeceptorDTO.setCode(json.get("code").getAsString());
        beeceptorDTO.setMessage(json.get("message").getAsString());
        beeceptorDTO.setStatus(json.get("status").getAsString());
        return beeceptorDTO;
    }
    @Override
    public BatunDTO batunHttp() throws IOException {
        JsonParser parser = new JsonParser();
        JsonObject json = (JsonObject) parser.parse(httpService.sendRequestHttpS("https://utsm41.free.beeceptor.com","GET",null,null,"json",null, null));
        BatunDTO batunDTO = new BatunDTO();
        batunDTO.setName(json.get("name").getAsString());
        batunDTO.setId(json.get("Id").getAsInt());
        batunDTO.setStatus(json.get("status").getAsString());
        return batunDTO;
    }
    @Override
    public void batunPostHttp() throws IOException {
        JsonParser parser = new JsonParser();
        BatunDTO batunDTO = new BatunDTO();
        batunDTO.setName("name");
        batunDTO.setId(500);
        batunDTO.setStatus("Success");
        JsonObject json = (JsonObject) parser.parse(httpService.sendRequestHttpS("https://batunsm41.free.beeceptor.com/api/v1/batunPost","POST",null,null,"json", batunDTO.toJson(), null));

    }
    @Override
    public MartinezDTO martinezHttp() throws IOException {
        JsonParser parser = new JsonParser();
        JsonObject json = (JsonObject) parser.parse(httpService.sendRequestHttpS("https://pavelsm41.free.beeceptor.com","GET",null,null,"json",null, null));
        MartinezDTO martinezDTO = new MartinezDTO();
        martinezDTO.setName(json.get("name").getAsString());
        martinezDTO.setId(json.get("id").getAsInt());
        martinezDTO.setStatus(json.get("status").getAsString());
        return martinezDTO;
    }

    @Override
    public void martinezPostHttp() throws IOException {
        JsonParser parser = new JsonParser();
        MartinezDTO martinezDTO = new MartinezDTO();
        martinezDTO.setStatus("Success");
        martinezDTO.setId(500);
        martinezDTO.setName("from Post");

        JsonObject json = (JsonObject) parser.parse(httpService.sendRequestHttpS("https://pavelsm41.free.beeceptor.com/api/v1/martinezPost","GET",null,null,"json", martinezDTO.toJson(), null));

    }

    @Override
    public BadilloDTO badilloHttp() throws IOException {
        JsonParser parser = new JsonParser();
        JsonObject json = (JsonObject) parser.parse(httpService.sendRequestHttpS("https://badillosm41.free.beeceptor.com","GET",null,null,"json",null, null));
        BadilloDTO badilloDTO = new BadilloDTO();
        badilloDTO.setName(json.get("name").getAsString());
        badilloDTO.setId(json.get("id").getAsInt());
        badilloDTO.setStatus(json.get("status").getAsString());
        return badilloDTO;
    }
    @Override
    public VarguezDTO varguezHttp() throws IOException {
        JsonParser parser = new JsonParser();
        JsonObject json = (JsonObject) parser.parse(httpService.sendRequestHttpS("https://misael41.free.beeceptor.com","GET",null,null,"json",null, null));
        VarguezDTO varguezDTO = new VarguezDTO();
        varguezDTO.setName(json.get("name").getAsString());
        varguezDTO.setId(json.get("id").getAsInt());
        varguezDTO.setStatus(json.get("status").getAsString());
        return varguezDTO;
    }

    @Override
    public void varguezPostHttp() throws IOException {
        JsonParser parser = new JsonParser();
        VarguezDTO varguezDTO = new VarguezDTO();
        varguezDTO.setId(360);
        varguezDTO.setName("Misael Varguez");
        varguezDTO.setStatus("Success");
        JsonObject json = (JsonObject) parser.parse(httpService.sendRequestHttpS("https://misael41.free.beeceptor.com/api/v1/varguezPost","POST",null,null,"json", varguezDTO.toJson(), null));

    }
    @Override
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

