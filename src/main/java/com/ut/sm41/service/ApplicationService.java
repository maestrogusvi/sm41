package com.ut.sm41.service;

import com.ut.sm41.dto.*;
import org.springframework.stereotype.Service;
import java.io.IOException;

@Service
public interface ApplicationService {

     String firstService();

     BeeceptorDTO testHttp() throws IOException ;

     BatunDTO batunHttp() throws IOException;
     BatunDTO batunPostHttp(BatunDTO batunDTO) throws IOException;
     void batunMyFirstObject(BatunDTO batunDTO);


     MartinezDTO martinezHttp() throws IOException;
     void martinezPostHttp(MartinezDTO martinezDTO) throws IOException;

     BadilloDTO badilloHttp() throws IOException;
     void badilloPostHttp(BadilloDTO badilloDTO) throws IOException;

     VarguezDTO varguezHttp() throws IOException;
     VarguezDTO varguezPostHttp(VarguezDTO varguezDTO) throws IOException;
     void varguezMyFirstObject(VarguezDTO varguezDTO);


     CadenaDTO cadenaHttp() throws IOException;
     void cadenaPostHttp(CadenaDTO cadenaDTO) throws  IOException;

     MercadolibreDTO mercadolibreHttp() throws IOException;
}


