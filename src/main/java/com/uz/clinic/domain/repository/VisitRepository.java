package com.uz.clinic.domain.repository;

import com.uz.clinic.domain.Visit;
import com.uz.clinic.domain.VisitDto;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface VisitRepository extends CrudRepository<Visit, Integer> {
    public List<Visit> findByUzytkownikId(int uzytkownikId);

}
