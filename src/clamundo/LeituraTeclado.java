package clamundo;

import java.util.Scanner;

public class LeituraTeclado {
	public static void main(String[] args) {
	//declaração de variaveis
		
	Long matricula;
	String nome;
	Integer idade;
	Double peso;
	Float altura;
	
	// leitura do teclado
	
	Scanner scan = new Scanner(System.in);
	
	System.out.print("Infome o matricula da pessoa: ");
	matricula = Long.parseLong(scan.nextLine());
	
	System.out.print("Infome o nome da pessoa: ");
	nome = scan.nextLine();
	
	System.out.print("Infome o idade da pessoa: ");
	idade = Integer.parseInt(scan.nextLine());
	
	System.out.print("Infome o peso da pessoa: ");
	peso = Double.parseDouble(scan.nextLine());
	
	System.out.print("Infome o altura da pessoa: ");
	
	altura = Float.parseFloat(scan.nextLine());
	
	scan.close();
	
	
	System.out.println(
		"Os dados informados foram:\n"
		+ "\tMaricula: " + matricula
		+ "\n\tNome: " + nome
		+ "\n\tIdade: " + idade
		+ "\n\tPeso: " + peso
		+ "\n\tAltura: " + altura 
		
		);
		}
}
