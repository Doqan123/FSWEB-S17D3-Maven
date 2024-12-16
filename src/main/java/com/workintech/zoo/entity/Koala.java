package com.workintech.zoo.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Koala {
    //id, name, weight, sleepHour, gender
    private int id;
    private String name;
    private Double weight;
    private String gender;
    private Double sleepHour;

}
