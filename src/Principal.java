/*
 * Shortest Path Between 2 given cities
 * using Floyd's Algorithm
 * 
 *
 *
 * 
 */
import java.io.*;
 

/**
 *
 * @author José Manuel
 */
public class Principal{
	
 
	public Principal() {
	}
	
	private static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	public static void main(String[] args) throws IOException {
		// TODO code application logic here
		int S[][] = new int [6][6]; /* Creating the adjacency matrix, this is the last adjacency matrix */
				
				S[0][0] = 0;//Defining Values
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
				
	  
				
		System.out.println("Escribe la ciudad de origen");/*Ask for the initial point, from 1 to 5 */
 

		int i = Integer.parseInt(in.readLine());
		
		System.out.println("Escribe la ciudad destino");/*Ask for the final point*/
		int j = Integer.parseInt(in.readLine());
		
		int l = j;
		int k=0;
		String ruta = "";
		String ruta0 = "";
		
		if (S[i][j] == j) /*If j = S[i][j] there is a direct conection between i and j */
			System.out.println("La ruta mas corta es ir de: " + i + " a " + j );
		
		else{ /* if theres no direct connection between i and j, S[][] has to be evaluated to find the shortest path. */
 
/*Here is the main problem... this how i programmed the last part of the *algorithm, but it is not 
*correct. 
*These Whiles has to check if S[i][l] is equal to l if so, there is a direct *connection between i 
*and j, if not between i and j you have to pass through S[i][j], and *evaluate this point with 
*the new value of l
*/
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
			System.out.println("La ruta mas corta a tomar es la sigueinte: " + i + " " + ruta + 
 
" " + ruta0 + " "+ j);
			else
				System.out.println("La ruta mas corta a tomar es la sigueinte: " + i + " " + 
 
ruta0 + " " + ruta + " "+ j);
		 
 
			
		}
		
		
		
		
	}
	
}
