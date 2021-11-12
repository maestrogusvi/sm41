package com.ut.sm41.dto;

public class MercadolibreDTO {
    int id;
    String nickname;
    String country_id;
    String email;


    public MercadolibreDTO() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getCountry_id() {
        return country_id;
    }

    public void setCountry_id(String country_id) {
        this.country_id = country_id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return
                "{" +
                        ", id=" + id + '\'' +
                        ", nickname=" + nickname + '\'' +
                        ", country_id=" + country_id + '\'' +
                        ", email=" + email + '\'' +
                        "}" ;

    }

    public String toJson() {

        return
                "{" +
                        "\"id\":" + id + "\"," +
                        "\"nickname\":" + nickname + "\"," +
                        "\"country_id\":" + country_id + "\"," +
                        "\"email\":" + email + "\"," +
                        "}" ;

    }
}
