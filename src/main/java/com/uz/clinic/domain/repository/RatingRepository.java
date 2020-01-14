package com.uz.clinic.domain.repository;

import com.uz.clinic.domain.Rating;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface RatingRepository extends CrudRepository<Rating, Integer> {
}
