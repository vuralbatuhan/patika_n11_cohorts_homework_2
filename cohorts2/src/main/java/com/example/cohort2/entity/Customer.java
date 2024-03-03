package com.example.cohort2.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.util.List;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Customer {

    private String name;
    private String surname;
    private String gender;
    private int age;
    private List<Order> orders;
    private LocalDate createdAt;

    @Override
    public String toString() {
        return "Customer{" +
                "name=" + name +
                ", surname=" + surname +
                ", gender=" + gender +
                ", age=" + age +
                ", createdAt=" + createdAt +
                '}';
    }
}