package com.ut.sm41.service;

import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.ut.sm41.dto.BeeceptorDTO;
import com.ut.sm41.dto.EstradaDTO;
import com.ut.sm41.dto.RamirezDTO;
import com.ut.sm41.dto.HauDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import java.io.IOException;

@Service
public interface ApplicationService {



     String firstService();

     BeeceptorDTO testHttp() throws IOException;

     EstradaDTO estradaHttp() throws IOException ;

     RamirezDTO ramirezHttp() throws IOException ;

     HauDTO hauHttp() throws IOException ;
}
