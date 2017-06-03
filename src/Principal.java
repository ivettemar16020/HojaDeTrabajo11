/*
@ Yasmin Chavez Carne 16101
@ Ivette Cardona Carne 16020
@ Samantha Duarte Carne 16256
*/

import java.io.*;

public class Principal{
	
	private static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	
	public static void main(String[] args) throws IOException {
		Texto texto = new Texto();
		texto.leerTexto();
		// Matriz de adyacencia
		int S[][] = new int [6][6]; 
				
				S[0][0] = 0;
				S[0][1] = 0;
				S[0][2] = 0;
				S[0][3] = 0;
				S[0][4] = 0;
				S[0][5] = 0;
				
				S[1][0] = 0;
				S[1][1] = 0;
				S[1][2] = 2;
				S[1][3] = 3;
				S[1][4] = 2;
				S[1][5] = 4;
				
				S[2][0] = 0;
				S[2][1] = 1;
				S[2][2] = 0;
				S[2][3] = 4;
				S[2][4] = 4;
				S[2][5] = 4;
				
				S[3][0] = 0;
				S[3][1] = 1;
				S[3][2] = 4;
				S[3][3] = 0;
				S[3][4] = 4;
				S[3][5] = 4;
				
				S[4][0] = 0;
				S[4][1] = 2;
				S[4][2] = 2;
				S[4][3] = 3;
				S[4][4] = 0;
				S[4][5] = 3;
				
				S[5][0] = 0;
				S[5][1] = 4;
				S[5][2] = 4;
				S[5][3] = 4;
				S[5][4] = 4;
				S[5][5] = 0;
				
		// Punto inicial	
		System.out.println("Escribe la ciudad de origen");

		int i = Integer.parseInt(in.readLine());
		
		// Punto final
		System.out.println("Escribe la ciudad destino");
		int j = Integer.parseInt(in.readLine());
		
		int l = j;
		int k=0;
		String ruta = "";
		String ruta0 = "";
		
		if (S[i][j] == j) /*If j = S[i][j] there is a direct conection between i and j */
			System.out.println("La ruta mas corta es ir de: " + i + " a " + j );
		
		else{ 
		// Si no hay conexion entre i y j, S[][] se vuelve a revisar S[][]
 

// Si S[i][l] es uno hay una conexion entre i y j
// Si no, hay que iterar S[i][j]
			k = S[i][l];
			while ( k != l){
				ruta = S[i][l] + "" + ruta + "";
				l = S[i][l];
				
			}
			
			k = S[l][j];
			 while ( k != l){
				ruta0 = S[l][j] + "" + ruta0 + "";
				l = S[l][j];
				
			}
			if(j<i)
			System.out.println("La ruta mas corta a tomar es la siguiente: " + i + " " + ruta + 
 
" " + ruta0 + " "+ j);
			else
				System.out.println("La ruta mas corta a tomar es la siguiente: " + i + " " + 
 
ruta0 + " " + ruta + " "+ j);
		 
 
			
		}
		
		
		
		
	}
	
}
