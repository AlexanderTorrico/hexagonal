package com.example.hexagonal.domain.chainResponsabilityPasswordStrengt;

public abstract class Handler {

    protected Handler successor;
    protected String passwordLevel;
    protected String password;


    public void setSuccessor(Handler successor) {
        this.successor = successor;
        this.password = password;
        this.passwordLevel = passwordLevel;
    }

    public abstract void handleRequest(String password, String passwordLevel);
}
