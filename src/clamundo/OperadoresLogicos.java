package clamundo;

public class OperadoresLogicos {
	public static void main (String[] args) {
		double nota01 = 5.0;
		double nota02 = 6.5;
		double nota03 = 5.0;
		double nota04 = 7.5;
		double frequencia = 77.2;
		
		double media = (nota01 + nota02 + nota03 + nota04) / 4 ;
		System.out.println(((media>= 6.0)&& (frequencia>= 75)) ? "Aprovado" : "Reprovado");
	}
}
