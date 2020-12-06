package exercicio;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import exercicio.entities.Product;

public class Program {

	public static void main(String[] args) throws ParseException {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		List<Product> list = new ArrayList<>();

		System.out.println("Enter file path: ");
		String sourceFileStr = sc.nextLine();
		/*Lê o caminho + arquivo com extensão
		 * ex: C:\Users\56641\Documents\EclipseTesteFiles\summary.csv
		 * irá criar um arquivo chamado summary.csv na subpasta out
		 */

		File sourceFile = new File(sourceFileStr);
		String sourceFolderStr = sourceFile.getParent();
		
		boolean success = new File(sourceFolderStr + "\\out").mkdir();
		//cria a subpasta \"out"
		
		String targetFileStr = sourceFolderStr + "\\out\\summary.csv";
		//targetFileStr recebe caminho e criar arquivo summary.csv na pasta out
		
		try (BufferedReader br = new BufferedReader(new FileReader(sourceFileStr))) {

			String itemCsv = br.readLine();
			//lê as linhas do arquivo
			while (itemCsv != null) {
				String[] fields = itemCsv.split(",");//le dados separados por ",".
				String name = fields[0];
				double price = Double.parseDouble(fields[1]);
				int quantity = Integer.parseInt(fields[2]);

				list.add(new Product(name, price, quantity));

				itemCsv = br.readLine();
			}

			try (BufferedWriter bw = new BufferedWriter(new FileWriter(targetFileStr))) {
																	//recebe o caminho como argumento
				for (Product item : list) {
					bw.write(item.getName() + "," + String.format("%.2f", item.total()));
					bw.newLine();
				}

				System.out.println(targetFileStr + " CREATED!");
				
			} catch (IOException e) {
				System.out.println("Error writing file: " + e.getMessage());
			}

		} catch (IOException e) {
			System.out.println("Error reading file: " + e.getMessage());
		}

		sc.close();
	}
}