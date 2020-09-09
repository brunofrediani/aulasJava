package application;

import java.util.Locale;
import java.util.Scanner;


import entities.Employee;

public class Program {

	public static void main(String[] args) {

	Locale.setDefault(Locale.US);	
	Scanner sc = new Scanner(System.in);
	
	Employee employ = new Employee();
	
	System.out.print("Insira o nome do empregado: ");
	employ.Name = sc.nextLine();
	
	System.out.print("Insira o salário bruto: ");
	employ.GrossSalary = sc.nextDouble();
	
	System.out.print("Insira o valor do imposto: ");
	employ.Tax = sc.nextDouble();

	System.out.println(employ);
	
	System.out.print("Qual porcentagem gostaria de acrescer ao salário do funcionário: ");
	double percentage = sc.nextDouble();
	employ.IncreaseSalary(percentage);
	System.out.println("Dados ajustados: ");
	
	System.out.println(employ);
	
	
	
	sc.close();	
	
	}

}
