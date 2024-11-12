package cursojava.executavel;

import javax.swing.JOptionPane;

import cursojava.classe.Aluno;

public class PrimeiraClasseJava {

	public static void main(String[] args) {

		/* New Aluno() é uma instacia (Criação de objeto) */
		/* Aluno1 é uma referencia para o objeto aluno */

		String nome = JOptionPane.showInputDialog("Qual nome do aluno?");
		String idade = JOptionPane.showInputDialog("Qual sua idade " + nome);
		String dataNascimento = JOptionPane.showInputDialog("Data de nascimento " + nome);
		String rg = JOptionPane.showInputDialog("Qual seu RG?" + nome);
		String cpf = JOptionPane.showInputDialog("Qual seu CPF?" + nome);
		String nomeMae = JOptionPane.showInputDialog("Qual nome da sua Mãe? " + nome);
		String nomePai = JOptionPane.showInputDialog("Qual nome do seu Pai?" + nome);
		String escola = JOptionPane.showInputDialog("Onde vocês estudou?" + nome);
		String dataMatricula = JOptionPane.showInputDialog("Data de matricula " + nome);

		String disciplina1 = JOptionPane.showInputDialog("Qual é a Discilina1?" + nome);
		String nota1 = JOptionPane.showInputDialog("Qual nota1 " + nome);
		
		String disciplina2 = JOptionPane.showInputDialog("Qual é a Discilina2?" + nome);
		String nota2 = JOptionPane.showInputDialog("Qual a nota2 " + nome);
		
		String disciplina3 = JOptionPane.showInputDialog("Qual é a Discilina3?" + nome);
		String nota3 = JOptionPane.showInputDialog("Qual a nota3 " + nome);
		
		String disciplina4 = JOptionPane.showInputDialog("Qual é a Discilina4?" + nome);
		String nota4 = JOptionPane.showInputDialog("Qual a nota4 " + nome);

		Aluno aluno1 = new Aluno();

		aluno1.setNome(nome);
		aluno1.setIdade(Integer.valueOf(idade));
		aluno1.setDataNascimento(dataNascimento);
		aluno1.setRegistoGeral(rg);
		aluno1.setNumeroCpf(cpf);
		aluno1.setNomeMae(nomeMae);
		aluno1.setNomePai(nomePai);
		aluno1.setEscola(escola);
		aluno1.setDataMatricula(dataMatricula);

	
		aluno1.getDisciplina().setNota1(Double.parseDouble(nota1));
		aluno1.getDisciplina().setNota2(Double.parseDouble(nota2));
		aluno1.getDisciplina().setNota3(Double.parseDouble(nota3));
		aluno1.getDisciplina().setNota4(Double.parseDouble(nota4));
		
		aluno1.getDisciplina().setDisciplina1(disciplina1);
		aluno1.getDisciplina().setDisciplina2(disciplina2);
		aluno1.getDisciplina().setDisciplina3(disciplina3);
		aluno1.getDisciplina().setDisciplina4(disciplina4);

		
		System.out.println(aluno1.toString());/*Descrição do objeto na memoria*/
		
		System.out.println("Media do Aluno = " + aluno1.getMediaNota());
		System.out.println("Resultado = " + aluno1.getAlunoAprovado());
		
		
		
		
	}
}
