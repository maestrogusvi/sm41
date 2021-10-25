package com.ut.sm41.dto;

public class BadilloDTO {

    int id;
    String name;
    String Status;

    public BadilloDTO() {
    }

    public int getId() {
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

    public String getStatus() {
        return Status;
    }

    public void setStatus(String status) {
        Status = status;
    }

    @Override
    public String toString() {
        return "{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", status='" + Status + '\'' +
                '}';
    }

    public  String toJson() {
        return "{" +
                "id=" + id +
                "\" name=\":\"" + name + "\"" +
                "\" status=\":\"" + Status + "\"" +
                '}';
    }
}
