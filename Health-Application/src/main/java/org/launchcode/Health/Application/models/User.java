package org.launchcode.Health.Application.models;

import org.launchcode.Health.Application.models.data.AbstractEntity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import javax.persistence.Entity;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Entity
public class User extends AbstractEntity {

    private static final BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();

    @NotNull
    private String username;

    @NotNull
    private String email;

    @NotNull
    private String passHash;

    public User() {
    }

    public User(String username, String password, String email) {
        this.username = username;
        this.passHash = encoder.encode(password);
        this.email = email;
    }

    public boolean isMatchingPassword(String password) {
        return encoder.matches(password, passHash);
    }

    public String getUsername() {
        return username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
