package com.ut.sm41.dto;

public class TwichDTO {

    String broadcaster_login;
    String broadcaster_language;
    String game_name;

    public TwichDTO() {
    }

    public String getBroadcaster_login() {
        return broadcaster_login;
    }

    public void setBroadcaster_login(String broadcaster_login) {
        this.broadcaster_login = broadcaster_login;
    }

    public String getBroadcaster_language() {
        return broadcaster_language;
    }

    public void setBroadcaster_language(String broadcaster_language) {
        this.broadcaster_language = broadcaster_language;
    }

    public String getGame_name() {
        return game_name;
    }

    public void setGame_name(String game_name) {
        this.game_name = game_name;
    }

    @Override
    public String toString() {
        return "{" +
                "broadcaster_login='" + broadcaster_login + '\'' +
                ", broadcaster_language='" + broadcaster_language + '\'' +
                ", game_name='" + game_name + '\'' +
                '}';
    }

    public String toJson() {
        return "{" +
                "\"broadcaster_login\":\"" + broadcaster_login + "\"," +
                "\"broadcaster_language\":\"" + broadcaster_language + "\"," +
                "\"game_name\":\"" + game_name + "\"" +
                '}';
    }
}
