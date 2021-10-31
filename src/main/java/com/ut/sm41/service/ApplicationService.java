package com.ut.sm41.service;

import com.ut.sm41.dto.*;
import org.springframework.stereotype.Service;

import java.io.IOException;

@Service
public interface ApplicationService {

    String firstService();
    BeeceptorDTO testHttp() throws IOException;


    AnotaDTO anotaHttp() throws IOException;

    AnotaDTO anotaPostHttp(AnotaDTO anotaDTO) throws IOException;

    void anotaPost(AnotaDTO anotaDTO);

    VillagranDTO villagranHttp() throws IOException;

    void villagranPostHttp(VillagranDTO villagranDTO) throws IOException;

    SilvaDTO silvaHttp() throws IOException;

    void silvaPostHttp(SilvaDTO silvaDTO) throws IOException;

    CaamalDTO caamalHttp() throws IOException;

    CaamalDTO caamalPostHttp(CaamalDTO caamalDTO) throws IOException;

    void caamalPost(CaamalDTO caamalDTO);


}
