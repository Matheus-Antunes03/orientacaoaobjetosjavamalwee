package br.com.senai;

import java.util.ArrayList;
import java.util.List;

import br.com.senai.pessoa.Pessoa;
import br.com.senai.pessoa.PessoaController;
import br.com.senai.produto.Produto;
import br.com.senai.produto.ProdutoController;
import br.com.senai.loja.Venda;
import br.com.senai.loja.VendaController;

public class ProgramaPrincipal {

	public static void main(String[] args) {

		List<Pessoa> pessoas = new ArrayList<>();
		List<Produto> produtos = new ArrayList<Produto>();
		List<Venda> vendas = new ArrayList<Venda>();
		
		Produto produto = new Produto(
				"Abacate",
				2.5,
				35,
				2.5 * 35
				);
		produtos.add(produto);

		PessoaController pessoaController = new PessoaController();
		ProdutoController produtoController = new ProdutoController();
		VendaController vendaController = new VendaController();

		boolean sair = false;

		do {
			menu();
			int opcao = pessoaController.leopcao();
			switch (opcao) {
			
			case 0:
				sair = true;
				break;
				
			case 1:
				pessoaController.menu1();
				do {
					int opcao2 = pessoaController.leopcao();
					switch (opcao2) {
					case 1:
						pessoas.add(pessoaController.cadastrarPessoa());
						break;
						
					case 2:
						pessoaController.ListarPessoas(pessoas);
						break;
					
					case 3:
						pessoaController.editarPessoa(pessoas);
						break;
						
					case 4:
						pessoaController.excluirPessoa(pessoas);
						break;
						
					case 0:
						sair = true;
						break;
						
					default:
						System.out.println("Opção Inválida!");
						break;
					}
				} while (!sair);
				
				break;
				
			case 2:
				produtoController.menu2();
				do {
					int opcao3 = pessoaController.leopcao();
					switch (opcao3) {
					case 1:
						produtos.add(produtoController.cadastrarProduto());
						break;
						
					case 2:
						produtoController.ListarProdutos(produtos);
						break;
						
					case 3:
						produtoController.editarProduto(produtos);
						break;
						
					case 4:
						produtoController.excluirProduto(produtos);
						break;
						
					case 0:
						sair = true;
						break;
						
					default:
						System.out.println("Opção Inválida!");
						break;
					}
					} while (!sair);
				break;
				
			case 3:
				vendaController.menu3();
				do {
					int opcao4 = pessoaController.leopcao();
					switch (opcao4) {
					
					case 1:
						vendas.add(vendaController.cadastrarVenda(produtos, pessoas));
						break;
						
					case 2:
						vendaController.listarVenda(vendas);
						break;
					
					case 0:
						sair = true;
						break;
						
					default:
						System.out.println("Opção Inválida!");
						break;
					}
				} while (!sair);
				break;
				
			default:
				System.out.println("Opção Inválida!");
				break;
			}
			
		} while (!sair);

		System.out.println("Sistema finalizado!");
	}
	
	public static void menu() {
		System.out.println("\n--------- MENU ---------");
		System.out.println("1) Registro de Pessoas");
		System.out.println("2) Registro de Produtos");
		System.out.println("3) Registro de Vendas");
		System.out.println("0) Sair do Sistema");
		System.out.println("------------------------");
	}

}
