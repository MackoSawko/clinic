package com.uz.clinic.services;

import com.uz.clinic.domain.Rating;
import com.uz.clinic.domain.repository.RatingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RatingService {

    @Autowired
    RatingRepository ratingRepository;

    public void saveRate(Rating rating) {
        ratingRepository.save(rating);
    }

    public void deleteRate(int id) {
        ratingRepository.deleteById(id);
    }

    public List<Rating> getDoctorRatingById(int id) {

    }
}
