package com.lge.lcms.payload;

import java.time.Instant;

public class UserProfile {
    private Instant createdAt;
    private String email;
    private Long id;
    private String name;
    private Instant updatedAt;
    private String username;

    public UserProfile(Instant createdAt, String email, Long id, String name, Instant updatedAt, String username) {
        this.createdAt = createdAt;
        this.email = email;
        this.id = id;
        this.name = name;
        this.updatedAt = updatedAt;
        this.username = username;
    }

    public Instant getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Instant createdAt) {
        this.createdAt = createdAt;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Instant getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Instant updatedAt) {
        this.updatedAt = updatedAt;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}