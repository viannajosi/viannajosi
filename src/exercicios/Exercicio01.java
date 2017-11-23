package exercicios;

import java.util.Scanner;

public class Exercicio01 {
	public static void main(String[] args) {
		
		Double preco;
		Double desconto; 
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Informe o Preço");
		preco = scan.nextDouble();
		
		desconto = preco * 0.09;
		
		scan.close();
		
		
		System.out.println( "Desconto do produto: " + (preco - desconto));
		
		
	}
	
}
