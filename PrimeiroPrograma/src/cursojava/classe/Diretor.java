package cursojava.classe;

public class Diretor extends Pessoa {

	private String RegistroEducação;
	private int TempoDireção;
	private String Titulação;
	
	
	
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
	
	
	

}
