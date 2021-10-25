package com.ut.sm41.service;

import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.ut.sm41.dto.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.io.IOException;

@Service
public interface ApplicationService {


     String firstService();

     BeeceptorDTO testHttp() throws IOException ;

     BatunDTO batunHttp() throws IOException;
     void batunPosthttp() throws IOException;



     MartinezDTO martinezHttp() throws IOException;

     BadilloDTO badilloHttp() throws IOException;

     VarguezDTO varguezHttp() throws IOException;

     CadenaDTO cadenaHttp() throws IOException;
}


