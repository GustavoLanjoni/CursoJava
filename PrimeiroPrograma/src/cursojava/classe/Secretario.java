package cursojava.classe;

public class Secretario extends Pessoa {

	private String registro;
	private String nivelCargo;
	private String experiencia;

	
	
	// Getters e Setters
	public String getRegistro() {
		return registro;
	}

	public void setRegistro(String registro) {
		registro = registro;
	}

	public String getNivelCargo() {
		return nivelCargo;
	}

	public void setNivelCargo(String nivelCargo) {
		nivelCargo = nivelCargo;
	}

	public String getExperiencia() {
		return experiencia;
	}

	public void setExperiencia(String experiencia) {
		experiencia = experiencia;
	}

	//toString
	@Override
	public String toString() {
		return "Secretario [registro=" + registro + ", nivelCargo=" + nivelCargo + ", experiencia=" + experiencia
				+ ", nome=" + nome + ", idade=" + idade + ", registoGeral=" + registoGeral + ", numeroCpf=" + numeroCpf
				+ ", dataNascimento=" + dataNascimento + ", nomeMae=" + nomeMae + ", nomePai=" + nomePai + "]";
	}

	
	
	
}
