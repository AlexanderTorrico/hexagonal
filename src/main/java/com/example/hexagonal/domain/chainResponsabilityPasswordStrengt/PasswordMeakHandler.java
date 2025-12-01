package com.example.hexagonal.domain.chainResponsabilityPasswordStrengt;

import com.example.hexagonal.domain.enums.ConfigurationValuePasswordLevelEnum;

public class PasswordMeakHandler extends Handler{


    @Override
    public void handleRequest(String password, String passwordLevel) {
        System.out.println("in meak");
        if (password.length() < 5){
            System.out.println("Password is weak in chain meak");
            throw new IllegalArgumentException("Password is weak");
        }
        System.out.println("Password is medium in chain meak");
        System.out.println("___ "  + passwordLevel);
        if(passwordLevel == ConfigurationValuePasswordLevelEnum.WEAK_PASSWORD.toString()){
            System.out.println(18);
            return;
        }

        successor.handleRequest(password, passwordLevel);
    }
}
