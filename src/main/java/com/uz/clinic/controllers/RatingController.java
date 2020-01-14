package com.uz.clinic.controllers;

import com.uz.clinic.domain.Rating;
import com.uz.clinic.domain.Specialization;
import com.uz.clinic.services.RatingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/rate")
public class RatingController {

    @Autowired
    RatingService ratingService;

    @GetMapping("/{id}")
    public List<Rating> getDoctorRatingById(@PathVariable int id){
        return ratingService.getDoctorRatingById(id);
    }

    @PostMapping
    public void addRate(@RequestBody Rating rating){
        ratingService.saveRate(rating);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteRate(@PathVariable int id){
        ratingService.deleteRate(id);
    }

}
