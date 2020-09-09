package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Student;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Student student = new Student();
		
		System.out.print("Insira o nome do Aluno: ");
		Student.name = sc.nextLine();
		System.out.println("Insira a nota do Aluno: ");
		
		Student.notaA= sc.nextDouble();
		Student.notaB = sc.nextDouble();
		Student.notaC = sc.nextDouble();
		
		System.out.printf("Nota final: %.2f%n",student.finalGrade());
	
		if (student.finalGrade() < 60.0 ) {
			
System.out.println("Não passou !");		
System.out.printf("Pontos faltantes: %.2f%n",student.pontosFaltantes());
		}
		else {
		
			System.out.println("Passou!");
		}
		sc.close();

	}

}
