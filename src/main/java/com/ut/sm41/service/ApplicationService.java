package com.ut.sm41.service;

import com.ut.sm41.dto.*;
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

    void testPostHttp(BeeceptorDTO beeceptorDTO) throws IOException;
    void bautistaPostHttp(BautistaDTO bautistaDTO) throws IOException;
    void ariasPostHttp(AriasDTO ariasDTO) throws IOException;
    void zapataPostHttp(ZapataDTO zapataDTO) throws IOException;
    void sotoPostHttp(SotoDTO sotoDTO) throws IOException;
    void ariasPostHttp() throws IOException;
    void tukPostHttp() throws IOException;


}
