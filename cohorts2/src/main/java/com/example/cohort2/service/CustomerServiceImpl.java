package com.example.cohort2.service;

import com.example.cohort2.entity.Customer;
import com.example.cohort2.utils.LoadInitData;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class CustomerServiceImpl implements CustomerService {

    private final List<Customer> customerList = LoadInitData.getCustomerList();

    @Override
    public void findAll() {
        customerList.forEach(System.out::println);
    }

    @Override
    public void save(Scanner scanner) {

        System.out.println("Please enter your name: ");
        String name = scanner.next();
        System.out.println("Please enter your surname: ");
        String surname = scanner.next();
        System.out.println("Please enter your gender: ");
        String gender = scanner.next();
        System.out.println("Please enter your age: ");
        int age = scanner.nextInt();

        Customer customer = new Customer(name, surname, gender, age, new ArrayList<>(), LocalDate.now());
        customerList.add(customer);
    }

    @Override
    public void filterWithLetterC() {
        List<Customer> list = customerList.stream().filter(customer -> customer.getName().contains("C") || customer.getName().contains("c"))
                .toList();
        list.forEach(System.out::println);
    }
}
