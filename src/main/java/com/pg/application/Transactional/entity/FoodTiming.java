package com.pg.application.Transactional.entity;

import java.time.LocalTime;

import jakarta.persistence.Embeddable;

@Embeddable
public class FoodTiming {

    private LocalTime breakfastTime;
    private LocalTime lunchTime;
    private LocalTime dinnerTime;

    // Getters and Setters
    public LocalTime getBreakfastTime() {
        return breakfastTime;
    }

    public void setBreakfastTime(LocalTime breakfastTime) {
        this.breakfastTime = breakfastTime;
    }

    public LocalTime getLunchTime() {
        return lunchTime;
    }

    public void setLunchTime(LocalTime lunchTime) {
        this.lunchTime = lunchTime;
    }

    public LocalTime getDinnerTime() {
        return dinnerTime;
    }

    public void setDinnerTime(LocalTime dinnerTime) {
        this.dinnerTime = dinnerTime;
    }
}
