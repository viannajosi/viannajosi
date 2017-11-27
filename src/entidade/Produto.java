package entidade;

public class Produto {
	
	private Long id;
	private String nmProduto;
	private Double quantidade;
	private Double preco;
	
	public Produto() {
		
	}
	
	@Override
	public String toString() {
		return "ID: " + id + "\tNome: " + nmProduto + "\tQuantidade: " + quantidade + "\tPre�o:"+ preco;
	}
	
	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	public String getNmProduto() {
		return nmProduto;
	}
	
	public void setNmProduto(String nmPrduto) {
		this.nmProduto = nmProduto;
	}
	
	public Double getQuantidade() {
		return quantidade;
	
	}
	
	public void setQuantidade(Double quantidade) {
		this.quantidade = quantidade;
	}
	
	public Double getPreco() {
		return preco;
		
	}
	
	public void setPreco(Double preco) {
		this.preco = preco;
		
	}
	
}
