package com.ut.sm41.service;

import com.ut.sm41.dto.*;
import org.springframework.stereotype.Service;
import java.io.IOException;

@Service
public interface ApplicationService {


     String firstService();

     BeeceptorDTO testHttp() throws IOException ;

     BatunDTO batunHttp() throws IOException;
     void batunPostHttp() throws IOException;

     MartinezDTO martinezHttp() throws IOException;
     void martinezPostHttp() throws IOException;

     BadilloDTO badilloHttp() throws IOException;

     VarguezDTO varguezHttp() throws IOException;
     void varguezPostHttp() throws IOException;


     CadenaDTO cadenaHttp() throws IOException;

}


