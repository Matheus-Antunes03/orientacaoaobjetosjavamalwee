package br.com.senai.endereco;

public class Endereco extends Cidade {

	private String nomeDoBairro;
	private String nomeDaRua;
	private String complemento;
	private String numero;

	public String getNomeDoBairro() {
		return nomeDoBairro;
	}

	public void setNomeDoBairro(String nomeDoBairro) {
		this.nomeDoBairro = nomeDoBairro;
	}

	public String getNomeDaRua() {
		return nomeDaRua;
	}

	public void setNomeDaRua(String nomeDaRua) {
		this.nomeDaRua = nomeDaRua;
	}

	public String getComplemento() {
		return complemento;
	}

	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

}
