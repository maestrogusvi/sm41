package com.ut.sm41.dto;

public class DiscordDTO {

    String id;
    String username;
    Boolean verified;

    public DiscordDTO() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Boolean getVerified() {
        return verified;
    }

    public void setVerified(Boolean verified) {
        this.verified = verified;
    }

    @Override
    public String toString() {
        return "DiscordDTO{" +
                "id='" + id + '\'' +
                ", username='" + username + '\'' +
                ", verified=" + verified +
                '}';
    }

    public String toJSON() {
        return "{" +
                "\"id\":" + id + "," +
                "\"username\":\"" + username + "\"" +
                "\"verified\":\"" + verified + "\"" +
                '}';
    }
}
