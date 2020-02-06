package com.example.acazia.feed.model;

public class ModelTestFollowing {
    private String avatar;
    private String name;
    private String email;

    public ModelTestFollowing(String avatar, String name, String email) {
        this.avatar = avatar;
        this.name = name;
        this.email = email;
    }

    public String getAvatar() {
        return avatar;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }
}
