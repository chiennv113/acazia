package com.example.acazia.feed.model;

public class ModelTestNotification {
    private String avatar;
    private String name;
    private String action;
    private String content;

    public ModelTestNotification(String avatar, String name, String action, String content) {
        this.avatar = avatar;
        this.name = name;
        this.action = action;
        this.content = content;
    }

    public String getAvatar() {
        return avatar;
    }

    public String getName() {
        return name;
    }

    public String getAction() {
        return action;
    }

    public String getContent() {
        return content;
    }
}
