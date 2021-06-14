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
		produto.setNomeDoProduto(tec.nextLine());
		
		System.out.print("Informe o valor unitário do produto: ");
		produto.setValorUnitarioDoProduto(tec.nextDouble());
		
		System.out.print("Informe a quantidade do produto: ");
		produto.setQuantidadeDoProduto(tec.nextInt());
		
		produto.setValorTotalDoProduto(produto.getValorUnitarioDoProduto() * produto.getQuantidadeDoProduto());
		
		return produto;
	}
	
	public List<Produto> ListarProdutos(List<Produto> produtos){
		
		System.out.println("--- PRODUTOS CADASTRADOS ---");
		
		System.out.printf("| %15s | %6s | %10s | %11s |\n", "Nome", "Valor", "Quantidade", "Valor Total");
		
		for(int i = 0; i < produtos.size(); i++) {
			System.out.printf("| %15s | %6.2f | %10s | %11.2f |\n",
					produtos.get(i).getNomeDoProduto(),
					produtos.get(i).getValorUnitarioDoProduto(),
					produtos.get(i).getQuantidadeDoProduto(),
					produtos.get(i).getValorTotalDoProduto());
		}
		
		return produtos;
	}
	
	
	
}
