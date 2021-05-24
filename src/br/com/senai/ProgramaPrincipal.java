package br.com.senai;

public class ProgramaPrincipal {
	public static void main(String[] args) {
		
		Pessoa aluno1 = new Pessoa();
		Pessoa aluno2 = new Pessoa();
		Pessoa aluno3 = new Pessoa();
		Pessoa aluno4 = new Pessoa();
		
		aluno1.setNome("Matheus");
		aluno1.setAnoDeNascimento(2003);
		aluno1.setSexo("M");
		
		aluno2.setNome("Laisa");
		aluno2.setAnoDeNascimento(2003);
		aluno2.setSexo("F");
		
		aluno3.setNome("Lucas");
		aluno3.setAnoDeNascimento(2009);
		aluno3.setSexo("M");
		
		aluno4.setNome("Arthur");
		aluno4.setAnoDeNascimento(2019);
		aluno4.setSexo("M");
		
		System.out.println("--- ALUNO 1 ---");
		System.out.println(aluno1.getNome());
		System.out.println(aluno1.getAnoDeNascimento());
		System.out.println(aluno1.getSexo());
		System.out.println("---------------");
		
		System.out.println("--- ALUNO 2 ---");
		System.out.println(aluno2.getNome());
		System.out.println(aluno2.getAnoDeNascimento());
		System.out.println(aluno2.getSexo());
		System.out.println("---------------");
		
		System.out.println("--- ALUNO 3 ---");
		System.out.println(aluno3.getNome());
		System.out.println(aluno3.getAnoDeNascimento());
		System.out.println(aluno3.getSexo());
		System.out.println("---------------");
		
		System.out.println("--- ALUNO 4 ---");
		System.out.println(aluno4.getNome());
		System.out.println(aluno4.getAnoDeNascimento());
		System.out.println(aluno4.getSexo());
		System.out.println("---------------");
	}
	
}
