package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Bank;

public class Main_banco {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter account number: ");
		int number = sc.nextInt();
		
		System.out.print("Enter account holder: ");
		sc.nextLine();
		String name = sc.nextLine();

		Bank banco;
		
		System.out.println("Is there na initial deposit (y/n)?  ");
		char response = sc.next().charAt(0);
		if (response == 'y') {
			System.out.println("Enter initial deposit value: ");
			double deposit = sc.nextDouble();
			banco = new Bank(number, name, deposit);

		} else {
			banco = new Bank(number, name);
		}

		
		System.out.println();
		System.out.println("Account data:");
		System.out.println(banco);
		
		System.out.println("Enter a deposit value: ");
		double deposit = sc.nextDouble();
		banco.deposit(deposit);
		System.out.print("Updated account data:");
		System.out.println(banco);


		System.out.println("Enter a withdraw value: ");
		double withdraw = sc.nextDouble();
		banco.deposit(withdraw);
		System.out.print("Updated account data:");
		System.out.println(banco);

		sc.close();

	}

}
