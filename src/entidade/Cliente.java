package entidade;

public class Cliente {
	
	private int id;
	private String nome;
	private int idade;
	
	
	public void setIdade(int idade) { // set 
		this.idade =  idade;
	}
	
	public int getIdade() {
		return idade;
		
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getNome() {
		return nome;
		
	}
	
	public void setId(int id) {
		this.id = id;
	}
	public int getId() {
		return id;
		
	}
	
}
