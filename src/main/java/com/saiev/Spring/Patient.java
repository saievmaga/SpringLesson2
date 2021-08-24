package com.saiev.Spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Patient {
    public static void main(String[] args) {

        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        PolyclinicRegister register = context.getBean("polyclinicRegister",PolyclinicRegister.class);
        PolyclinicRoom referral = register.dentistReferral();
        referral.getDoctor().doHealing();
    }
}
