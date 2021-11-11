package com.ut.sm41.dto;

public class PlayDTO {

    String name;
    String id;
    String token;

    public PlayDTO() {}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    @Override
    public String toString() {
        return "{" +
                "name='" + name + '\'' +
                ", id='" + id + '\'' +
                '}';
    }

    public String toJson() {
        return "{" +
                "\"name\":\"" + name + "\"," +
                "\"id\":\"" + id + "\"" +
                '}';
    }

}
