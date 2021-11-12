package com.ut.sm41.dto;

public class CloudflareDTO {

    String id;
    String email;
    String username;

    public CloudflareDTO() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Override
    public String toString() {
        return "{" +
                "id='" + id + '\'' +
                ", email='" + email + '\'' +
                ", username='" + username + '\'' +
                '}';
    }

    public String toJson() {
        return "{" +
                "\"id\":\"" + id + "\"," +
                "\"email\":\"" + email + "\"," +
                "\"username\":\"" + username + "\"" +
                '}';
    }
}
