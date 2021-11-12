package com.ut.sm41.dto;

public class TwitchDTO {


    String client_id;
    String scopes;
    int expires_in;

    public TwitchDTO() {

    }

    public String getClient_id() {
        return client_id;
    }

    public void setClient_id(String client_id) {
        this.client_id = client_id;
    }

    public String getScopes() {
        return scopes;
    }

    public void setScopes(String scopes) {
        this.scopes = scopes;
    }

    public int getExpires_in() {
        return expires_in;
    }

    public void setExpires_in(int expires_in) {
        this.expires_in = expires_in;
    }

    @Override
    public String toString() {
        return
         "{" +
         ", client_id=" + client_id + '\'' +
          ", scopes=" + scopes + '\'' +
          ", expires_in=" + expires_in + '\'' +
          "}" ;

    }

    public String toJson() {

        return
        "{" +
        "\"client_id\":" + client_id + "\"," +
        "\"scopes\":" + scopes + "\"," +
        "\"expires_in\":" + expires_in + "\"," +
        "}" ;

        }

    }

