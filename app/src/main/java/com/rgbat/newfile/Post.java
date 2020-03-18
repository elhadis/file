package com.rgbat.newfile;

import java.io.Serializable;

public class Post implements Serializable {
    private String dat;
    private String name;
    private  String body;
    private int following;
    private  int followers;
    private int post;

    public Post(String dat, String name, String body, int following, int followers, int post) {
        this.dat = dat;
        this.name = name;
        this.body = body;
        this.following = following;
        this.followers = followers;
        this.post = post;
    }

    public String getDat() {
        return dat;
    }

    public void setDat(String dat) {
        this.dat = dat;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public int getFollowing() {
        return following;
    }

    public void setFollowing(int following) {
        this.following = following;
    }

    public int getFollowers() {
        return followers;
    }

    public void setFollowers(int followers) {
        this.followers = followers;
    }

    public int getPost() {
        return post;
    }

    public void setPost(int post) {
        this.post = post;
    }
}
