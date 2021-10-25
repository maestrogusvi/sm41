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

import java.io.IOException;

@Service
public class ApplicationServiceImpl implements ApplicationService {

    @Autowired
    HttpService httpService;

    @Override
    public String firstService() {
        return "service";
    }

    @Override
    public BeeceptorDTO testHttp() throws IOException {
        JsonParser parser = new JsonParser();
        JsonObject json = (JsonObject) parser.parse(httpService.sendRequestHttpS("https://utsm41.free.beeceptor.com", "GET", null, null, "json", null, null));
        if (json.get("code") == null) {
            throw new BusinessException("Code doesn´t exist", HttpStatus.FORBIDDEN);
        }
        BeeceptorDTO beeceptorDTO = new BeeceptorDTO();
        beeceptorDTO.setCode(json.get("code").getAsString());
        beeceptorDTO.setMessage(json.get("message").getAsString());
        beeceptorDTO.setStatus(json.get("status").getAsString());
        return beeceptorDTO;
    }

    public void testPostHttp(BeeceptorDTO beeceptorDTO) throws IOException {
        JsonParser parser = new JsonParser();
        JsonObject json = (JsonObject) parser.parse(httpService.sendRequestHttpS("https://utsm41.free.beeceptor.com/api/v1/testPost", "POST", null, null, "json", beeceptorDTO.toJson(), null));
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

    public BautistaDTO bautistaHttp() throws IOException {
        JsonParser parser = new JsonParser();
        JsonObject json = (JsonObject) parser.parse(httpService.sendRequestHttpS("https://bautistasm41.free.beeceptor.com", "GET", null, null, "json", null, null));
        BautistaDTO bautistaDTO = new BautistaDTO();
        bautistaDTO.setId(json.get("id").getAsInt());
        bautistaDTO.setName(json.get("name").getAsString());
        bautistaDTO.setStatus(json.get("status").getAsString());
        return bautistaDTO;
    }

    public AriasDTO ariasHttp() throws IOException {
        JsonParser parser = new JsonParser();
        JsonObject json = (JsonObject) parser.parse(httpService.sendRequestHttpS("https://ariasmaysm41.free.beeceptor.com", "GET", null, null, "json", null, null));
        AriasDTO ariasDTO = new AriasDTO();
        ariasDTO.setId(json.get("id").getAsInt());
        ariasDTO.setName(json.get("name").getAsString());
        ariasDTO.setStatus(json.get("status").getAsString());
        return ariasDTO;
    }

    public SotoDTO sotoHttp() throws IOException {
        JsonParser parser = new JsonParser();
        JsonObject json = (JsonObject) parser.parse(httpService.sendRequestHttpS("https://miner512.free.beeceptor.com", "GET", null, null, "json", null, null));
        SotoDTO sotoDTO = new SotoDTO();
        sotoDTO.setId(json.get("id").getAsInt());
        sotoDTO.setName(json.get("name").getAsString());
        sotoDTO.setStatus(json.get("status").getAsString());
        return sotoDTO;
    }

    public TukDTO tukHttp() throws IOException {
        JsonParser parser = new JsonParser();
        JsonObject json = (JsonObject) parser.parse(httpService.sendRequestHttpS("https://tukerubiel01.free.beeceptor.com", "GET", null, null, "json", null, null));
        TukDTO tukDTO = new TukDTO();
        tukDTO.setId(json.get("id").getAsInt());
        tukDTO.setName(json.get("name").getAsString());
        tukDTO.setStatus(json.get("status").getAsString());
        return tukDTO;
    }

    public void bautistaPostHttp(BautistaDTO bautistaDTO) throws IOException {
        JsonParser parser = new JsonParser();
        JsonObject json = (JsonObject) parser.parse(httpService.sendRequestHttpS("https://bautistasm41.free.beeceptor.com/api/v1/bautistaPost", "POST", null, null, "json", bautistaDTO.toJson(), null));

    }

    public void zapataPostHttp() throws IOException {
        JsonParser parser = new JsonParser();
        ZapataDTO zapataDTO = new ZapataDTO();
        zapataDTO.setId(501);
        zapataDTO.setName("from Post");
        zapataDTO.setStatus("Success");

        JsonObject json = (JsonObject) parser.parse(httpService.sendRequestHttpS("https://zapatasm41.free.beeceptor.com/api/v1/zapataPost", "POST", null, null, "json", zapataDTO.toJson(), null));

    }

    public void sotoPostHttp() throws IOException {
        JsonParser parser = new JsonParser();
        SotoDTO sotoDTO = new SotoDTO();
        sotoDTO.setId(501);
        sotoDTO.setName("from Post");
        sotoDTO.setStatus("Success");

        JsonObject json = (JsonObject) parser.parse(httpService.sendRequestHttpS("https://miner512.free.beeceptor.com/api/v1/miner512Post", "POST", null, null, "json", sotoDTO.toJson(), null));
    }

    public void ariasPostHttp(AriasDTO ariasDTO) throws IOException {
        JsonParser parser = new JsonParser();
        JsonObject json = (JsonObject) parser.parse(httpService.sendRequestHttpS("https://ariasmaysm41.free.beeceptor.com", "POST", null, null, "json", ariasDTO.toJson(), null));

    }

    public void tukPostHttp() throws IOException {
        JsonParser parser = new JsonParser();
        TukDTO tukDTO = new TukDTO();
        tukDTO.setId(501);
        tukDTO.setName("from Post");
        tukDTO.setStatus("Success");

        JsonObject json = (JsonObject) parser.parse(httpService.sendRequestHttpS("https://tukerubiel01.free.beeceptor.com/api/v1/tukPost", "POST", null, null, "json", tukDTO.toJson(), null));

    }
}