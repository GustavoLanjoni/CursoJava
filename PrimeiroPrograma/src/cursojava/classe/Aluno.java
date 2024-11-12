package cursojava.classe;

import java.util.Objects;

import javax.swing.JOptionPane;

public class Aluno {

	/* Esses são os atributos do aluno */
	public String nome;
	public int idade;
	public String registoGeral;
	public String numeroCpf;
	public String dataNascimento;
	public String etinia;
	public String nomeMae;
	public String nomePai;
	public String escola;
	public String dataMatricula;

	private Disciplina disciplina = new Disciplina();

	//Getters e setters
	public void setDisciplina(Disciplina disciplina) {
		this.disciplina = disciplina;
	}
	
	public Disciplina getDisciplina() {
		return disciplina;
	}
	
	

	public Aluno() {/* Cria os dados na memoria - Sendo padrão do Java */
		// TODO Auto-generated constructor stub
	}

	public Aluno(String nomePadrao) {
		nome = nomePadrao;
	}

	public Aluno(String nomePadrao, int idadepadrao) {
		nome = nomePadrao;
		idade = idadepadrao;
	}

	/* Veremos metodos SETTERS e GETTERS do objeto */
	/* SET e para adicionar ou receber dados para os atribuos */
	/* GET e para resgatar ou obter o valor do produto */

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getNome() {
		return nome;
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

	public String getEscola() {
		return escola;
	}

	public void setEscola(String escola) {
		this.escola = escola;
	}

	public String getDataMatricula() {
		return dataMatricula;
	}

	public void setDataMatricula(String dataMatricula) {
		this.dataMatricula = dataMatricula;
	}

	

	/* Calculo das medias */
	/* Metodo que retorna a media do aluno */
	public double getMediaNota() {
		return (disciplina.getNota1() + disciplina.getNota2()+ disciplina.getNota3()
		+ disciplina.getNota4()) / 4;
	}

	/*
	 * Metodo para verificar se o aluno passou ou não usando: Boolean True ou false
	 */

	public String getAlunoAprovado() {
		double media = this.getMediaNota();
		if (media >= 70) {
			return "Aluno aprovado";
		} else {
			return "Aluno reprovado";
		}
	}

	

	

	@Override
	public String toString() {
		return "Aluno [nome=" + nome + ", idade=" + idade + ", registoGeral=" + registoGeral + ", numeroCpf="
				+ numeroCpf + ", dataNascimento=" + dataNascimento + ", etinia=" + etinia + ", nomeMae=" + nomeMae
				+ ", nomePai=" + nomePai + ", escola=" + escola + ", dataMatricula=" + dataMatricula + ", disciplina="
				+ disciplina + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(nome, numeroCpf);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Aluno other = (Aluno) obj;
		return Objects.equals(nome, other.nome) && Objects.equals(numeroCpf, other.numeroCpf);
	}


	
	
	

}
