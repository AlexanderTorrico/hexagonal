package com.example.hexagonal.domain.user;

import com.example.hexagonal.domain.user.valueObject.UserEmailValue;
import com.example.hexagonal.domain.user.valueObject.UserPasswordValue;

public class User {

    private long id;
    private String name;

    private UserEmailValue email;
    private UserPasswordValue password;

    private long pharmacy_id;

    public User() {
    }

    public User(long id, String name, String email, String password, long pharmacy_id) {
        this.id = id;
        this.name = name;
        this.email = new UserEmailValue(email);
        this.password = new UserPasswordValue(password);
        this.pharmacy_id = pharmacy_id;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email.getValue();
    }

    public void setEmail(String email) {
        this.email = new UserEmailValue(email);
    }

    public String getPassword() {
        return password.getValue();
    }

    public void setPassword(String password) {
        this.password = new UserPasswordValue(password);
    }

    public long getPharmacy_id() {
        return pharmacy_id;
    }

    public void setPharmacy_id(long pharmacy_id) {
        this.pharmacy_id = pharmacy_id;
    }
}
