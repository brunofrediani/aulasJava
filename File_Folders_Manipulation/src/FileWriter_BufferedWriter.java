import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriter_BufferedWriter {

	public static void main(String[] args) {

		String[] vetorlinhas = new String []{"Bom dia !", "Boa tarde !", "Boa noite !"};
		String path = "C:\\Users\\56641\\Documents\\EclipseTesteFiles\\out.txt";
		
		try (BufferedWriter bw = new BufferedWriter(new FileWriter(path , true))){
																//true vai sobescrever se ja existir o
																//arquivo
			for (String linha : vetorlinhas ) {
				bw.write(linha);
				bw.newLine();
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
