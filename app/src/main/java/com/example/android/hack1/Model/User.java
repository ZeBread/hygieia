package com.example.android.hack1.Model;

public class User {

    private String id;
    private String username;
    private String imageUrl;

    public User(String id, String username,String imageUrl){
        this.id=id;
        this.imageUrl=imageUrl;
        this.username=username;
    }

    public User() {

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

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }
}
