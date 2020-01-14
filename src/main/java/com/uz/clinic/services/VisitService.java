package com.uz.clinic.services;


import com.uz.clinic.domain.Visit;
import com.uz.clinic.domain.VisitDto;

import com.uz.clinic.domain.repository.VisitRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


@Service
public class VisitService {

    @Autowired
    VisitRepository visitRepository;

    public List<Visit> getAllVisits() {
        return (List<Visit>) visitRepository.findAll();
    }

    public void addVisit(Visit visit) {
        visitRepository.save(visit);
    }

    public List<Visit> getUserVisit(int id) {
        List<Visit> visits = visitRepository.findByUzytkownikId(id);
        return visits;
    }

    public void deleteVisit(int id) {
        visitRepository.deleteById(id);
    }
}
