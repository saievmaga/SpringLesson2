package com.saiev.Spring;


public class PolyclinicRegister {

    private PolyclinicRoom dentistRoom;

    public void setDentistRoom(PolyclinicRoom dentistRoom) {
        this.dentistRoom = dentistRoom;
    }

    public PolyclinicRoom dentistReferral() {
        return dentistRoom;
    }

}
