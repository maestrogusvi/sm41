package com.ut.sm41.dto;

public class AnotaDTO {

    int id;
    String name;
    String status;

    public AnotaDTO() {
    }

    public int getId() {
        return id;
    }

    public static void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public static void setName(String name) {
        this.name = name;
    }

    public String getStatus() {
        return status;
    }

    public static void setStatus(String status) {
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
    public static String toJson() {
        return "{" +
                "\"id\":\"" + id + "\"," +
                "\"name\":\"" + name + "\"," +
                "\"status\":\"" + status + "\"" +
                '}';
    }
}
