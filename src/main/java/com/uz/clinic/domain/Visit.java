package com.uz.clinic.domain;

import javax.persistence.*;
import java.sql.Date;

@Entity
public class Visit {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int visit_id;
    private Date date;

    int doctor_id;

    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    User user;


    public Visit() {
    }

    public int getVisit_id() {
        return visit_id;
    }

    public void setVisit_id(int visit_id) {
        this.visit_id = visit_id;
    }


    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public void setDoctor_id(int doctor_id) {
        this.doctor_id = doctor_id;
    }

    public int getDoctor_id() {
        return doctor_id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
