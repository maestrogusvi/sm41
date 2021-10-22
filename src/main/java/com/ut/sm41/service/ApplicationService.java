package com.ut.sm41.service;

import com.ut.sm41.dto.BeeceptorDTO;
import com.ut.sm41.dto.HauDTO;
import org.springframework.stereotype.Service;

import java.io.IOException;

@Service
public interface ApplicationService {



     String firstService();

     BeeceptorDTO testHttp() throws IOException;

     HauDTO hauHttp() throws IOException ;

     void testPostHttp() throws IOException;
}
