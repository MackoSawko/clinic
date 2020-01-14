package com.uz.clinic.services;

import com.uz.clinic.domain.DoctorSpecialization;
import com.uz.clinic.domain.Specialization;
import com.uz.clinic.domain.repository.DoctorSpecializationRepository;
import com.uz.clinic.domain.repository.SpecializationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SpecializationService {

    @Autowired
    SpecializationRepository specializationRepository;

    @Autowired
    DoctorSpecializationRepository doctorSpecializationRepository;


    public List<Specialization> getAllSpecializations() {
        return (List<Specialization>) specializationRepository.findAll();
    }

    public void addSpecialization(Specialization newSpecialization) {
        specializationRepository.save(newSpecialization);
    }

    public void deleteSpecializationById(int id) {
        specializationRepository.deleteById(id);
    }

    public Optional<Specialization> getSpecializationById(int id) {
        return specializationRepository.findById(id);
    }

    public void addSpecializationToDoctor(DoctorSpecialization doctorSpecialization) {
        doctorSpecializationRepository.save(doctorSpecialization);
    }
}
