package br.com.senai.produto;

import java.util.List;
import java.util.Scanner;

import br.com.senai.pessoa.Pessoa;

public class ProdutoController {
	
	private Scanner tec;
	
	public ProdutoController() {
		tec = new Scanner(System.in);
	}
	
	public Produto cadastrarProduto() {
		Produto produto = new Produto();
		
		System.out.println("--- CADASTRAR PRODUTO ---");
		System.out.print("Informe o nome do produto: ");
		produto.setNomeDoProduto(tec.next());
		
		System.out.print("Informe o valor unit�rio do produto: R$");
		produto.setValorUnitarioDoProduto(tec.nextDouble());
		
		System.out.print("Informe a quantidade do produto: ");
		produto.setQuantidadeDoProduto(tec.nextInt());
		
		produto.setValorTotalDoProduto(produto.getValorUnitarioDoProduto() * produto.getQuantidadeDoProduto());
		
		return produto;
	}
	
	public List<Produto> ListarProdutos(List<Produto> produtos){
		
		System.out.println("--- PRODUTOS CADASTRADOS ---");
		
		System.out.printf("| %2s | %15s | %8s | %10s | %13s |\n", "Id", "Produto", "Valor", "Quantidade", "Valor Total");
		
		for(int i = 0; i < produtos.size(); i++) {
			System.out.printf("| %2d | %15s | R$%6.2f | %10s | R$%11.2f |\n",
					i,
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
		
		System.out.print("Informe o Id do produto para editar: ");
		int idProduto = tec.nextInt();
		
		System.out.println("1) Nome do produto");
		System.out.println("2) Quantidade de produto");
		System.out.println("3) Valor unit�rio do produto");		
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
			
			produtos.set(idProduto,  produto);
			break;
			
		case 2:
			System.out.println("--- EDITAR A QUANTIDADE DE PRODUTO");
			System.out.println("Informe a nova quanridade do produto: ");
			produto.setQuantidadeDoProduto(tec.nextInt());
			
			produto.setNomeDoProduto(produtos.get(idProduto).getNomeDoProduto());
			produto.setValorUnitarioDoProduto(produtos.get(idProduto).getValorUnitarioDoProduto());
			produto.setValorTotalDoProduto(produtos.get(idProduto).getValorTotalDoProduto());
			
			produtos.set(idProduto, produto);
			break;
			
		case 3:
			System.out.println("--- EDITAR O VALOR UNIT�RIO DO PRODUTO ---");
			System.out.println("Informe o novo valor do produto: ");
			produto.setValorUnitarioDoProduto(tec.nextDouble());
			
			produto.setNomeDoProduto(produtos.get(idProduto).getNomeDoProduto());
			produto.setQuantidadeDoProduto(produtos.get(idProduto).getQuantidadeDoProduto());
			produto.setValorTotalDoProduto(produtos.get(idProduto).getValorTotalDoProduto());
			
			break;
			
		default:
			System.out.println("Op��o inv�lida!");
			break;
		}
		
		return produtos;
	}
	
}