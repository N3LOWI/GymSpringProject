package com.gymproject.app.rest.workout;

import lombok.Data;

import java.time.DayOfWeek;
import java.time.LocalDate;

@Data
public class Workout {
    private Long id;
    private LocalDate date;
    private DayOfWeek dayOfWeek;
    private WorkoutType workoutType;
//    private List<Exercise> exerciseList = new ArrayList<>();

    public Workout() {
    }

    public Workout(Long id, LocalDate date, DayOfWeek dayOfWeek, WorkoutType workoutType/*, List<Exercise> exerciseList*/) {
        this.id = id;
        this.date = date;
        this.dayOfWeek = dayOfWeek;
        this.workoutType = workoutType;
//        this.exerciseList = exerciseList;
    }

    public Workout(LocalDate date, DayOfWeek dayOfWeek, WorkoutType workoutType/*, List<Exercise> exerciseList*/) {
        this.date = date;
        this.dayOfWeek = dayOfWeek;
        this.workoutType = workoutType;
//        this.exerciseList = exerciseList;
    }
}

enum WorkoutType {
    PUSH,
    PULL,
    LEGS,
    ARMS,
    OTHER

}
