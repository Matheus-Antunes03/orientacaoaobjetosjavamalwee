package br.com.senai.exemplo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProgramaPrincipal {
	public static void main(String[] args) {
		
		Pessoa pessoa1 = new Pessoa();
		Pessoa pessoa2 = new Pessoa();
		Pessoa pessoa3 = new Pessoa();
		Pessoa pessoa4 = new Pessoa();
		
		List<Pessoa> pessoas = new ArrayList<Pessoa>();
		
		pessoa1.setNome("Matheus");
		pessoa1.setAnoDeNascimento(2003);
		pessoa1.setSexo("M");
		
		pessoa2.setNome("Laisa");
		pessoa2.setAnoDeNascimento(2003);
		pessoa2.setSexo("F");
		
		pessoa3.setNome("Lucas");
		pessoa3.setAnoDeNascimento(2009);
		pessoa3.setSexo("M");
		
		pessoa4.setNome("Arthur");
		pessoa4.setAnoDeNascimento(2019);
		pessoa4.setSexo("M");
		
		pessoas.add(pessoa1);
		pessoas.add(pessoa2);
		pessoas.add(pessoa3);
		pessoas.add(pessoa4);
		
		System.out.println("--- PESSOAS CADASTRADAS (FOR) ---");
		for(int i = 0; i < pessoas.size(); i++) {
			System.out.println(pessoas.get(i));
			System.out.println("---------------------------------");
		}
		
		System.out.println("--- PESSOAS CADASTRADAS (FOR EACH) ---");
		for(Pessoa people : pessoas) {
			System.out.println(people);
			System.out.println("--------------------------------------");
		}
			
		System.out.println("--- PESSOAS CADASTRADAS (FOR EACH LAMBDA) ---");
		pessoas.forEach(aluno -> {
			System.out.println(aluno);
			System.out.println("---------------------------------------------");
	});
		
		Scanner tec = new Scanner(System.in);
		MetodoController metodoController = new MetodoController();
		
		System.out.println("--- TABUADA ---");
		
		metodoController.multiplicar();
		
		System.out.println("--- SOMA DE DOIS VALORES ---");
		System.out.println("A soma dá: " + metodoController.somar());
		
		System.out.println("--- SUBTRAÇÃO DE VALORES por parâmetro ---");
		System.out.print("Informe o primeiro valor: ");
		int valor1 = tec.nextInt();
		System.out.print("Informe o segundo valor: ");
		int valor2 = tec.nextInt();
		
		System.out.println("A subtração dá: " + metodoController.subtrair(valor1, valor2));
	}
}
