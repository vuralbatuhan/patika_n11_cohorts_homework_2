package com.example.cohort2.service;

import com.example.cohort2.entity.Bill;
import com.example.cohort2.utils.LoadInitData;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;



public class BillServiceImpl implements BillService {

    private final List<Bill> Bills = LoadInitData.getBillList();


    @Override
    public void totalBillsAmountOfCustomersCreatedInJune() {
        Double totalPrice = 0.0;
        for (Bill Bill : Bills) {
            if (Bill.getOrder().getCustomer().getCreatedAt().getMonthValue() == 6) {
                totalPrice += Bill.getTotalPrice();
            }
        }
        System.out.println(totalPrice);
    }

    @Override
    public void findAll() {
        Bills.forEach(System.out::println);
    }

    @Override
    public void filterBillsByTotalAmount() {
        List<Bill> BillList = new ArrayList<>();
        for (Bill Bill : Bills) {
            if (Bill.getTotalPrice() > 1500) {
                BillList.add(Bill);
            }
        }
        BillList.forEach(System.out::println);
    }

    @Override
    public void averageOfBillsOverAmount() {
        List<Bill> BillList = new ArrayList<>();
        Double totalPrice = 0.0;
        for (Bill Bill : Bills) {
            if (Bill.getTotalPrice() > 1500) {
                BillList.add(Bill);
                totalPrice += Bill.getTotalPrice();
            }
        }
        if (!BillList.isEmpty()) {
            System.out.println(totalPrice / BillList.size());
        } else {
            System.out.println("0");
        }

    }

    @Override
    public void listOfCustomersHasBelowAmount() {
        List<String> names = new ArrayList<>();
        for (Bill Bill : Bills) {
            if (Bill.getTotalPrice() < 500) {
                names.add(Bill.getOrder().getCustomer().getName());
            }
        }
        names.forEach(System.out::println);
    }

    @Override
    public void listOfSectorNamesBillAmountBelow() {
        Set<String> names = new HashSet<>();
        for (Bill Bill : Bills) {
            if (Bill.getTotalPrice() < 750) {
                names.add(Bill.getOrder().getCustomer().getName());
            }
        }
        names.forEach(System.out::println);
    }
}