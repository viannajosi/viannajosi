package app;

import entidade.Cliente;
import java.util.Scanner;
import entidade.Telefone;

public class Aplicativo {
	public static void main(String[] args) {
		
		Cliente c = new Cliente();
		Telefone t = new Telefone();
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Informe o ID: ");
		c.setId(Integer.parseInt(scan.nextLine()));
		System.out.print("Informe o Nome: ");
		c.setNome(scan.nextLine());
		System.out.print("Informe a idade");
		c.setIdade(Integer.parseInt(scan.nextLine()));
		
		System.out.print("Informe o ID do telefone: ");
		t.setId(Integer.parseInt(scan.nextLine()));
		System.out.print("Infome o numero do telefone: ");
		t.setNumero(scan.nextLine());
		
		scan.close();
		
		System.out.println("O ID informado " + c.getId());
		System.out.println("A Idade informada " + c.getIdade());
		System.out.println("O Nome informado " + c.getNome());
	}
}
