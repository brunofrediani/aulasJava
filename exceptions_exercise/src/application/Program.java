package application;

import java.text.ParseException;
import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

import model.entities.Account;
import model.exception.DomainException;

public class Program {

	public static void main(String[] args) throws ParseException {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
			System.out.println("Entre os dados da conta:");
			System.out.print("Nº: ");
			int number = sc.nextInt();

			System.out.print("Nome: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Saldo inicial: ");
			double balance = sc.nextDouble();
			System.out.print("Limite de saque: ");
			double withdrawLimit = sc.nextDouble();

			System.out.print("Entre o valor do saque: ");
			double amount = sc.nextDouble();

			Account acc = new Account(number, name, balance, withdrawLimit);
			try {
			acc.withdraw(amount);

			System.out.println(acc);
		}
		catch (DomainException e) {
			System.out.println(e.getMessage());
		}

		sc.close();

	}

}
