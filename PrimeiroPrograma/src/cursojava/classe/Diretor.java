package cursojava.classe;

import cursojava.interfaces.PermitirAcesso;

public class Diretor extends Pessoa implements PermitirAcesso {

	private String RegistroEducação;
	private int TempoDireção;
	private String Titulação;
	
	private String login;
	private String senha;
	
	public Diretor (String login, String senha) {
		this.senha = senha;
		this.login = login;
	}
	
	public Diretor() {
	}

	
	//Gertters e Setters
	public String getRegistroEducação() {
		return RegistroEducação;
	}
	public void setRegistroEducação(String registroEducação) {
		RegistroEducação = registroEducação;
	}
	public int getTempoDireção() {
		return TempoDireção;
	}
	public void setTempoDireção(int tempoDireção) {
		TempoDireção = tempoDireção;
	}
	public String getTitulação() {
		return Titulação;
	}
	public void setTitulação(String titulação) {
		Titulação = titulação;
	}
	
	//toString
	@Override
	public String toString() {
		return "Diretor [RegistroEducação=" + RegistroEducação + ", TempoDireção=" + TempoDireção + ", Titulação="
				+ Titulação + ", nome=" + nome + ", idade=" + idade + ", registoGeral=" + registoGeral + ", numeroCpf="
				+ numeroCpf + ", dataNascimento=" + dataNascimento + ", nomeMae=" + nomeMae + ", nomePai=" + nomePai
				+ "]";
	}
	@Override
	public double salario() {
		// TODO Auto-generated method stub
		return 3000.0;
	}
	
	
	@Override
	public boolean autenticar() {
		// TODO Auto-generated method stub
		return login.equals("admin") && senha.equals("admin");
	}


	@Override
	public boolean autenticarCursoJava(PermitirAcesso permitirAcesso) {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public boolean autenticar(String login, String senha) {
		// TODO Auto-generated method stub
		return false;
	}

}
