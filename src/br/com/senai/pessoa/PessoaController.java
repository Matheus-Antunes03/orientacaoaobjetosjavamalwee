package br.com.senai.pessoa;

import java.util.List;
import java.util.Scanner;

public class PessoaController {

	private Scanner tec;
	
	public PessoaController() {
		tec = new Scanner(System.in);
	}
	
	public int leopcao() {
		System.out.print("> ");
		return tec.nextInt();
	}
	
	public Pessoa cadastrarPessoa() {
		Pessoa pessoa = new Pessoa();
		
		System.out.println("--- CADASTRAR PESSOA ---");
		System.out.print("Informe o nome: ");
		tec.nextLine();
		pessoa.setNome(tec.nextLine());
		
		System.out.print("Informe o ano de nascimento: ");
		pessoa.setAnoDeNascimento(tec.nextInt());
		
		System.out.print("Informe a altura: ");
		pessoa.setAltura(tec.nextDouble());
		
		System.out.print("Informe o país: ");
		tec.nextLine();
		pessoa.setNomeDoPais(tec.nextLine());
		
		System.out.print("Informe a sigla do país: ");
		pessoa.setSiglaDoPais(tec.nextLine());
		
		System.out.print("Informe o estado: ");
		pessoa.setNomeDoEstado(tec.nextLine());
		
		System.out.print("Informe a sigla do estado: ");
		pessoa.setUf(tec.nextLine());
		
		System.out.print("Informe o nome da cidade: ");
		pessoa.setNomeDaCidade(tec.nextLine());
		
		System.out.print("Informe o nome do bairro: ");
		pessoa.setNomeDoBairro(tec.nextLine());
		
		System.out.print("Informe o nome da rua: ");
		pessoa.setNomeDaRua(tec.nextLine());
		
		System.out.print("Informe um complemento: ");
		pessoa.setComplemento(tec.nextLine());
		
		System.out.print("Informe o número da casa: ");
		pessoa.setNumero(tec.nextLine());
		
		
		return pessoa;
	}
	
	public List<Pessoa> ListarPessoas(List<Pessoa> pessoas){
		
		System.out.println("--- PESSOAS CADASTRADAS ---");
		
		System.out.printf("| %12s | %4s | %5s | %6s | %10s | %13s | %15s | %4s | %15s | %15s | %20s | %17s | %6s |\n",
				"Nome", "Ano", "Idade", "Altura", "País", "Sigla do País", "Estado", "UF", "Cidade", 
				"Bairro", "Rua", "Complemento", "Número");
		
			for(int i = 0; i < pessoas.size(); i++) {
			System.out.printf("| %12s | %4d | %5d | %6.2f | %10s | %13s | %15s | %4s | %15s | %15s | %20s | %17s | %6s |\n",
					pessoas.get(i).getNome(),
					pessoas.get(i).getAnoDeNascimento(),
					pessoas.get(i).getIdade(),
					pessoas.get(i).getAltura(),
					pessoas.get(i).getNomeDoPais(),
					pessoas.get(i).getSiglaDoPais(),
					pessoas.get(i).getNomeDoEstado(),
					pessoas.get(i).getUf(),
					pessoas.get(i).getNomeDaCidade(),
					pessoas.get(i).getNomeDoBairro(),
					pessoas.get(i).getNomeDaRua(),
					pessoas.get(i).getComplemento(),
					pessoas.get(i).getNumero());
		}
		return pessoas;
	}

}
