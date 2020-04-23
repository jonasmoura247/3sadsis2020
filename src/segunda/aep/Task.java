package segunda.aep;

public class Task {
	private String nomeMonstro;
	private int quantidadeDeMonstros;
	private boolean completada;

	public Task(String nomeMonstro, int quantidadeDeMonstros) {
		setNomeMonstro(nomeMonstro);
		setQuantidadeDeMonstros(quantidadeDeMonstros);
		this.completada = false;
		
	}

	public void setNomeMonstro(String nomeMonstro) {
		this.nomeMonstro = nomeMonstro;
	}

	public String getNomeMonstro() {
		return nomeMonstro;
	}

	public void setQuantidadeDeMonstros(int quantidadeDeMonstros) {
		this.quantidadeDeMonstros = quantidadeDeMonstros;
	}

	public int getQuantidadeDeMonstros() {
		return quantidadeDeMonstros;
	}

	
	private boolean getCompletada() {
		return this.completada;	
	}
	
	public boolean verificarCompletada(String nomeMonstro, int quantidadeDeMonstro) {
		if (quantidadeDeMonstro >= getQuantidadeDeMonstros())
			this.completada = true;
		return false;
	}
	
	public void finalizarTask() {
		if (!this.completada)
				throw new RuntimeException("Você não fez a quantidade necessária");
		System.out.println("Task finalizada com sucesso");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
