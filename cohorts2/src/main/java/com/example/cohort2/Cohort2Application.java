package com.example.cohort2;

import com.example.cohort2.service.CustomerServiceImpl;
import com.example.cohort2.service.BillServiceImpl;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Scanner;

@SpringBootApplication
public class Cohort2Application {

	public static void main(String[] args) {
		SpringApplication.run(Cohort2Application.class, args);

		Scanner scanner = new Scanner(System.in);
		CustomerServiceImpl customerService = new CustomerServiceImpl();
		BillServiceImpl billService = new BillServiceImpl();
		boolean exit = true;

		while (exit) {
			printMenu();
			int number = scanner.nextInt();
			switch (number) {
				case 1 -> customerService.save(scanner);
				case 2 -> customerService.findAll();
				case 3 -> customerService.filterWithLetterC();
				case 4 -> billService.totalBillsAmountOfCustomersCreatedInJune();
				case 5 -> billService.findAll();
				case 6 -> billService.filterBillsByTotalAmount();
				case 7 -> billService.averageOfBillsOverAmount();
				case 8 -> billService.listOfCustomersHasBelowAmount();
				case 9 -> billService.listOfSectorNamesBillAmountBelow();
				case 0 -> exit = false;
				default -> System.out.println("Invalid option !");
			}
		}

	}

	private static void printMenu() {
		System.out.println("1. Create New Customer");
		System.out.println("2. List all customers");
		System.out.println("3. List customers with the letter 'C' in them");
		System.out.println("4. List total amount of bills of customers who registered in June");
		System.out.println("5. List all bills in the system");
		System.out.println("6. List bills over 1500TL in the system");
		System.out.println("7. Calculate the average of bills over 1500TL in the system");
		System.out.println("8. List names of customers with bills under 500TL in the system");
		System.out.println("9. List sector in which companies whose average bills for June are below 750 are in");
		System.out.println("0. EXIT");
		System.out.print("Enter your choice: ");
	}

}
