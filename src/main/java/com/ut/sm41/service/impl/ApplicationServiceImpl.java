package com.ut.sm41.service.impl;

import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.ut.sm41.dto.*;
import com.ut.sm41.exception.BusinessException;
import com.ut.sm41.model.UserModel;
import com.ut.sm41.repository.UserRepository;
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

    @Autowired
    UserRepository userRepository;

    @Override
    public String firstService() { return "service"; }

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

    public EstradaDTO estradaHttp() throws IOException {
        JsonParser parser = new JsonParser();
        JsonObject json = (JsonObject) parser.parse(httpService.sendRequestHttpS("https://estrada.free.beeceptor.com", "GET", null, null, "json", null, null));
        EstradaDTO estradaDTO = new EstradaDTO();
        estradaDTO.setName(json.get("name").getAsString());
        estradaDTO.setId(json.get("id").getAsInt());
        estradaDTO.setStatus(json.get("status").getAsString());
        return estradaDTO;
    }

    public EstradaDTO estradaPostHttp(EstradaDTO estradaDTO) throws IOException {
        JsonParser parser = new JsonParser();
        JsonObject json = (JsonObject) parser.parse(httpService.sendRequestHttpS("https://estrada.free.beeceptor.com/api/v1/estradaPostHttp","POST",null,null,"json",estradaDTO.toJson(), null));
        return estradaDTO;
    }

    @Override
    public void testObject(EstradaDTO estradaDTO) {
        UserModel userModel = new UserModel();
        userModel.setName(estradaDTO.getName());
        userRepository.save(userModel);
    }

    @Override
    public BooksDTO booksHttp() throws IOException {
        JsonParser parser = new JsonParser();
        JsonObject json = (JsonObject) parser.parse(httpService.sendRequestHttpS("https://simple-books-api.glitch.me/books","GET",null,null,"json",null, ""));
        JsonObject object = (JsonObject) json.get("result");
        BooksDTO booksDTO = new BooksDTO();
        booksDTO.setId(object.get("id").getAsString());
        booksDTO.setName(object.get("name").getAsString());
        booksDTO.setType(object.get("type").getAsString());
        booksDTO.setAvailable(object.get("available").getAsString());
        return booksDTO;
    }

    @Override
    public RamirezDTO ramirezHttp() throws IOException {
        JsonParser parser = new JsonParser();
        JsonObject json = (JsonObject) parser.parse(httpService.sendRequestHttpS("https://christopher.free.beeceptor.com", "GET", null, null, "json", null, null));
        RamirezDTO ramirezDTO = new RamirezDTO();
        ramirezDTO.setName(json.get("name").getAsString());
        ramirezDTO.setId(json.get("id").getAsInt());
        ramirezDTO.setStatus(json.get("status").getAsString());
        return ramirezDTO;
    }

    @Override
    public RamirezDTO ramirezPostHttp(RamirezDTO ramirezDTO) throws IOException {
        JsonParser parser  = new JsonParser();
        JsonObject json = (JsonObject) parser.parse(httpService.sendRequestHttpS("https://christopher.free.beeceptor.com/api/v1/ramirezPost","POST",null,null,"json",ramirezDTO.toJson(), null));
        return ramirezDTO;
    }

    @Override
    public void testMyFirstObject(RamirezDTO ramirezDTO) {
        UserModel userModel = new UserModel();
        userModel.setName(ramirezDTO.getName());
        userRepository.save(userModel);
    }


    @Override
    public HauDTO hauHttp() throws IOException {
        JsonParser parser = new JsonParser();
        JsonObject json = (JsonObject) parser.parse(httpService.sendRequestHttpS("https://alfasm41.free.beeceptor.com","GET",null,null,"json",null, null));
        HauDTO hauDTO = new HauDTO();
        hauDTO.setName(json.get("name").getAsString());
        hauDTO.setId(json.get("id").getAsInt());
        hauDTO.setStatus(json.get("status").getAsString());
        return hauDTO;
    }

    public HauDTO hauPostHttp(HauDTO hauDTO) throws IOException {
        JsonParser parser = new JsonParser();
        JsonObject json = (JsonObject) parser.parse(httpService.sendRequestHttpS("https://hau.free.beeceptor.com/api/v1/estradaPostHttp","POST",null,null,"json",hauDTO.toJson(), null));
        return hauDTO;
    }

}