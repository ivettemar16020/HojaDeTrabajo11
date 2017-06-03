import java.util.Scanner;
import java.io.*;

public class Texto {

	public String leerTexto() throws IOException {
		// TODO Auto-generated constructor stub
		// Para leer del archivo de texto
		
		File file = new File("guategrafo.txt");
		FileReader fileReader = new FileReader(file);
		BufferedReader bufferedReader = new BufferedReader(fileReader);
		StringBuffer stringBuffer = new StringBuffer();
		String line;
		
		while ((line = bufferedReader.readLine()) != null) {
			stringBuffer.append(line);
			stringBuffer.append(",");
		}
		fileReader.close();
		
		return stringBuffer.toString();
	}
}

