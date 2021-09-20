package com.fattati.gym.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fattati.gym.enums.workouts.BackAndBiceps;
import com.fattati.gym.enums.workouts.*;
import lombok.Data;

import java.util.Date;
import java.util.List;
import java.util.Set;

@Data
public class WorkoutModel {

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
    private Date date;
    private String memberId;
    private String trainerId;
    private String workoutId;
    private Set<ChestAndTriceps> chestAndTriceps;
    private Set<BackAndBiceps> backAndBiceps;
    private Set<LegsAndAbs> legsAndAbs;
    private Set<BackAndShoulders> backAndShoulders;
}
