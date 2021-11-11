package com.ut.sm41.service;

import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.ut.sm41.dto.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import java.io.IOException;

@Service
public interface ApplicationService {



     String firstService();

     BeeceptorDTO testHttp() throws IOException;

     EstradaDTO estradaHttp() throws IOException ;
     EstradaDTO estradaPostHttp(EstradaDTO estradaDTO) throws IOException;
     void testObject(EstradaDTO estradaDTO);

     PlayDTO playHttp() throws IOException;

     RamirezDTO ramirezHttp() throws IOException ;
     RamirezDTO ramirezPostHttp(RamirezDTO ramirezDTO) throws IOException;
     void testMyFirstObject(RamirezDTO ramirezDTO);

     HauDTO hauHttp() throws IOException ;
     void hauPostHttp() throws IOException;



}
