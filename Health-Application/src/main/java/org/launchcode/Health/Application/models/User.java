package org.launchcode.Health.Application.models;

import org.launchcode.Health.Application.models.data.AbstractEntity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import javax.persistence.Entity;
import javax.validation.constraints.NotNull;

@Entity
public class User extends AbstractEntity {

    private static final BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();

    @NotNull
    private String username;

    @NotNull
    private String passHash;
    public User() {
    }

    public User(String username, String password) {
        this.username = username;
        this.passHash = encoder.encode(password);
    }

    public boolean isMatchingPassword(String password) {
        return encoder.matches(password, passHash);
    }
}
