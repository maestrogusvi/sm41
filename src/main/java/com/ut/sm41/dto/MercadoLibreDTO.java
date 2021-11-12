package com.ut.sm41.dto;

public class MercadoLibreDTO {
    int total;
    int primary_results;
    String query;
    public MercadoLibreDTO(){

    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public int getPrimary_results() {
        return primary_results;
    }

    public void setPrimary_results(int primary_results) {
        this.primary_results = primary_results;
    }

    public String getQuery() {
        return query;
    }

    public void setQuery(String query) {
        this.query = query;
    }
    @Override
    public String toString() {
        return "{" +
                "total=" + total + '\''+
                ", primary_results='" + primary_results + '\'' +
                ", query='" + query + '\'' +
                '}';
    }

    public String deJson() {
        return "{" +
                "\"total\":\"" + total +
                "\","+"\"primary_results\":\"" + primary_results +
                "\","+ "\"query\":\"" + query + "\"" +
                '}';
    }
}

