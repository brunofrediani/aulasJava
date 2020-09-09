package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Rectangle;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Rectangle rect = new Rectangle();
		
		
		System.out.println("Entre a Altura e a Largura do triângulo");
		
		System.out.println("Altura: ");
		
		rect.height = sc.nextDouble();
		
		System.out.println("Largura: ");
		
		rect.width = sc.nextDouble();
		
System.out.printf("AREA = %.2f%n", rect.Area());
System.out.printf("Perimetro = %.2f%n", rect.Perimeter());
System.out.printf("Diagonal = %.2f%n",rect.Diagonal());

//System.out.printf("AREA = %.2f%n", rect.area());
		
		sc.close();
	}

}
