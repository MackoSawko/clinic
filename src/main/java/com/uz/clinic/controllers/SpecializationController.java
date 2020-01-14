package com.uz.clinic.controllers;

import com.uz.clinic.domain.DoctorSpecialization;
import com.uz.clinic.domain.Specialization;
import com.uz.clinic.services.SpecializationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/specialization")
public class SpecializationController {

    @Autowired
    SpecializationService specializationService;

    @GetMapping
    public List<Specialization> getSpecializations(){
        return specializationService.getAllSpecializations();
    }

    @GetMapping("/{id}")
    public Optional<Specialization> getSpecializationById(@PathVariable int id){
        return specializationService.getSpecializationById(id);
    }

    @PostMapping
    public void addSpecialization(@RequestBody Specialization newSpecialization){
        specializationService.addSpecialization(newSpecialization);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteSpecialization(@PathVariable int id){
        specializationService.deleteSpecializationById(id);
    }

// ---------------------- Doctor Specializations Logic ---------------------------------------

    @PostMapping
    public void addSpecializationToDoctor(@RequestBody DoctorSpecialization doctorSpecialization){
        specializationService.addSpecializationToDoctor(doctorSpecialization);
    }



}
