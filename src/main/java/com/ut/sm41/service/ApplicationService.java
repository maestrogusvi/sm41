package com.ut.sm41.service;

import ch.qos.logback.core.pattern.parser.Parser;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.ut.sm41.dto.*;
import com.ut.sm41.exception.BusinessException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import java.io.IOException;

@Service
public interface ApplicationService {

    String firstService();
    BeeceptorDTO testHttp() throws IOException ;

    AriasDTO testHttp() throws IOException ;
    BautistaDTO testHttp() throws IOException ;
    SotoDTO testHttp() throws IOException ;
    TukDTO testHttp() throws IOException ;
    ZapataDTO testHttp() throws IOException ;


}
