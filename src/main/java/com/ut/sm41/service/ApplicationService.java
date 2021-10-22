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

    AriasDTO ariasHttp() throws IOException ;
    BautistaDTO bautistaHttp() throws IOException ;
    SotoDTO sotoHttp() throws IOException ;
    TukDTO tukHttp() throws IOException ;
    ZapataDTO zapataHttp() throws IOException ;

    void bautistaPostHttp() throws IOException;
    void zapataPostHttp() throws IOException;
    void ariasPostHttp() throws IOException;


}
