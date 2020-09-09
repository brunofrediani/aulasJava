package application;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


public class Program {

	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("Maria");
		list.add("Alex");
		list.add("Bob");
		list.add("Anna");
		list.add(2, "Marco");
		System.out.println(list.size());
		for (String x : list) {
		System.out.println(x);
		}
		System.out.println("---------------------");
		list.removeIf(x -> x.charAt(0) == 'M'); //função para remover quando começa com M (index 0)
		for (String x : list) { //for para percorrer e imprimir a lista
		System.out.println(x);
		}
		System.out.println("---------------------");
		System.out.println("Index of Bob: " + list.indexOf("Bob"));// retorna posicao na lista do bob
		System.out.println("Index of Marco: " + list.indexOf("Marco"));//quando não existe retorn -1
		System.out.println("---------------------");
		List<String> result = list.stream().filter(x -> x.charAt(0) == 'A').collect(Collectors.toList());
		/* Stream aceita operacoes com expressao               filtra nomes com A na posição 0 que é o começo
		 * lambda
		 * stream() não é compativel com list,			
		o Collectors.toList é para converter para lista de volta
		*/
		for (String x : result) {				
		System.out.println(x);
		}
		System.out.println("---------------------");
		String name = list.stream().filter(x -> x.charAt(0) == 'J').findFirst().orElse(null);
		System.out.println(name); // encontra o primeiro elemento da lista que começa com a letra
								  // caso não exista retorna null
	}

}
