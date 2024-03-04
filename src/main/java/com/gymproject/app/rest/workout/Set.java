package com.gymproject.app.rest.workout;

import lombok.Data;

@Data
public class Set {
    private Long id;
    private int position;
    private int totalReps;
    private boolean failure;
}
