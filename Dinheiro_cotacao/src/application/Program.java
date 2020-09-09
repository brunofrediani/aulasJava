package application;

import java.util.Locale;
import java.util.Scanner;

import entities.CurrencyConverter;



public class Program {

	public static final double imposto = 6.00;
	
	public static void main(String[] args) {

		
		Locale.setDefault(Locale.US);
		Scanner sc =new Scanner(System.in);
		
	System.out.println("Insira a cotação do dólar: ");
	double dollarPrice = sc.nextDouble();
	
	System.out.println("Insira o montante: ");
	double amount = sc.nextDouble();
	
	double result = CurrencyConverter.dollarToReal(amount, dollarPrice);
	
System.out.printf("Quantia à pagar= %.2f%n",result);	
	

sc.close();
	}

}
