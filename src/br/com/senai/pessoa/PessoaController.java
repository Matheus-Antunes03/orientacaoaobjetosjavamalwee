package br.com.senai.pessoa;

import java.util.List;
import java.util.Scanner;

import br.com.senai.pessoa.Pessoa;
import br.com.senai.ProgramaPrincipal;
import br.com.senai.produto.Produto;

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
		
		if(pessoas.isEmpty()) {
			System.out.println("Não possui dados para listar.");
			return null;
		}
		
		System.out.println("--- PESSOAS CADASTRADAS ---");
		
		System.out.printf("| %2s | %12s | %4s | %5s | %6s | %10s | %13s | %15s | %4s | %15s | %15s | %20s | %17s | %6s |\n",
				"Id", "Nome", "Ano", "Idade", "Altura", "País", "Sigla do País", "Estado", "UF", "Cidade", 
				"Bairro", "Rua", "Complemento", "Número");
		
			for(int i = 0; i < pessoas.size(); i++) {
			System.out.printf("| %2s | %12s | %4d | %5d | %6.2f | %10s | %13s | %15s | %4s | %15s | %15s | %20s | %17s | %6s |\n",
					i + 1,
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
	
	public List<Pessoa> editarPessoa(List<Pessoa> pessoas) {
		
		Pessoa pessoa = new Pessoa();
		
		ListarPessoas(pessoas);
		
		if(pessoas.isEmpty()) {
			return null;
		}
		
		System.out.print("Informe o Id da pessoa para editar: ");
		int idPessoa = tec.nextInt() - 1;
		
		System.out.println("1) Nome");
		System.out.println("2) Ano de Nascimento");
		System.out.println("3) Altura");
		System.out.println("4) País");
		System.out.println("5) Sigla do país");
		System.out.println("6) Estado");
		System.out.println("7) Sigla do estado");
		System.out.println("8) Cidade");
		System.out.println("9) Bairro");
		System.out.println("10) Rua");
		System.out.println("11) Complemento");
		System.out.println("12) Número da casa");
		System.out.print("Informe o campo que deseja alterar: ");
		int opcao = tec.nextInt();
		
		switch (opcao) {
		
		case 1:
			System.out.println("--- EDITAR O NOME ---");
			System.out.print("Informe o novo nome: ");
			pessoa.setNome(tec.next());
		
			pessoa.setAnoDeNascimento(pessoas.get(idPessoa).getAnoDeNascimento());
			pessoa.setAltura(pessoas.get(idPessoa).getAltura());
			pessoa.setNomeDoPais(pessoas.get(idPessoa).getNomeDoPais());
			pessoa.setSiglaDoPais(pessoas.get(idPessoa).getSiglaDoPais());
			pessoa.setNomeDoEstado(pessoas.get(idPessoa).getNomeDoEstado());
			pessoa.setUf(pessoas.get(idPessoa).getUf());
			pessoa.setNomeDaCidade(pessoas.get(idPessoa).getNomeDaCidade());
			pessoa.setNomeDoBairro(pessoas.get(idPessoa).getNomeDoBairro());
			pessoa.setNomeDaRua(pessoas.get(idPessoa).getNomeDaRua());
			pessoa.setComplemento(pessoas.get(idPessoa).getComplemento());
			pessoa.setNumero(pessoas.get(idPessoa).getNumero());
			
			pessoas.set(idPessoa, pessoa);
			break;
		case 2:
			System.out.println("--- EDITAR O ANO DE NASCIMENTO ---");
			System.out.print("Informe a nova data de nascimento: ");
			pessoa.setAnoDeNascimento(tec.nextInt());
			
			pessoa.setNome(pessoas.get(idPessoa).getNome());
			pessoa.setAltura(pessoas.get(idPessoa).getAltura());
			pessoa.setNomeDoPais(pessoas.get(idPessoa).getNomeDoPais());
			pessoa.setSiglaDoPais(pessoas.get(idPessoa).getSiglaDoPais());
			pessoa.setNomeDoEstado(pessoas.get(idPessoa).getNomeDoEstado());
			pessoa.setUf(pessoas.get(idPessoa).getUf());
			pessoa.setNomeDaCidade(pessoas.get(idPessoa).getNomeDaCidade());
			pessoa.setNomeDoBairro(pessoas.get(idPessoa).getNomeDoBairro());
			pessoa.setNomeDaRua(pessoas.get(idPessoa).getNomeDaRua());
			pessoa.setComplemento(pessoas.get(idPessoa).getComplemento());
			pessoa.setNumero(pessoas.get(idPessoa).getNumero());
			
			pessoas.set(idPessoa, pessoa);
			break;
			
		case 3:
			System.out.println("--- EDITAR A ALTURA ---");
			System.out.print("Informe a nova altura: ");
			pessoa.setAltura(tec.nextInt());
			
			pessoa.setNome(pessoas.get(idPessoa).getNome());
			pessoa.setAnoDeNascimento(pessoas.get(idPessoa).getAnoDeNascimento());
			pessoa.setNomeDoPais(pessoas.get(idPessoa).getNomeDoPais());
			pessoa.setSiglaDoPais(pessoas.get(idPessoa).getSiglaDoPais());
			pessoa.setNomeDoEstado(pessoas.get(idPessoa).getNomeDoEstado());
			pessoa.setUf(pessoas.get(idPessoa).getUf());
			pessoa.setNomeDaCidade(pessoas.get(idPessoa).getNomeDaCidade());
			pessoa.setNomeDoBairro(pessoas.get(idPessoa).getNomeDoBairro());
			pessoa.setNomeDaRua(pessoas.get(idPessoa).getNomeDaRua());
			pessoa.setComplemento(pessoas.get(idPessoa).getComplemento());
			pessoa.setNumero(pessoas.get(idPessoa).getNumero());
			
			pessoas.set(idPessoa, pessoa);
			break;
			
		case 4:
			System.out.println("--- EDITAR O PAÍS ---");
			System.out.print("Informe o novo país: ");
			pessoa.setNomeDoPais(tec.next());
			
			pessoa.setNome(pessoas.get(idPessoa).getNome());
			pessoa.setAnoDeNascimento(pessoas.get(idPessoa).getAnoDeNascimento());
			pessoa.setAltura(pessoas.get(idPessoa).getAltura());
			pessoa.setSiglaDoPais(pessoas.get(idPessoa).getSiglaDoPais());
			pessoa.setNomeDoEstado(pessoas.get(idPessoa).getNomeDoEstado());
			pessoa.setUf(pessoas.get(idPessoa).getUf());
			pessoa.setNomeDaCidade(pessoas.get(idPessoa).getNomeDaCidade());
			pessoa.setNomeDoBairro(pessoas.get(idPessoa).getNomeDoBairro());
			pessoa.setNomeDaRua(pessoas.get(idPessoa).getNomeDaRua());
			pessoa.setComplemento(pessoas.get(idPessoa).getComplemento());
			pessoa.setNumero(pessoas.get(idPessoa).getNumero());
			
			pessoas.set(idPessoa, pessoa);
			break;
	
		case 5:
			System.out.println("--- EDITAR A SIGLA DO PAÍS ---");
			System.out.print("Informe a nova sigla do país: ");
			pessoa.setSiglaDoPais(tec.next());
			
			pessoa.setNome(pessoas.get(idPessoa).getNome());
			pessoa.setAnoDeNascimento(pessoas.get(idPessoa).getAnoDeNascimento());
			pessoa.setAltura(pessoas.get(idPessoa).getAltura());
			pessoa.setNomeDoPais(pessoas.get(idPessoa).getNomeDoPais());
			pessoa.setNomeDoEstado(pessoas.get(idPessoa).getNomeDoEstado());
			pessoa.setUf(pessoas.get(idPessoa).getUf());
			pessoa.setNomeDaCidade(pessoas.get(idPessoa).getNomeDaCidade());
			pessoa.setNomeDoBairro(pessoas.get(idPessoa).getNomeDoBairro());
			pessoa.setNomeDaRua(pessoas.get(idPessoa).getNomeDaRua());
			pessoa.setComplemento(pessoas.get(idPessoa).getComplemento());
			pessoa.setNumero(pessoas.get(idPessoa).getNumero());
			
			pessoas.set(idPessoa, pessoa);
			break;
	
		case 6:
			System.out.println("--- EDITAR O ESTADO ---");
			System.out.print("Informe o novo estado: ");
			pessoa.setNomeDoEstado(tec.next());
			
			pessoa.setNome(pessoas.get(idPessoa).getNome());
			pessoa.setAnoDeNascimento(pessoas.get(idPessoa).getAnoDeNascimento());
			pessoa.setAltura(pessoas.get(idPessoa).getAltura());
			pessoa.setNomeDoPais(pessoas.get(idPessoa).getNomeDoPais());
			pessoa.setSiglaDoPais(pessoas.get(idPessoa).getSiglaDoPais());
			pessoa.setUf(pessoas.get(idPessoa).getUf());
			pessoa.setNomeDaCidade(pessoas.get(idPessoa).getNomeDaCidade());
			pessoa.setNomeDoBairro(pessoas.get(idPessoa).getNomeDoBairro());
			pessoa.setNomeDaRua(pessoas.get(idPessoa).getNomeDaRua());
			pessoa.setComplemento(pessoas.get(idPessoa).getComplemento());
			pessoa.setNumero(pessoas.get(idPessoa).getNumero());
			
			pessoas.set(idPessoa, pessoa);
			break;
	
		case 7:
			System.out.println("--- EDITAR A SIGLA DO ESTADO ---");
			System.out.print("Informe a nova sigla do estado: ");
			pessoa.setUf(tec.next());
			
			pessoa.setNome(pessoas.get(idPessoa).getNome());
			pessoa.setAnoDeNascimento(pessoas.get(idPessoa).getAnoDeNascimento());
			pessoa.setAltura(pessoas.get(idPessoa).getAltura());
			pessoa.setNomeDoPais(pessoas.get(idPessoa).getNomeDoPais());
			pessoa.setSiglaDoPais(pessoas.get(idPessoa).getSiglaDoPais());
			pessoa.setNomeDoEstado(pessoas.get(idPessoa).getNomeDoEstado());
			pessoa.setNomeDaCidade(pessoas.get(idPessoa).getNomeDaCidade());
			pessoa.setNomeDoBairro(pessoas.get(idPessoa).getNomeDoBairro());
			pessoa.setNomeDaRua(pessoas.get(idPessoa).getNomeDaRua());
			pessoa.setComplemento(pessoas.get(idPessoa).getComplemento());
			pessoa.setNumero(pessoas.get(idPessoa).getNumero());
			
			pessoas.set(idPessoa, pessoa);
			break;
	
		case 8:
			System.out.println("--- EDITAR A CIDADE ---");
			System.out.print("Informe a nova cidade: ");
			pessoa.setNomeDaCidade(tec.next());
			
			pessoa.setNome(pessoas.get(idPessoa).getNome());
			pessoa.setAnoDeNascimento(pessoas.get(idPessoa).getAnoDeNascimento());
			pessoa.setAltura(pessoas.get(idPessoa).getAltura());
			pessoa.setNomeDoPais(pessoas.get(idPessoa).getNomeDoPais());
			pessoa.setSiglaDoPais(pessoas.get(idPessoa).getSiglaDoPais());
			pessoa.setNomeDoEstado(pessoas.get(idPessoa).getNomeDoEstado());
			pessoa.setUf(pessoas.get(idPessoa).getUf());
			pessoa.setNomeDoBairro(pessoas.get(idPessoa).getNomeDoBairro());
			pessoa.setNomeDaRua(pessoas.get(idPessoa).getNomeDaRua());
			pessoa.setComplemento(pessoas.get(idPessoa).getComplemento());
			pessoa.setNumero(pessoas.get(idPessoa).getNumero());
			
			pessoas.set(idPessoa, pessoa);
			break;
	
		case 9:
			System.out.println("--- EDITAR O BAIRRO ---");
			System.out.print("Informe o novo bairro: ");
			pessoa.setNomeDoBairro(tec.next());
			
			pessoa.setNome(pessoas.get(idPessoa).getNome());
			pessoa.setAnoDeNascimento(pessoas.get(idPessoa).getAnoDeNascimento());
			pessoa.setAltura(pessoas.get(idPessoa).getAltura());
			pessoa.setNomeDoPais(pessoas.get(idPessoa).getNomeDoPais());
			pessoa.setSiglaDoPais(pessoas.get(idPessoa).getSiglaDoPais());
			pessoa.setNomeDoEstado(pessoas.get(idPessoa).getNomeDoEstado());
			pessoa.setUf(pessoas.get(idPessoa).getUf());
			pessoa.setNomeDaCidade(pessoas.get(idPessoa).getNomeDaCidade());
			pessoa.setNomeDaRua(pessoas.get(idPessoa).getNomeDaRua());
			pessoa.setComplemento(pessoas.get(idPessoa).getComplemento());
			pessoa.setNumero(pessoas.get(idPessoa).getNumero());
			
			pessoas.set(idPessoa, pessoa);
			break;
	
		case 10:
			System.out.println("--- EDITAR A RUA ---");
			System.out.print("Informe a nova rua: ");
			pessoa.setNomeDaRua(tec.next());
			
			pessoa.setNome(pessoas.get(idPessoa).getNome());
			pessoa.setAnoDeNascimento(pessoas.get(idPessoa).getAnoDeNascimento());
			pessoa.setAltura(pessoas.get(idPessoa).getAltura());
			pessoa.setNomeDoPais(pessoas.get(idPessoa).getNomeDoPais());
			pessoa.setSiglaDoPais(pessoas.get(idPessoa).getSiglaDoPais());
			pessoa.setNomeDoEstado(pessoas.get(idPessoa).getNomeDoEstado());
			pessoa.setUf(pessoas.get(idPessoa).getUf());
			pessoa.setNomeDaCidade(pessoas.get(idPessoa).getNomeDaCidade());
			pessoa.setNomeDoBairro(pessoas.get(idPessoa).getNomeDoBairro());
			pessoa.setComplemento(pessoas.get(idPessoa).getComplemento());
			pessoa.setNumero(pessoas.get(idPessoa).getNumero());
			
			pessoas.set(idPessoa, pessoa);
			break;
	
		case 11:
			System.out.println("--- EDITAR O COMPLEMENTO ---");
			System.out.print("Informe o novo complemento: ");
			pessoa.setComplemento(tec.next());
			
			pessoa.setNome(pessoas.get(idPessoa).getNome());
			pessoa.setAnoDeNascimento(pessoas.get(idPessoa).getAnoDeNascimento());
			pessoa.setAltura(pessoas.get(idPessoa).getAltura());
			pessoa.setNomeDoPais(pessoas.get(idPessoa).getNomeDoPais());
			pessoa.setSiglaDoPais(pessoas.get(idPessoa).getSiglaDoPais());
			pessoa.setNomeDoEstado(pessoas.get(idPessoa).getNomeDoEstado());
			pessoa.setUf(pessoas.get(idPessoa).getUf());
			pessoa.setNomeDaCidade(pessoas.get(idPessoa).getNomeDaCidade());
			pessoa.setNomeDoBairro(pessoas.get(idPessoa).getNomeDoBairro());
			pessoa.setNomeDaRua(pessoas.get(idPessoa).getNomeDaRua());
			pessoa.setNumero(pessoas.get(idPessoa).getNumero());
			
			pessoas.set(idPessoa, pessoa);
			break;
	
		case 12:
			System.out.println("--- EDITAR O NÚMERO DA CASA ---");
			System.out.print("Informe o novo número da casa: ");
			pessoa.setNumero(tec.next());
			
			pessoa.setNome(pessoas.get(idPessoa).getNome());
			pessoa.setAnoDeNascimento(pessoas.get(idPessoa).getAnoDeNascimento());
			pessoa.setAltura(pessoas.get(idPessoa).getAltura());
			pessoa.setNomeDoPais(pessoas.get(idPessoa).getNomeDoPais());
			pessoa.setSiglaDoPais(pessoas.get(idPessoa).getSiglaDoPais());
			pessoa.setNomeDoEstado(pessoas.get(idPessoa).getNomeDoEstado());
			pessoa.setUf(pessoas.get(idPessoa).getUf());
			pessoa.setNomeDaCidade(pessoas.get(idPessoa).getNomeDaCidade());
			pessoa.setNomeDoBairro(pessoas.get(idPessoa).getNomeDoBairro());
			pessoa.setNomeDaRua(pessoas.get(idPessoa).getNomeDaRua());
			pessoa.setComplemento(pessoas.get(idPessoa).getComplemento());
			
			pessoas.set(idPessoa, pessoa);
			break;
			
		default:
			System.out.println("Opção inválida!");
			break;
		}
		
		return pessoas;
		
	}
	
	public void excluirPessoa(List<Pessoa> pessoas) {
		
		ListarPessoas(pessoas);
		
		if(pessoas.isEmpty()) {
			return;
		}
		
		System.out.println("--- EXCLUIR PESSOA ---");
		
		System.out.print("Informe o Id da pessoa para excluir: ");
		int idPessoa = tec.nextInt() - 1;
		if(pessoas.size() <= idPessoa) {
			System.out.println("Pessoa não cadastrada");
			return;
		}
		
		pessoas.remove(idPessoa);
	}
	
	public void menu1(List <Pessoa> pessoas) {
		
		boolean sair = false;
		do {
			System.out.println("\n----------- MENU ------------");
		System.out.println("1) Cadastrar Pessoa");
		System.out.println("2) Listar Pessoas Cadastradas");
		System.out.println("3) Editar Pessoa");
		System.out.println("4) Excluir pessoa");
		System.out.println("0) Voltar");
		System.out.println("-----------------------------");
			
			int opcao = leopcao();
			switch (opcao) {
		case 1:
			pessoas.add(cadastrarPessoa());
			break;
			
		case 2:
			ListarPessoas(pessoas);
			break;
		
		case 3:
			editarPessoa(pessoas);
			break;
			
		case 4:
			excluirPessoa(pessoas);
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