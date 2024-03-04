package com.gymproject.app.rest.workout;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class Exercise {
//    private Long id;
    private String name;
    private List<Set> setList = new ArrayList<>();
}
