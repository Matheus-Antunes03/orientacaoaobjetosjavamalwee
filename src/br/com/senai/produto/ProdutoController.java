package br.com.senai.produto;

import java.util.List;
import java.util.Scanner;

import br.com.senai.pessoa.Pessoa;
import br.com.senai.pessoa.PessoaController;

public class ProdutoController {
	
	private Scanner tec;
	
	public ProdutoController() {
		tec = new Scanner(System.in);
	}
	
	public int leopcao() {
		System.out.print("> ");
		return tec.nextInt();
	}
		
	public Produto cadastrarProduto() {
		Produto produto = new Produto();
		
		System.out.println("--- CADASTRAR PRODUTO ---");
		System.out.print("Informe o nome do produto: ");
		produto.setNomeDoProduto(tec.next());
		
		System.out.print("Informe o valor unitário do produto: R$");
		produto.setValorUnitarioDoProduto(tec.nextDouble());
		
		System.out.print("Informe a quantidade do produto: ");
		produto.setQuantidadeDoProduto(tec.nextInt());
		
		produto.setValorTotalDoProduto(produto.getValorUnitarioDoProduto() * produto.getQuantidadeDoProduto());
		
		return produto;
	}
	
	public List<Produto> ListarProdutos(List<Produto> produtos){
		
		if(produtos.isEmpty()) {
			System.out.println("Não possui produtos cadastrados.");
			return null;
		}
		
		System.out.println("--- PRODUTOS CADASTRADOS ---");
		
		System.out.printf("| %2s | %15s | %8s | %10s | %13s |\n", "Id", "Produto", "Valor", "Quantidade", "Valor Total");
		
		for(int i = 0; i < produtos.size(); i++) {
			System.out.printf("| %2d | %15s | R$%6.2f | %10s | R$%11.2f |\n",
					i + 1,
					produtos.get(i).getNomeDoProduto(),
					produtos.get(i).getValorUnitarioDoProduto(),
					produtos.get(i).getQuantidadeDoProduto(),
					produtos.get(i).getValorTotalDoProduto());
		}
		
		return produtos;
	}
	
	public List<Produto> editarProduto(List<Produto> produtos) {
		
		Produto produto = new Produto();
		
		ListarProdutos(produtos);
		
		if(produtos.isEmpty()) {
			return null;
		}
		
		System.out.print("Informe o Id do produto para editar: ");
		int idProduto = tec.nextInt() - 1;
		
		System.out.println("1) Nome do produto");
		System.out.println("2) Quantidade de produto");
		System.out.println("3) Valor unitário do produto");		
		System.out.print("Informe o campo que deseja alterar: ");
		int opcao = tec.nextInt();
		
		switch (opcao) {
		
		case 1:
			System.out.println("--- EDITAR O NOME DO PRODUTO ---");
			System.out.print("Informe o novo nome do produto: ");
			produto.setNomeDoProduto(tec.next());
			
			produto.setQuantidadeDoProduto(produtos.get(idProduto).getQuantidadeDoProduto());
			produto.setValorUnitarioDoProduto(produtos.get(idProduto).getValorUnitarioDoProduto());
			produto.setValorTotalDoProduto(produtos.get(idProduto).getValorTotalDoProduto());
			
			produtos.set(idProduto, produto);
			break;
			
		case 2:
			System.out.println("--- EDITAR A QUANTIDADE DE PRODUTO ---");
			System.out.print("Informe a nova quantidade do produto: ");
			produto.setQuantidadeDoProduto(tec.nextInt());
			
			produto.setNomeDoProduto(produtos.get(idProduto).getNomeDoProduto());
			produto.setValorUnitarioDoProduto(produtos.get(idProduto).getValorUnitarioDoProduto());
			produto.setValorTotalDoProduto(produto.getValorUnitarioDoProduto() * produto.getQuantidadeDoProduto());
			
			produtos.set(idProduto, produto);
			break;
			
		case 3:
			System.out.println("--- EDITAR O VALOR UNITÁRIO DO PRODUTO ---");
			System.out.print("Informe o novo valor do produto: ");
			produto.setValorUnitarioDoProduto(tec.nextDouble());
			
			produto.setNomeDoProduto(produtos.get(idProduto).getNomeDoProduto());
			produto.setQuantidadeDoProduto(produtos.get(idProduto).getQuantidadeDoProduto());
			produto.setValorTotalDoProduto(produto.getValorUnitarioDoProduto() * produto.getQuantidadeDoProduto());
			
			produtos.set(idProduto, produto);
			break;
			
		default:
			System.out.println("Opção inválida!");
			break;
		}
		
		return produtos;
	}
	
	public void excluirProduto(List<Produto> produtos) {
		
		ListarProdutos(produtos);
		
		if(produtos.isEmpty()) {
			return;
		}
		
		System.out.println("--- EXCLUIR PRODUTO ---");
		
		System.out.print("Informe o Id do produto para excluir: ");
		int idProduto = tec.nextInt() - 1;
		if(produtos.size() <= idProduto) {
			System.out.println("Produto não cadastrado");
			return;
		}
		
		produtos.remove(idProduto);
	}
	
	public void menu2(List <Produto> produtos) {

		boolean sair = false;
		do {
			System.out.println("\n------- MENU -------");
			System.out.println("1) Cadastrar Produto");
			System.out.println("2) Listar Produtos");
			System.out.println("3) Editar Produto");
			System.out.println("4) Excluir Produto");
			System.out.println("0) Voltar");
			System.out.println("--------------------");
			int opcao = leopcao();
			switch (opcao) {
			case 1:
				produtos.add(cadastrarProduto());
				 break;
				 
			case 2:
				ListarProdutos(produtos);
				break;
				
			case 3:
				editarProduto(produtos);
				break;
				
			case 4:
				excluirProduto(produtos);
				break;
				
			case 0:
				sair = true;
				break;
				
			default:
				System.out.println("Opção Inválida!");
				break;
			}
	}while (!sair);
	}
}
