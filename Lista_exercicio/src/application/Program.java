package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import entities.employee;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		List<employee> list = new ArrayList<>();

		System.out.println("Quantos empregados serão registrados? ");
		int n = sc.nextInt();

		for (int i = 1; i <= n; i++) {
			System.out.println();
			System.out.println("Employee #" + i + ": ");

			System.out.println("ID: ");
			int id = sc.nextInt();

			while (hasId(list, id)) {
				System.out.print("Id já existe.Tente outro ");
				id = sc.nextInt();
			}

			System.out.println("Digite o nome: ");
			sc.nextLine();
			String name = sc.nextLine();

			System.out.println("Digite o salário: ");
			double salary = sc.nextDouble();

			list.add(new employee(id, name, salary));

		}
		sc.nextLine();
		System.out.println("Entre com o código do empregado que receberá aumento: ");
		int id = sc.nextInt();

		employee empregado = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
		if (empregado == null) {
			System.out.println("This id does not exist!");
		} else {
			System.out.println("Entre a porcentagem: ");
			double percentage = sc.nextDouble();
			empregado.increaseSalary(percentage);
		}

		System.out.println();

		System.out.println("Lista de empregados: ");
		for (employee obj : list) {
			System.out.println(obj);
		}

		sc.close();

	}

	public static boolean hasId(List<employee> list, int id) {
		employee emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
		return emp != null;
	}
}
