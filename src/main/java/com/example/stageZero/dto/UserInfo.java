package com.example.stageZero.dto;

import java.time.Instant;

public class UserInfo {
    private String email;
    private Instant current_datetime;
    private String github_url;

    public UserInfo(String email, String github_url){
        this.email = email;
        this.current_datetime = Instant.now();
        this.github_url= github_url;
    }

    public String getEmail() {return email;}
    public Instant getcurrent_datetime() {return current_datetime;}
    public String getgithub_url() {return github_url;}
}
