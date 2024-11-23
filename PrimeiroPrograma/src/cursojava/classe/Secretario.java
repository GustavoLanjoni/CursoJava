package cursojava.classe;

public class Secretario extends Pessoa {

	private String Registro;
	private String NivelCargo;
	private String Experiencia;

	
	
	// Getters e Setters
	public String getRegistro() {
		return Registro;
	}

	public void setRegistro(String registro) {
		Registro = registro;
	}

	public String getNivelCargo() {
		return NivelCargo;
	}

	public void setNivelCargo(String nivelCargo) {
		NivelCargo = nivelCargo;
	}

	public String getExperiencia() {
		return Experiencia;
	}

	public void setExperiencia(String experiencia) {
		Experiencia = experiencia;
	}

}
