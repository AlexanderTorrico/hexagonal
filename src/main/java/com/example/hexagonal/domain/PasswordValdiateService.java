package com.example.hexagonal.domain;

import com.example.hexagonal.domain.chainResponsabilityPasswordStrengt.Handler;
import com.example.hexagonal.domain.chainResponsabilityPasswordStrengt.PasswordMeakHandler;
import com.example.hexagonal.domain.chainResponsabilityPasswordStrengt.PasswordMediunHandler;

public class PasswordValdiateService {
    private Handler handler;

    public PasswordValdiateService(String password, String passwordLevel) {
        PasswordMeakHandler passwordMeakHandler = new PasswordMeakHandler();
        PasswordMediunHandler passwordMediunHandler = new PasswordMediunHandler();

        passwordMeakHandler.setSuccessor(passwordMediunHandler);


            passwordMeakHandler.handleRequest(password, passwordLevel);

    }
}
