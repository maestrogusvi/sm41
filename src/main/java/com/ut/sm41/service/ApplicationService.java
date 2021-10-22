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

    AnotaDTO anotaHttp() throws IOException;
    void anotaPostHttp() throws IOException;

    VillagranDTO villagranHttp() throws IOException;
    void villagranPostHttp() throws IOException;

    SilvaDTO silvaHttp() throws IOException;
    void silvaPostHttp() throws  IOException;

    CaamalDTO caamalHttp() throws IOException;
    void caamalPostHttp() throws IOException;


}
