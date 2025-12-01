package com.example.hexagonal.domain.chainResponsabilityPasswordStrengt;

import com.example.hexagonal.domain.enums.ConfigurationValuePasswordLevelEnum;

public class PasswordMediunHandler extends Handler{



    @Override
    public void handleRequest(String password, String passwordLevel) {

        System.out.println(password);
        System.out.println(password.matches(".*[A-Z].*") + " <<");
        if (!password.matches(".*[A-Z].*")){
            System.out.println("Dentro del error rarro");
            throw new IllegalArgumentException("La contraseña debe tener al menos una letra mayúscula");
        }
        System.out.println("Password is medium in chain medium");
        if(passwordLevel == ConfigurationValuePasswordLevelEnum.MEDIUM_PASSWORD.toString()){
            return;
        }
        System.out.println("final");
        if(successor != null){
            successor.handleRequest(password, passwordLevel);
        }

    }
}
