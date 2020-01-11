package com.uz.clinic.controllers;

import com.uz.clinic.domain.Visit;
import com.uz.clinic.services.VisitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/visit")
public class VisitController {

    @Autowired
    VisitService visitService;

    @PostMapping
    public void addVisit(@RequestBody Visit visit){
        visitService.addVisit(visit);
    }

    @GetMapping
    public List<Visit> getAllVisits(){
        return visitService.getAllVisits();
    }



}
