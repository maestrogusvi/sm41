package com.ut.sm41.service.impl;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.ut.sm41.dto.*;
import com.ut.sm41.exception.BusinessException;
import com.ut.sm41.model.UserModel;
import com.ut.sm41.repository.UserRepository;
import com.ut.sm41.service.ApplicationService;
import com.ut.sm41.service.HttpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import java.io.IOException;

@Service
public class ApplicationServiceImpl implements ApplicationService {

    @Autowired
    HttpService httpService;

    @Autowired
    UserRepository userRepository;

    @Override
    public String firstService(){
        return "service";
    }

    @Override
    public BeeceptorDTO testHttp() throws IOException {
        JsonParser parser = new JsonParser();
        JsonObject json = (JsonObject) parser.parse(httpService.sendRequestHttpS("https://utsm41.free.beeceptor.com","GET",null,null,"json",null, null,null));
        if(json.get("code")== null){
            throw new BusinessException("Code doesn´t exist", HttpStatus.FORBIDDEN);
        }
        BeeceptorDTO beeceptorDTO = new BeeceptorDTO();
        beeceptorDTO.setCode(json.get("code").getAsString());
        beeceptorDTO.setMessage(json.get("message").getAsString());
        beeceptorDTO.setStatus(json.get("status").getAsString());
        return beeceptorDTO;
    }

    @Override
    public AnotaDTO anotaHttp() throws IOException {
        JsonParser parser = new JsonParser();
        JsonObject json = (JsonObject) parser.parse(httpService.sendRequestHttpS("https://sm41dinamita.free.beeceptor.com","GET",null,null,"json",null, null, null));
        AnotaDTO anotaDTO = new AnotaDTO();
        anotaDTO.setName(json.get("name").getAsString());
        anotaDTO.setId(json.get("id").getAsInt());
        anotaDTO.setStatus(json.get("status").getAsString());
        return anotaDTO;
    }

    @Override
    public MercadoDTO mercadoHttp() throws IOException {
        JsonParser parser = new JsonParser();
        JsonObject json = (JsonObject) parser.parse(httpService.sendRequestHttpS("https://api.mercadolibre.com/sites/MCO/search?q=samsungA30s","GET",null,null,"json",null, null,null));
        JsonObject object = (JsonObject) json.get("paging");
        MercadoDTO mercadoDTO = new MercadoDTO();
        mercadoDTO.setQuery(json.get("query").getAsString());
        mercadoDTO.setTotal(object.get("total").getAsString());
        mercadoDTO.setPrimary_results(object.get("primary_results").getAsString());
        return mercadoDTO;
    }

    @Override
    public AnotaDTO anotaPostHttp(AnotaDTO anotaDTO) throws IOException {
        JsonParser parser = new JsonParser();
        JsonObject json = (JsonObject) parser.parse(httpService.sendRequestHttpS("https://sm41dinamita.free.beeceptor.com/api/v1/anotaPost","POST",null,null,"json",anotaDTO.toJson(), null,null));
        return anotaDTO;
    }

    @Override
    public void anotaPost(AnotaDTO anotaDTO) {
        UserModel userModel = new UserModel();
        userModel.setName(anotaDTO.getName());
        userRepository.save(userModel);
    }

    @Override
    public VillagranDTO villagranHttp() throws IOException {
        JsonParser parser = new JsonParser();
        JsonObject json = (JsonObject) parser.parse(httpService.sendRequestHttpS("https://dinamita-sm41.free.beeceptor.com","GET",null,null,"json",null, null,null));
        VillagranDTO villagranDTO = new VillagranDTO();
        villagranDTO.setName(json.get("name").getAsString());
        villagranDTO.setId(json.get("id").getAsInt());
        villagranDTO.setStatus(json.get("status").getAsString());
        return villagranDTO;
    }
    @Override
    public void villagranPostHttp(VillagranDTO villagranDTO) throws IOException{
        JsonParser parser = new JsonParser();
        JsonObject json = (JsonObject) parser.parse(httpService.sendRequestHttpS("https://dinamita-sm41.free.beeceptor.com/api/v1/villagranPostHttp","POST",null,null,"json", villagranDTO.toJson(),null,null));
        UserModel userModel = new UserModel();
        userModel.setName(villagranDTO.getName());
        userRepository.save(userModel);

    }

    @Override
    public SilvaDTO silvaHttp() throws IOException {
        JsonParser parser = new JsonParser();
        JsonObject json = (JsonObject) parser.parse(httpService.sendRequestHttpS("https://sm41-dinamita.free.beeceptor.com","GET",null,null,"json",null, null, null));
        SilvaDTO silvaDTO = new SilvaDTO();
        silvaDTO.setName(json.get("name").getAsString());
        silvaDTO.setId(json.get("id").getAsInt());
        silvaDTO.setStatus(json.get("status").getAsString());
        return silvaDTO;
    }

    @Override
    public TwichDTO twichHttp() throws IOException {
        JsonParser parser = new JsonParser();
        JsonObject json = (JsonObject) parser.parse(httpService.sendRequestHttpS("https://api.twitch.tv/helix/channels?broadcaster_id=1000","GET",null,null,"json",null, "Bearer u4zdum0k4jo7x9d2ewnqnsxuyhoqak","o9u6pyyuvkv4b80rx9c67yxae9noqt"));
        JsonArray jsonArray = json.get("data").getAsJsonArray();
        JsonObject object = (JsonObject) jsonArray.get(0);
        TwichDTO twichDTO = new TwichDTO();
        twichDTO.setBroadcaster_login(object.get("broadcaster_login").getAsString());
        twichDTO.setBroadcaster_language(object.get("broadcaster_language").getAsString());
        twichDTO.setGame_name(object.get("game_name").getAsString());
        return twichDTO;
    }

    @Override
    public CloudflareDTO cloudflareHttp() throws IOException {
        JsonParser parser = new JsonParser();
        JsonObject json = (JsonObject) parser.parse(httpService.sendRequestHttpS("https://api.cloudflare.com/client/v4/user","GET",null,null,"json",null, "Bearer 3tyd-uFF_wqnFD2IKVH7x9qQXtY8YpfBelH89B33",null));
        JsonObject object = (JsonObject) json.get("result");
        CloudflareDTO cloudflareDTO = new CloudflareDTO();
        cloudflareDTO.setId(object.get("id").getAsString());
        cloudflareDTO.setEmail(object.get("email").getAsString());
        cloudflareDTO.setUsername(object.get("username").getAsString());
        return cloudflareDTO;
    }

    @Override
    public void silvaPostHttp(SilvaDTO silvaDTO) throws IOException {
        JsonParser parser = new JsonParser();
        JsonObject json = (JsonObject) parser.parse(httpService.sendRequestHttpS("https://sm41-dinamita1.free.beeceptor.com/api/v1/silvaPostHttp","POST",null,null,"json",silvaDTO.toJson(), null,null));
        UserModel userModel = new UserModel();
        userModel.setName(silvaDTO.getName());
        userRepository.save(userModel);
    }

    @Override
    public CaamalDTO caamalHttp() throws IOException {
        JsonParser parser = new JsonParser();
        JsonObject json = (JsonObject) parser.parse(httpService.sendRequestHttpS("https://sm41dinamita-team.free.beeceptor.com", "GET", null, null, "json", null, null,null));
        CaamalDTO caamalDTO = new CaamalDTO();
        caamalDTO.setName(json.get("name").getAsString());
        caamalDTO.setId(json.get("id").getAsInt());
        caamalDTO.setStatus(json.get("status").getAsString());
        return caamalDTO;
    }


    @Override
    public CaamalDTO caamalPostHttp(CaamalDTO caamalDTO) throws IOException {
        JsonParser parser = new JsonParser();
        JsonObject json = (JsonObject) parser.parse(httpService.sendRequestHttpS("https://sm41dinamita-team.free.beeceptor.com/api/v1/caamalPost", "POST", null, null, "json", caamalDTO.toJson(), null,null));
        return caamalDTO;
    }

    @Override
    public void caamalPost(CaamalDTO caamalDTO) {
        UserModel userModel = new UserModel();
        userModel.setName(caamalDTO.getName());
        userRepository.save(userModel);
    }

    @Override
    public FacebookDTO facebookHttp() throws IOException {
        JsonParser parser = new JsonParser();
        JsonObject json = (JsonObject) parser.parse(httpService.sendRequestHttpS("https://graph.facebook.com/me?access_token=EAAEeJ6iN6gYBAAZAb17gGnZBQCd5om785DmZBjeTpkoHEeZAD8pdqpau3hixd5SjHf5Lhak8U60QZApBXian2rusBPqVGfiyVYQvB4BkHvnX9p6D064iQBhqOcobGIhRDidXPujSl25KrQWtjuWwBNSrcj4zV9OU04KxPw2c1ZAvywvRfWrFuTZAsmh3RZBWoMlTrnKMdmh8EYtLvdRsE7sKkcI4TwNH9fPbyqRMV9196gZDZD&fields=id,name,likes,gender,birthday", "GET", null, null, "json", null, null,null));
        FacebookDTO facebookDTO = new FacebookDTO();
        facebookDTO.setId(json.get("id").getAsString());
        facebookDTO.setName(json.get("name").getAsString());
        return facebookDTO;
    }

}
