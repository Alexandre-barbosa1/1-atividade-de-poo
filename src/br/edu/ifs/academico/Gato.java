package br.edu.ifs.academico;

public class Gato extends Animal {
	private String raca;
	private String corDoPelo;
	private String comportamento;
	private boolean habilidadeCaca;
	private int quantidadeDeRonronar;

	public String getRaca() {
		return raca;
	}

	public void setRaca(String raca) {
		this.raca = raca;
	}

	public String getCorDoPelo() {
		return corDoPelo;
	}

	public void setCorDoPelo(String corDoPelo) {
		this.corDoPelo = corDoPelo;
	}

	public String getComportamento() {
		return comportamento;
	}

	public void setComportamento(String comportamento) {
		this.comportamento = comportamento;
	}

	public boolean isHabilidadeCaca() {
		return habilidadeCaca;
	}

	public void setHabilidadeCaca(boolean habilidadeCaca) {
		this.habilidadeCaca = habilidadeCaca;
	}

	public int getQuantidadeDeRonronar() {
		return quantidadeDeRonronar;
	}

	public void setQuantidadeDeRonronar(int quantidadeDeRonronar) {
		this.quantidadeDeRonronar = quantidadeDeRonronar;
	}

}
