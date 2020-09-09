package packageNovo;

import java.util.Locale;
import java.util.Scanner;

import entities.triangle;

public class triangles {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		triangle y, x;

		x = new triangle();
		y = new triangle();

		System.out.println("Entre as medidas do triângulo X: ");

		x.a = sc.nextDouble();
		x.b = sc.nextDouble();
		x.c = sc.nextDouble();

		System.out.println("Entre as medidas do triângulo Y: ");

		y.a = sc.nextDouble();
		y.b = sc.nextDouble();
		y.c = sc.nextDouble();

		double areaX = x.area();
		double areaY = y.area();

		System.out.printf("Triangle X area: %.4f%n ", areaX);
		System.out.printf("Triangle Y area: %.4f%n ", areaY);

		if (x.a > x.b) {

			System.out.println("Triangle X is the greatest ");
		} 
		else {

			System.out.println("Triangle Y is the greatest ");

		}

		sc.close();
	}

}
