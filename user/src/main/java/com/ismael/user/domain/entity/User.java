package com.ismael.user.domain.entity;

import models.enums.ProfileEnum;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Objects;
import java.util.Set;

@Document
public class User {
    @Id
    private String id;
    private String name;
    private String email;
    private String password;
    private Set<ProfileEnum> profile;

    public User() {
    }

    public User(String id, String name, String email, String password, Set<ProfileEnum> profile) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.password = password;
        this.profile = profile;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Set<ProfileEnum> getProfile() {
        return profile;
    }

    public void setProfile(Set<ProfileEnum> profile) {
        this.profile = profile;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Objects.equals(id, user.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }

    // Método "wither" para id
    public User withId(String id) {
        return new User(id, this.name, this.email, this.password, this.profile);
    }

    // Método "wither" para name
    public User withName(String name) {
        return new User(this.id, name, this.email, this.password, this.profile);
    }

    // Método "wither" para email
    public User withEmail(String email) {
        return new User(this.id, this.name, email, this.password, this.profile);
    }

    // Método "wither" para password
    public User withPassword(String password) {
        return new User(this.id, this.name, this.email, password, this.profile);
    }

    // Método "wither" para profile
    public User withProfile(Set<ProfileEnum> profile) {
        return new User(this.id, this.name, this.email, this.password, profile);
    }



}
