package com.ut.sm41.dto;

public class EstradaDTO {

    int id;
    String name;
    String status;

    public EstradaDTO() {}

    public int getId() { return id; }

    public void setId(int id) { this.id = id; }

    public String getName() { return name; }

    public void setName(String name) { this.name = name; }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}