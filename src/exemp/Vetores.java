package exemp;

import java.util.Scanner;

public class Vetores {
	public static void main(String[] args) {
		
		/*Declaração de variaveis */
		int x = 27;
		Scanner scan = new Scanner (System.in);
		
		
		/*Declarando os vetores*/
		
		// Definindo vetor vazio
		int vet_numero[] = new int[5];
		
		//Definindo vetor com valores
		String vet_palavras[] = {"Java", "Senac","rio"};
		boolean[] vet_booleano = {true, true, true, false};
		
		/*Impressão de vetores*/
		
		// for
		for(int i = 0; i< vet_palavras.length; i++) {
			System.out.println(vet_palavras[i]);
		}
		
		//foreach
		for(boolean b : vet_booleano)	{
			System.out.println(b);
		}
		
		/* Atribuindo valores*/
		vet_numero[0] = 30;
		vet_numero[1] = x;
		vet_numero[2] = scan.nextInt();
		
		
		for (int n : vet_numero) {
			System.out.println(n);
		}
		
		int i = 0;
		while(i< vet_numero.length) {
			System.out.println("Informe o " + (i + 1));
			vet_numero[i] = scan.nextInt();
			i++;
		}
		
		scan.close();
		
		for (int n : vet_numero) {
			System.out.println(n);
		}
	}
}
	
