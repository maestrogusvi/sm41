package com.ut.sm41.dto;

public class BatunDTO {

    int id;
    String name;
    String status;

    public BatunDTO() {

    }

    public int getId(){
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setStatus(String status) {
        this.status = status;}

    public String getStatus(){
        return status;
    }

    @Override
    public String toString() {
        return "{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", status='" + status + '\'' +
                '}';
    }

    public  String toJson() {
        return "{" +
                "id=" + id +
                "\" name=\":\"" + name + "\"" +
                "\" status=\":\"" + status + "\"" +
                '}';
    }

}






