package com.ut.sm41.dto;

public class MercadoDTO {

    String query;
    String total;
    String primary_results;

    public MercadoDTO() {
    }

    public String getQuery() {
        return query;
    }

    public void setQuery(String query) {
        this.query = query;
    }

    public String getTotal() {
        return total;
    }

    public void setTotal(String total) {
        this.total = total;
    }

    public String getPrimary_results() {
        return primary_results;
    }

    public void setPrimary_results(String primary_results) {
        this.primary_results = primary_results;
    }

    @Override
    public String toString() {
        return "{" +
                "query='" + query + '\'' +
                ", total='" + total + '\'' +
                ", primary_results='" + primary_results + '\'' +
                '}';
    }

    public String toJson() {
        return "{" +
                "\"query\":\"" + query + "\"," +
                "\"total\":\"" + total + "\"," +
                "\"primary_results\":\"" + primary_results + "\"" +
                '}';
    }
}
