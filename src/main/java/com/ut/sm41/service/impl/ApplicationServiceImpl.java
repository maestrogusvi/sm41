package com.ut.sm41.service.impl;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.ut.sm41.dto.*;
import com.ut.sm41.exception.BusinessException;
import com.ut.sm41.model.UserModel;
import com.ut.sm41.repository.UserRepository;
import com.ut.sm41.service.HttpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import java.io.IOException;
import com.ut.sm41.service.ApplicationService;

@Service
public class ApplicationServiceImpl implements ApplicationService {
    @Autowired
    HttpService httpService;

    @Autowired
    UserRepository userRepository;


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
    @Override
    public CaamalDTO caamalHttp() throws IOException {
        JsonParser parser = new JsonParser();
        JsonObject json = (JsonObject) parser.parse(httpService.sendRequestHttpS("https://sm41caamal.free.beeceptor.com","GET",null,null,"json",null, null));
        CaamalDTO caamalDTO = new CaamalDTO();
        caamalDTO.setName(json.get("name").getAsString());
        caamalDTO.setId(json.get("id").getAsInt());
        caamalDTO.setStatus(json.get("status").getAsString());
        return caamalDTO;
    }
    @Override
    public TunDTO tunHttp() throws IOException {
        JsonParser parser = new JsonParser();
        JsonObject json = (JsonObject) parser.parse(httpService.sendRequestHttpS("https://sm41tun.free.beeceptor.com","GET",null,null,"json",null, null));
        TunDTO tunDTO = new TunDTO();
        tunDTO.setName(json.get("name").getAsString());
        tunDTO.setId(json.get("id").getAsInt());
        tunDTO.setStatus(json.get("status").getAsString());
        return tunDTO;
    }
    @Override
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

    @Override
    public void caamalPostHttp() throws IOException {
        JsonParser parser = new JsonParser();
        CaamalDTO caamalDTO = new CaamalDTO();
        caamalDTO.setId(12);
        caamalDTO.setName("Antonio Caamal");
        caamalDTO.setStatus("Success");
        JsonObject json = (JsonObject) parser.parse(httpService.sendRequestHttpS("https://spiderman.free.beeceptor.com/api/v1/testPost","POST",null,null,"json", caamalDTO.toJson(), null));


    }


    @Override
    public void dominguezPostHttp() throws IOException {
        JsonParser parser = new JsonParser();
        DominguezDTO dominguezDTO = new DominguezDTO();
        dominguezDTO.setId(03);
        dominguezDTO.setName("Ernesto Dominguez");
        dominguezDTO.setStatus("Success");
        JsonObject json = (JsonObject) parser.parse(httpService.sendRequestHttpS("https://ernestodp11.free.beeceptor.com/api/v1/testPost","POST",null,null,"json", dominguezDTO.toJson(), null));


    }

    @Override
    public void testMyFirsObject(CaamalDTO caamalDTO) {
        UserModel userModel = new UserModel();
        userModel.setName(caamalDTO.getName());
        userRepository.save(userModel);
    }

    @Override
    public MercadoLibreDTO mercadoHttp()throws IOException {
        JsonParser parser = new JsonParser();
        JsonObject json = (JsonObject) parser.parse(httpService.sendRequestHttpS("https://api.mercadolibre.com/sites/MCO/search?q=MCO1055", "GET", null, null, "json", null, null));
        JsonObject object = (JsonObject) json.get("paging");
        MercadoLibreDTO mercadoDTO = new MercadoLibreDTO();
        mercadoDTO.setQuery(json.get("query").getAsString());
        mercadoDTO.setTotal(json.get("total").getAsInt());
        mercadoDTO.setPrimary_results(json.get("primary_results").getAsInt());
        return mercadoDTO;
    }


}
