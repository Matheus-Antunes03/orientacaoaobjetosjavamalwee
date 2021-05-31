package br.com.senai.exemplo;

public class ProgramaPricipalCarro {

	public static void main(String[] args) {
		
		Carro carro1 = new Carro();
		Carro carro2 = new Carro();
		Carro carro3 = new Carro();
		Carro carro4 = new Carro();
		Carro carro5 = new Carro();
		
		carro1.setAno(2021);
		carro1.setMarca("Tesla");
		carro1.setModelo("AE1500");
		carro1.setQtdPortas(4);
		
		carro2.setAno(2020);
		carro2.setMarca("Ford");
		carro2.setModelo("YH5000");
		carro2.setQtdPortas(4);
		
		carro3.setAno(2019);
		carro3.setMarca("Ferrari");
		carro3.setModelo("47B");
		carro3.setQtdPortas(4);
		
		carro4.setAno(2018);
		carro4.setMarca("Chevrolet");
		carro4.setModelo("TH6000");
		carro4.setQtdPortas(3);
		
		carro5.setAno(2017);
		carro5.setMarca("Fiat");
		carro5.setModelo("FT3000");
		carro5.setQtdPortas(2);
		
		System.out.println("--- CARRO 1 ---");
		System.out.println("Ano: " + carro1.getAno());
		System.out.println("Marca: " + carro1.getMarca());
		System.out.println(carro1.getModelo());
		System.out.println(carro1.getQtdPortas());
		System.out.println("-----------------");
		System.out.println(" ");
		
		System.out.println("--- CARRO 2 ---");
		System.out.println("Ano: " + carro2.getAno());
		System.out.println("Marca: " + carro2.getMarca());
		System.out.println(carro2.getModelo());
		System.out.println(carro2.getQtdPortas());
		System.out.println("-----------------");
		System.out.println(" ");
		
		System.out.println("--- CARRO 3 ---");
		System.out.println("Ano: " + carro3.getAno());
		System.out.println("Marca: " + carro3.getMarca());
		System.out.println(carro3.getModelo());
		System.out.println(carro3.getQtdPortas());
		System.out.println("-----------------");
		System.out.println(" ");
		
		System.out.println("--- CARRO 4 ---");
		System.out.println("Ano: " + carro4.getAno());
		System.out.println("Marca: " + carro4.getMarca());
		System.out.println(carro4.getModelo());
		System.out.println(carro4.getQtdPortas());
		System.out.println("-----------------");
		System.out.println(" ");
		
		System.out.println("--- CARRO 5 ---");
		System.out.println("Ano: " + carro5.getAno());
		System.out.println("Marca: " + carro5.getMarca());
		System.out.println(carro5.getModelo());
		System.out.println(carro5.getQtdPortas());
		System.out.println("-----------------");
		System.out.println(" ");
	}

}
