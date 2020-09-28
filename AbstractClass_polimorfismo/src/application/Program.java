package application;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.contribuintes;
import entities.pessoaFisica;
import entities.pessoaJuridica;

public class Program {

	public static void main(String[] args) throws ParseException {

		Locale.setDefault(Locale.US);

		Scanner sc = new Scanner(System.in);

		List<contribuintes> list = new ArrayList<>();

		System.out.print("Entre o número de contribuintes: ");
		int n = sc.nextInt();

		for (int i = 1; i <= n; i++) {
			System.out.println("Contribuinte #" + i + " dados");
			System.out.print("Individual ou companhia? (i/c) ");
			char ch = sc.next().charAt(0);
			System.out.print("Nome: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Renda anual: ");
			double rendaAnual = sc.nextDouble();

			if (ch == 'i') {
				// INDIVIDUO
				System.out.print("Despesas médicas: ");
				double planoSaude = sc.nextDouble();
				list.add(new pessoaFisica(name, rendaAnual, planoSaude));
			} else {
//		COMPANHIA
				System.out.print("Númer de funcionarios: ");
				int nFunc = sc.nextInt();
				list.add(new pessoaJuridica(name, rendaAnual, nFunc));
			}
		}

		double sum = 0.0;
		System.out.println();
		System.out.println("Impostos Pagos: ");

		for (contribuintes contribu : list) {

			double taxa = contribu.impostos();
			System.out.println(contribu.getName() + ": $ " + String.format("%.2f", taxa));
			sum += taxa;
		}
		System.out.println();
		System.out.println("Total de impostos: $" + String.format("%.2f", sum));

		sc.close();
	}
}
