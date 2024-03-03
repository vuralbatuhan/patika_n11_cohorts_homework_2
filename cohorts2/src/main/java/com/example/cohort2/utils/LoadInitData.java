package com.example.cohort2.utils;

import com.example.cohort2.entity.Customer;
import com.example.cohort2.entity.Bill;
import com.example.cohort2.entity.Order;
import com.example.cohort2.entity.Product;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;


public class LoadInitData {


    private static final List<Customer> CUSTOMER_LIST = new ArrayList<>();
    private static final List<Bill> BILL_LIST = new ArrayList<>();

    static {
        loadInitData();
    }

    private LoadInitData() {
    }

    public static List<Customer> getCustomerList() {
        return CUSTOMER_LIST;
    }

    public static List<Bill> getBillList() {
        return BILL_LIST;
    }

    private static void loadInitData() {
        Customer batuhanVural = new Customer("Batuhan", "Vural","male",22, new ArrayList<>(), LocalDate.now());
        Customer hamzaSezgin = new Customer("Hamza", "Sezgin","male",33, new ArrayList<>(), LocalDate.now());
        Customer ceydaArmada = new Customer("Nuray", "Armada","male",29, new ArrayList<>(), LocalDate.now());
        Customer aliKarakus = new Customer("Fikret", "Karakuş","male",19, new ArrayList<>(), LocalDate.now());

        CUSTOMER_LIST.add(batuhanVural);
        CUSTOMER_LIST.add(hamzaSezgin);
        CUSTOMER_LIST.add(ceydaArmada);
        CUSTOMER_LIST.add(aliKarakus);

        Product modem = new Product("modem", 715.00);
        Product gameConsole = new Product("gameConsole", 398.50);
        Product notebook = new Product("notebook", 12565.50);
        Product keyboard = new Product("keyboard", 100.00);
        Product television = new Product("television", 3750.00);

        Order batuhanVuralOrder = new Order(batuhanVural, List.of(modem, gameConsole));
        Order hamzaSezginOrder = new Order(hamzaSezgin, List.of(keyboard, modem));
        Order ceydaArmadaOrder = new Order(ceydaArmada, List.of(notebook, television));
        Order aliKarakusOrder = new Order(aliKarakus, List.of(notebook, keyboard, gameConsole, modem));

        batuhanVural.getOrders().add(batuhanVuralOrder);
        hamzaSezgin.getOrders().add(hamzaSezginOrder);
        ceydaArmada.getOrders().add(ceydaArmadaOrder);
        aliKarakus.getOrders().add(aliKarakusOrder);

        Bill batuhanVuralBill = new Bill(LocalDateTime.now(), batuhanVuralOrder);
        Bill hamzaSezginBill = new Bill(LocalDateTime.now(), hamzaSezginOrder);
        Bill ceydaArmadaBill = new Bill(LocalDateTime.now(), ceydaArmadaOrder);
        Bill aliKarakusBill = new Bill(LocalDateTime.now(), aliKarakusOrder);

        BILL_LIST.add(batuhanVuralBill);
        BILL_LIST.add(hamzaSezginBill);
        BILL_LIST.add(ceydaArmadaBill);
        BILL_LIST.add(aliKarakusBill);

    }

}
