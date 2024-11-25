package cursojava.classe;

public abstract class Pessoa {

	protected String nome;
	protected int idade;
	protected String registoGeral;
	protected String numeroCpf;
	protected String dataNascimento;
	protected String nomeMae;
	protected String nomePai;
	
	//Metodo abstado é que fica na classe ai e obrigatorio para as classes filhas
	public abstract double salario();
	
	
	
	
	//Getters e Setters
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public String getRegistoGeral() {
		return registoGeral;
	}
	public void setRegistoGeral(String registoGeral) {
		this.registoGeral = registoGeral;
	}
	public String getNumeroCpf() {
		return numeroCpf;
	}
	public void setNumeroCpf(String numeroCpf) {
		this.numeroCpf = numeroCpf;
	}
	public String getDataNascimento() {
		return dataNascimento;
	}
	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	public String getNomeMae() {
		return nomeMae;
	}
	public void setNomeMae(String nomeMae) {
		this.nomeMae = nomeMae;
	}
	public String getNomePai() {
		return nomePai;
	}
	public void setNomePai(String nomePai) {
		this.nomePai = nomePai;
	}
	
	//Retorna treu caso seja veerdadeiro se não false
	public boolean pessoaMaiorIdade() {
		return idade >=  18;
	}
	
	
}
