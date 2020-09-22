package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Produto;
import entities.ProdutoImportado;
import entities.produtoUsado;

public class Program {

	public static void main(String[] args) throws ParseException {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		List<Produto> list = new ArrayList<>();

		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

		System.out.print("Entre o número de Produtos: ");
		int n = sc.nextInt();

		for (int i = 1; i <= n; i++) {

			System.out.println("Produto #" + i + " dados:");
			System.out.print("Comum, usado ou importado (c , u , i)  ? ");
			char ch = sc.next().charAt(0);

		

				System.out.print("Nome: ");
				sc.nextLine();
				String nome = sc.nextLine();
				System.out.print("Preço:");
				double preço = sc.nextDouble();

				if (ch == 'c') {

					list.add(new Produto(nome, preço));
				} else if (ch == 'u') {
					System.out.print("Data de fabricação: ");
					Date dtFabricacao = sdf.parse(sc.next());
					list.add(new produtoUsado(nome, preço, dtFabricacao));
				} else if (ch == 'i') {
					System.out.print("Taxa de importação: ");
					double txImportacao = sc.nextDouble();
					list.add(new ProdutoImportado(nome, preço, txImportacao));
				}
			}
		

		System.out.println();
		System.out.println("Etiqueta:");
		for (Produto prod : list) {
			System.out.println(prod.etiqueta());
		}

		sc.close();

	}
}
