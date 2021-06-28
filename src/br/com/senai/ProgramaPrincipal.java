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
		System.out.println("\n--------- MENU ---------");
		System.out.println("1) Registro de Pessoas");
		System.out.println("2) Registro de Produtos");
		System.out.println("3) Registro de Vendas");
		System.out.println("0) Sair do Sistema");
		System.out.println("------------------------");
		int opcao = pessoaController.leopcao();
	switch (opcao) {
	case 1:
		pessoaController.menu1(pessoas);
		break;
	case 2:
		produtoController.menu2(produtos);
		break;
		
	case 3:
		vendaController.menu3(produtos, pessoas);
		break;
		
	case 0:
		sair = true;
		break;
		
	default:
		System.out.println("Opção Inválida!");
		break;
	}
	} while(!sair);
	System.out.println("Sistema encerrado!");
}
}
