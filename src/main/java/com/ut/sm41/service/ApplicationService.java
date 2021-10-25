package com.ut.sm41.service;

import com.ut.sm41.dto.*;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

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
    SilvaDTO silvaPostHttp(SilvaDTO silvaDTO) throws  IOException;

    CaamalDTO caamalHttp() throws IOException;
    void caamalPostHttp() throws IOException;


}
