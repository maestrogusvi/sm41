package com.ut.sm41.service;

import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.ut.sm41.dto.BeeceptorDTO;
import com.ut.sm41.dto.MontejoDTO;
import com.ut.sm41.dto.MartinezDTO;
import com.ut.sm41.exception.BusinessException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import com.ut.sm41.dto.RomanoDTO;
import com.ut.sm41.dto.VazquezDTO;
import java.io.IOException;

@Service
public interface ApplicationService {


    String firstService();
    BeeceptorDTO testHttp() throws IOException;
    VazquezDTO vazquezHttp() throws IOException;
    RomanoDTO romanoHttp() throws IOException;
    MontejoDTO montejoHttp() throws IOException;
    MartinezDTO martinezHttp() throws IOException;
    void vazquezPostHttp() throws IOException;

}
