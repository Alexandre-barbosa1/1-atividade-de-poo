package br.edu.ifs.academico;

public class Cachorro extends Animal {
	private String raca;
	private double tamanho;
	private int nivelEnergia;
	private boolean obediente;
	private boolean habilidadeGuarda;

	public String getRaca() {
		return raca;
	}

	public void setRaca(String raca) {
		this.raca = raca;
	}

	public double getTamanho() {
		return tamanho;
	}

	public void setTamanho(double tamanho) {
		this.tamanho = tamanho;
	}

	public int getNivelEnergia() {
		return nivelEnergia;
	}

	public void setNivelEnergia(int nivelEnergia) {
		this.nivelEnergia = nivelEnergia;
	}

	public boolean isObediente() {
		return obediente;
	}

	public void setObediente(boolean obediente) {
		this.obediente = obediente;
	}

	public boolean isHabilidadeGuarda() {
		return habilidadeGuarda;
	}

	public void setHabilidadeGuarda(boolean habilidadeGuarda) {
		this.habilidadeGuarda = habilidadeGuarda;
	}

}
