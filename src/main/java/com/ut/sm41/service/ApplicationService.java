package com.ut.sm41.service;
import com.ut.sm41.dto.*;
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

    void testMyFirsObject(DominguezDTO dominguezDTO);

    void testMyFirsObject(CaamalDTO caamalDTO);


}
