package com.uz.clinic.domain;

import javax.persistence.*;

@Entity(name = "Doctor_specialization")
public class DoctorSpecialization {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int doctor_specialization_id;

    @OneToOne
    private User user_id;

    @OneToOne
    private Specialization specialization_id;

    public DoctorSpecialization() {
    }

    public int getDoctor_specialization_id() {
        return doctor_specialization_id;
    }

    public void setDoctor_specialization_id(int doctor_specialization_id) {
        this.doctor_specialization_id = doctor_specialization_id;
    }

    public User getUser_id() {
        return user_id;
    }

    public void setUser_id(User user_id) {
        this.user_id = user_id;
    }

    public Specialization getSpecialization_id() {
        return specialization_id;
    }

    public void setSpecialization_id(Specialization specialization_id) {
        this.specialization_id = specialization_id;
    }
}
