package com.ut.sm41.dto;

public class CaamalDTO {

    int id;
    String name;
    String status;

    public CaamalDTO() {
    }

    public int getId(int i) {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName(String from_post) {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStatus(String s) {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", status='" + status + '\'' +
                '}';
    }

    public String toJson() {
        return "{" +
                "\"id\":\"" + status + "\"," +
                "\"name\":\"" + name + "\"," +
                "\"status\":\"" + status + "\"" +
                '}';
    }
}