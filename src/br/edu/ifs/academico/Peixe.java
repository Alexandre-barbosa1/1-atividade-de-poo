package br.edu.ifs.academico;

public class Peixe extends Animal {
	private String cor;
	private String tipoDeBarbatana;
	private double tamanho;
	private double velocidade;

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public String getTipoDeBarbatana() {
		return tipoDeBarbatana;
	}

	public void setTipoDeBarbatana(String tipoDeBarbatana) {
		this.tipoDeBarbatana = tipoDeBarbatana;
	}

	public double getTamanho() {
		return tamanho;
	}

	public void setTamanho(double tamanho) {
		this.tamanho = tamanho;
	}

	public double getVelocidade() {
		return velocidade;
	}

	public void setVelocidade(double velocidade) {
		this.velocidade = velocidade;
	}

}
