package com.ut.sm41.service;

import com.ut.sm41.dto.*;
import org.springframework.stereotype.Service;

import java.io.IOException;

@Service
public interface ApplicationService {



     String firstService();

     BeeceptorDTO testHttp() throws IOException;

     EstradaDTO estradaHttp() throws IOException ;
     EstradaDTO estradaPostHttp(EstradaDTO estradaDTO) throws IOException;
     void testObject(EstradaDTO estradaDTO);

     BooksDTO booksHttp() throws IOException;

     RamirezDTO ramirezHttp() throws IOException ;
     RamirezDTO ramirezPostHttp(RamirezDTO ramirezDTO) throws IOException;
     void testMyFirstObject(RamirezDTO ramirezDTO);

     HauDTO hauHttp() throws IOException ;
     HauDTO hauPostHttp(HauDTO hauDTO) throws IOException;



}
