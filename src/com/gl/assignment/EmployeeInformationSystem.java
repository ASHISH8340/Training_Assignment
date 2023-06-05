package com.gl.assignment;

import java.util.Scanner;

public class EmployeeInformationSystem {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter employee's earnings: ");
		double earnings = sc.nextDouble();

		double tax = calculateIncomeTax(earnings);
		System.out.println("Income tax is: " + tax);
		sc.close();
	}

	public static double calculateIncomeTax(double earnings) {
		double tax = 0.0;

		if (earnings <= 50000) {
			tax = 0.0;
		} else if (earnings <= 60000) {
			tax = 0.1 * (earnings - 50000);
		} else if (earnings <= 150000) {
			tax = 0.1 * 10000 + 0.2 * (earnings - 60000);
		} else {
			tax = 0.1 * 10000 + 0.2 * 90000 + 0.3 * (earnings - 150000);
		}

		return tax;
	}
	
	//10% * 10,000 + 20% * 65,000 + 30% * 15,000 = 1,000 + 13,000 + 4,500 = 14,000
	
	//Rs. 60,000: 10% * (60,000 - 50,000) = 1,000
	//Rs. 1,50,000: 20% * (1,25,000 - 60,000) = 13,000

}
