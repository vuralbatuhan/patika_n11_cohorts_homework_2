package com.example.cohort2.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;



@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Order {

    public Customer customer;
    public List<Product> products;

    @Override
    public String toString() {
        return "Order{" +
                "customer=" + customer +
                ", products=" + products +
                '}';
    }
}