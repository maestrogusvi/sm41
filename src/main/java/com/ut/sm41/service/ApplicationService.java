package com.ut.sm41.service;


import com.ut.sm41.dto.BeeceptorDTO;
import org.springframework.stereotype.Service;

import java.io.IOException;

@Service
public interface ApplicationService {

     String firstService();
     BeeceptorDTO testHttp() throws IOException ;
     void testPostHttp(BeeceptorDTO beeceptorDTO) throws IOException;
}
