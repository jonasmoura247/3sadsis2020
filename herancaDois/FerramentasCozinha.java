package herancaDois;

public class FerramentasCozinha {
	private String uso;
	private String armazenamento;

	public FerramentasCozinha(String uso, String armazenamento) {
		this.armazenamento = armazenamento;
		this.uso = uso;
	}

	public String getArmazenamento() {
		return armazenamento;
	}

	public String getUso() {
		return uso;
	}
}
