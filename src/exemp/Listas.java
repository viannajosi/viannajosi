  package exemp;

  import java.util.ArrayList;
  import java.util.List;
  import entidade.Produto;
  
public class Listas {
	public static void main(String[] args ) {
		
		// primeiro contato com Collections
		
		/*dECLARACAO DO OBJETO */
		Produto pr1 = new Produto();
		Produto pr2 = new Produto();
		Produto pr3 = new Produto();
		
		/*Declaração em lista*/
		List<Produto> listaDeCompras = new ArrayList<Produto>();
		
		/*Atribuindo valores aos objetos de ListaDeCompras*/
		
		pr1.setId(10L);
		pr1.setNmProduto("Arroz");
		pr1.setPreco(10.5);
		pr1.setQuantidade(5.);;
		
		pr2.setId(20L);
		pr2.setNmProduto("Feijão");
		pr2.setPreco(7.8);
		pr2.setQuantidade(1.);
		
		pr3.setId(30L);
		pr3.setNmProduto("Açucar");
		pr3.setPreco(30.);
		pr3.setQuantidade(1.);
		
		/*Atribuindo a lista*/
		listaDeCompras.add(pr1);
		listaDeCompras.add(pr2);
		listaDeCompras.add(pr3);
		
		/*Saida da lista */
		for (Produto produto : listaDeCompras) {
			System.out.println(produto);
		}
		
		
	}
}
