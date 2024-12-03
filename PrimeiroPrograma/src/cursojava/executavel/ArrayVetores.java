package cursojava.executavel;

import javax.swing.JOptionPane;

import cursojava.classe.Aluno;
import cursojava.classe.Disciplina;

public class ArrayVetores {

	public static void main(String[] args) {
		
		double[] notas = {8.8, 9.10, 5.5, 10};
		double[] notaLogica = {10.8, 5.10, 1.5, 10};

		//Criação dos alunos 
		Aluno aluno = new Aluno();
		aluno.setNome("Gustavo");
		aluno.setEscola("JDEV Treinamento");
		aluno.setIdade(19);
		
		//Criação das disciplinas
		Disciplina disciplina = new Disciplina();
		disciplina.setDisciplina("Curso de java");
		disciplina.setNota(notas);
		
		aluno.getDisciplinas().add(disciplina);
		
		Disciplina disciplina2 = new Disciplina();
		disciplina2.setDisciplina("Logica de Programação");
		disciplina2.setNota(notaLogica);
		
		aluno.getDisciplinas().add(disciplina2);
		
		
		System.out.println("Nome do aluno " + aluno.getNome() + " Cusando o curso " + aluno.getEscola()); 
		for (Disciplina disc : aluno.getDisciplinas()) {
			System.out.println("-----------Disciplina do aluno---------");
			System.out.println("Disciplina " + disc.getDisciplina());
			System.out.println("As notas são");
			
			for(int pos = 0 ; pos < disc.getNota().length; pos ++) {
				System.out.println("Nota " + pos + " e igual " + disc.getNota()[pos]);
			}
		}
		
	}
	
}
