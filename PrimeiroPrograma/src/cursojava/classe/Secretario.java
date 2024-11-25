package cursojava.classe;

import javax.swing.JOptionPane;

import cursojava.interfaces.PermitirAcesso;

public class Secretario extends Pessoa implements PermitirAcesso {

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

	// toString
	@Override
	public String toString() {
		return "Secretario [registro=" + registro + ", nivelCargo=" + nivelCargo + ", experiencia=" + experiencia
				+ ", nome=" + nome + ", idade=" + idade + ", registoGeral=" + registoGeral + ", numeroCpf=" + numeroCpf
				+ ", dataNascimento=" + dataNascimento + ", nomeMae=" + nomeMae + ", nomePai=" + nomePai + "]";
	}

	@Override
	public boolean autenticar(String login, String senha) {
		return login.equals("admin") && senha.equals("admin");
	}

	@Override
	public double salario() {
		// TODO Auto-generated method stub
		return 1900.90 * 0.1;
	}
}
