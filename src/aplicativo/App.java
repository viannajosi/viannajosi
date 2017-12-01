package aplicativo;

import entidade.Cliente;
import entidade.Cliente.FormaPagamento;
import entidade.Cliente.Tipo;
import entidade.Funcionario;
import entidade.Funcionario.Cargo;
import util.Criptografia;

public class App {
	public static void main(String[] args) {

		Cliente c = new Cliente();
		Funcionario f = new Funcionario();

		c.setNome("Fulano de tal");
		c.setEmail("fulano@detal.com.br");
		c.setLogin("fulano");
		c.setSenha(Criptografia.geraMD5("123"));
		c.setTelefone("(21) 975036444");
		c.setFormaPagamento(FormaPagamento.CARTAO);
		c.setTipo(Tipo.PESSOA_FISICA);

		System.out.println(c.autentica("fulano", "123") ? "Login efetuado" : "falha ao efetuar login");

		f.setNome("Jos� da Silva");
		f.setEmail("jsilva@gmail.com");
		f.setLogin("jsilva");
		f.setSenha(Criptografia.geraMD5("2222"));
		f.setSetor("TI");
		f.setCargo(Cargo.ANALISTA);

		System.out.println(f.autentica("jsilva", "222") ? "Login efetuado" : "falha ao efetuar login");
	}
}