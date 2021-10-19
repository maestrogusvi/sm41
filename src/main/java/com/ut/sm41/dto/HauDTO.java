package com.ut.sm41.dto;

public class HauDTO {
    int id;
    String name;
    String status;

    public HauDTO() {
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

    public String getStatus() { return status; }

    public void setStatus(String status) { this.status = status; }
}
