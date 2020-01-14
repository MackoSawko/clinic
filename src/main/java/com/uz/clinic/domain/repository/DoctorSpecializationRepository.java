package com.uz.clinic.domain.repository;

import com.uz.clinic.domain.DoctorSpecialization;
import org.springframework.data.repository.CrudRepository;

public interface DoctorSpecializationRepository extends CrudRepository<DoctorSpecialization, Integer> {
    DoctorSpecialization findByUser_idAndAndSpecialization_id(int user_id, int specialization_id);
}
