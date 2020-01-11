package com.uz.clinic.domain;

import javax.persistence.*;

@Entity
public class Rating {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int rating_id;

    private String description;
    private int rate;

    @OneToOne
    private Visit visit_id;

    public Rating() {
    }

    public int getRating_id() {
        return rating_id;
    }

    public void setRating_id(int rating_id) {
        this.rating_id = rating_id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getRate() {
        return rate;
    }

    public void setRate(int rate) {
        this.rate = rate;
    }

    public Visit getVisit_id() {
        return visit_id;
    }

    public void setVisit_id(Visit visit_id) {
        this.visit_id = visit_id;
    }
}
