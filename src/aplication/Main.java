package aplication;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import intities.Company;
import intities.Individual;
import intities.TaxPay;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		List<TaxPay> list = new ArrayList<>();

		System.out.print("Enter the number of tax payers: ");
		int numberTaxPlayers = sc.nextInt();
		for (int a = 0; a < numberTaxPlayers; a++) {
			System.out.println("Tax player #" + (a + 1) + " data:");
			System.out.print("Individual or company (i/c)? ");
			char ch = sc.next().charAt(0);
			if (ch == 'i' || ch == 'I') {
				System.out.print("Name: ");
				sc.nextLine();
				String name = sc.nextLine();
				System.out.print("Anual income: ");
				Double valueIncome = sc.nextDouble();
				System.out.print("Health expenditures: ");
				Double valueHealth = sc.nextDouble();
				TaxPay individual = new Individual(name, valueIncome, valueHealth);
				list.add(individual);
			} else {
				System.out.print("Name: ");
				sc.nextLine();
				String name = sc.nextLine();
				System.out.print("Anual income: ");
				Double valueIncome = sc.nextDouble();
				System.out.print("NUmber of employees: ");
				Integer quantity = sc.nextInt();
				TaxPay company = new Company(name, valueIncome, quantity);
				list.add(company);
			}

		}
		Double overall = 0.0;
		System.out.println("\nTAXES PAID:");
		for (TaxPay taxpay : list) {
			overall += taxpay.tax();
			System.out.println(taxpay.toString());
		}
		System.out.println("\nTOTAL TAXES: $ " + String.format("%.2f", overall));
		sc.close();
	}

}
