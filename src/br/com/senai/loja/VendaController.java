package br.com.senai.loja;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import br.com.senai.pessoa.Pessoa;
import br.com.senai.pessoa.PessoaController;
import br.com.senai.produto.Produto;
import br.com.senai.produto.ProdutoController;

public class VendaController {

	private Scanner tec;
	private ProdutoController produtoController;
	private PessoaController pessoaController;
	
	List<Venda> vendas = new ArrayList<Venda>();
	
	public VendaController() {
		tec = new Scanner(System.in);
		produtoController = new ProdutoController();
		pessoaController = new PessoaController();
	}
	
	public int leopcao() {
		System.out.print("> ");
		return tec.nextInt();
	}
	
	public List<Venda> listarVenda(List<Venda> vendas) {
		
		if(vendas.isEmpty()) {
			System.out.println("N�o possui vendas cadastradas.");
			return null;
		}
		System.out.println("--- VENDAS REALIZADAS ---");
		
		System.out.printf("| %10s | %10s | %4s | %6s |\n",
				"Cliente", "Produto", "Qtd", "Valor");
		
		for(int i = 0; i < vendas.size(); i++) {
			System.out.printf("| %10s | %10s | %4d | %6.2f |\n",
					vendas.get(i).getPessoa().getNome(),
					vendas.get(i).getProduto().getNomeDoProduto(),
					vendas.get(i).getQuantidade(),
					vendas.get(i).getValor());
		}
		
		return vendas;
	}
	
	public Venda cadastrarVenda(List<Produto> produtos, List<Pessoa> pessoas) {
		
		if(produtos.isEmpty() || pessoas.isEmpty()) {
			System.out.println("Imposs�vel realizar vendas sem PRODUTOS ou PESSOAS cadastradas.");
			return null;
			
		}
			
		produtoController.ListarProdutos(produtos);
		pessoaController.ListarPessoas(pessoas);
		
		Venda venda = new Venda();
		Produto produto = new Produto();
		Pessoa pessoa = new Pessoa();
		
		System.out.print("Informe o Id da pessoa: ");
		int idPessoa = tec.nextInt();
		
		pessoa.setNome(pessoas.get(idPessoa).getNome());
		pessoa.setAltura(pessoas.get(idPessoa).getAltura());
		pessoa.setAnoDeNascimento(pessoas.get(idPessoa).getAnoDeNascimento());
		
		venda.setPessoa(pessoa);
		
		System.out.print("Informe o Id do produto: ");
		int idProduto = tec.nextInt() - 1;
		
		produto.setNomeDoProduto(produtos.get(idProduto).getNomeDoProduto());
		produto.setQuantidadeDoProduto(produtos.get(idProduto).getQuantidadeDoProduto());
		produto.setValorUnitarioDoProduto(produtos.get(idProduto).getValorUnitarioDoProduto());
		produto.setValorTotalDoProduto(produtos.get(idProduto).getValorTotalDoProduto());
		
		venda.setProduto(produto);
		
		System.out.print("Informe quantidade desejada: ");
		venda.setQuantidade(tec.nextInt());
		
		venda.setValor(produto.getValorUnitarioDoProduto() * venda.getQuantidade());
		
		return venda;
	}
	
	public void menu3(List <Produto> produtos, List <Pessoa> pessoas) {
		
		
		boolean sair = false;
		do {
			System.out.println("\n------ MENU ------");
		System.out.println("1) Cadastrar Venda");
		System.out.println("2) Listar Vendas");
		System.out.println("0) Voltar");
		System.out.println("------------------");
			
			int opcao = leopcao();
			switch (opcao) {
			case 1:
				vendas.add(cadastrarVenda(produtos, pessoas));
				break;
				
			case 2:
				listarVenda(vendas);
				break;
				
			case 0:
				sair = true;
				break;
				
			default:
				System.out.println("Op��o Inv�lida!");
				break;
			}
		}while (!sair);
	}
}
