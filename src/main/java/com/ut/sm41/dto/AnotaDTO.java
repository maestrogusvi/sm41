package com.ut.sm41.dto;

import org.yaml.snakeyaml.events.Event;

public class AnotaDTO {

    public String getMessage;
    int id;
    String name;
    String status;

    public AnotaDTO() {
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
                "\"id\":" + id + "," +
                "\"name\":\"" + name + "\"," +
                "\"status\":\"" + status + "\"" +
                '}';
    }
    
}
