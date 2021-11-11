package com.ut.sm41.dto;

public class MercadolibreDTO {
    String id;
    String first_name;
    String country_id;

    public MercadolibreDTO() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getCountry_id() {
        return country_id;
    }

    public void setCountry_id(String country_id) {
        this.country_id = country_id;
    }

    @Override
    public String toString() {
        return "{" +
                "id=" + id +
                ", first_name='" + first_name + '\'' +
                ", country_id='" + country_id + '\'' +
                '}';
    }

    public  String toJson() {
        return "{" +
                "\"id\":\"" + id + "\"," +
                " \"first_name=\":\"" + first_name + "\"," +
                " \" country_id=\":\"" + country_id + "\"" +
                '}';
    }
}
