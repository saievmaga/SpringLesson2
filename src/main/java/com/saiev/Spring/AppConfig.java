package com.saiev.Spring;


import com.saiev.Spring.doctors.Dentist;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean(name = "dentist")
    public IDoctor dentist() {
        return new Dentist();
    }

    @Bean(name = "polyclinicRoom")
    public PolyclinicRoom polyclinicRoom(IDoctor dentist){
        PolyclinicRoom polyclinicRoom = new PolyclinicRoom(12);
        polyclinicRoom.setDoctor(dentist);
        return polyclinicRoom;
    }

    @Bean(name = "polyclinicRegister")
    public PolyclinicRegister polyclinicRegister(PolyclinicRoom polyclinicRoom){
        PolyclinicRegister polyclinicRegister = new PolyclinicRegister();
        polyclinicRegister.setDentistRoom(polyclinicRoom);

        return polyclinicRegister;
    }
}
