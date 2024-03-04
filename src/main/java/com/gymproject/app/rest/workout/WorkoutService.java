package com.gymproject.app.rest.workout;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Service
public class WorkoutService {

    public List<Workout> getWorkouts() {
        return List.of(
                new Workout(1L, LocalDate.of(2024, Month.MARCH, 4), DayOfWeek.MONDAY, WorkoutType.ARMS)
        );
    }
}
