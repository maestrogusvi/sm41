package com.ut.sm41.service;
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
    BeeceptorDTO testHttp() throws IOException;

    CaamalDTO caamalHttp() throws IOException;

    TunDTO tunHttp() throws IOException;

    DominguezDTO dominguezHttp() throws IOException;

    MercadoLibreDTO mercadoHttp() throws  IOException;

    void tunPostHttp() throws IOException;

    void caamalPostHttp() throws IOException;

    void dominguezPostHttp() throws IOException;

    void testMyFirsObject(CaamalDTO caamalDTO);

}
