package com.uz.clinic.services;

import com.uz.clinic.domain.Visit;
import com.uz.clinic.domain.repository.VisitRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
}
