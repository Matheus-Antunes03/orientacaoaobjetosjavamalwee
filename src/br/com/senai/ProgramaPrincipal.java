package br.com.senai;

import java.util.ArrayList;
import java.util.List;

import br.com.senai.pessoa.Pessoa;
import br.com.senai.pessoa.PessoaController;
import br.com.senai.produto.Produto;
import br.com.senai.produto.ProdutoController;

public class ProgramaPrincipal {

	public static void main(String[] args) {

		List<Pessoa> pessoas = new ArrayList<>();
		List<Produto> produtos = new ArrayList<Produto>();
		
		Produto produto = new Produto(
				"Abacate",
				2.5,
				35,
				2.5 * 35
				);
		produtos.add(produto);

		PessoaController pessoaController = new PessoaController();
		ProdutoController produtoController = new ProdutoController();

		boolean sair = false;

		do {
			menu();

			int opcao = pessoaController.leopcao();
			switch (opcao) {
			case 1:
				pessoas.add(pessoaController.cadastrarPessoa());
				break;

			case 2:
				pessoaController.ListarPessoas(pessoas);
				break;
				
			case 3:
				produtos.add(produtoController.cadastrarProduto());
				break;
				
			case 4:
				produtoController.ListarProdutos(produtos);
				break;
				
			case 5:
				produtoController.editarProduto(produtos);
				break;
				
			case 6:
				produtoController.excluirProduto(produtos);
				break;
				
			case 7:
				pessoaController.editarPessoa(pessoas);
				break;
				
			case 8:
				pessoaController.excluirPessoa(pessoas);
				break;
				
			case 9:
				sair = true;
				break;

			default:
				System.out.println("Opção Inválida!");
				break;
			}
		} while (!sair);

		System.out.println("Sistema finalizado!");

	}
	
	public static void menu() {
		System.out.println("\n--- MENU ---");
		System.out.println("1) Cadastrar Pessoa");
		System.out.println("2) Listar Pessoas Cadastradas");
		System.out.println("3) Cadastrar Produto");
		System.out.println("4) Listar Produtos");
		System.out.println("5) Editar produto");
		System.out.println("6) Excluir produto");
		System.out.println("7) Editar pessoa");
		System.out.println("8) Excluir pessoa");
		System.out.println("9) Sair do Sistema");
		System.out.println("------------------");
	}

}
