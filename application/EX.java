package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Aluno;
import entities.CurrencyConverter;
import entities.Employee;

public class EX {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		Employee emplo = new Employee();

		System.out.println("Name: ");
		emplo.name = sc.nextLine();
		System.out.println("Gross Salary: ");
		emplo.grossSalary = sc.nextDouble();
		System.out.println("Tax: ");
		emplo.tax = sc.nextDouble();

		System.out.println();
		System.out.println("Employee: " + emplo);

		System.out.printf("%nWhich percentage to increase salary? ");
		double percentage = sc.nextDouble();
		emplo.increaseSalary(percentage);

		System.out.println("Update: " + emplo);

		Aluno aluno = new Aluno();

		System.out.println("Name: ");
		aluno.name = sc.nextLine();
		aluno.nota1 = sc.nextDouble();
		aluno.nota2 = sc.nextDouble();
		aluno.nota3 = sc.nextDouble();

		System.out.println("Final Grade: " + String.format("%.2f", aluno.finalGrade()));
		if (aluno.finalGrade() < 60) {
			System.out.println("FAILED");
			System.out.println("Missing " + String.format("%.2f", aluno.quantoFalta()) + " Points");

		} else {
			System.out.println("PASS");

		}

		
		System.out.println("what is the dollar price: ");
		double dollar_price = sc.nextDouble();
		System.out.println("How many dollars will be bougth dollar price: ");
		double amount = sc.nextDouble();
		double result = CurrencyConverter.dolarToReais(dollar_price,amount);
		System.out.printf("To be paid = %.2f", result);
		

		sc.close();
	}

}
