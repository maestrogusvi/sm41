package com.ut.sm41.service;

import com.ut.sm41.dto.*;
import org.springframework.stereotype.Service;

import java.io.IOException;

@Service
public interface ApplicationService {

    String firstService();
    BeeceptorDTO testHttp() throws IOException;
    void testMyFirstObject(AnotaDTO anotaDTO);

    CaamalDTO testMyFirstObject(CaamalDTO caamalDTO);

    AnotaDTO anotaPostHttp(AnotaDTO anotaDTO) throws IOException;

    AnotaDTO anotaHttp() throws IOException;

    VillagranDTO villagranHttp() throws IOException;

    void villagranPostHttp(VillagranDTO villagranDTO) throws IOException;

    SilvaDTO silvaHttp() throws IOException;

    void silvaPostHttp(SilvaDTO silvaDTO) throws IOException;

    CaamalDTO caamalHttp() throws IOException;

    CaamalDTO caamalPostHttp(CaamalDTO caamalDTO) throws IOException;

}
