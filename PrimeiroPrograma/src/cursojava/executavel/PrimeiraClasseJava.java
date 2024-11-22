package cursojava.executavel;

import javax.swing.JOptionPane;
import cursojava.classe.Aluno;
import cursojava.classe.Disciplina;
import java.util.ArrayList;
import java.util.Dictionary;
import java.util.Iterator;
import java.util.List;

public class PrimeiraClasseJava {

	public static void main(String[] args) {

		List<Aluno> alunos = new ArrayList<Aluno>();
		for (int qtd = 1; qtd <= 2; qtd++) {

			// Coletando dados do aluno
			String nome = JOptionPane.showInputDialog("Qual nome do aluno " + qtd + "  ?");
			String idade = JOptionPane.showInputDialog("Qual sua idade " + nome);
			/*
			 * String dataNascimento = JOptionPane.showInputDialog("Data de nascimento " +
			 * nome); String rg = JOptionPane.showInputDialog("Qual seu RG?" + nome); String
			 * cpf = JOptionPane.showInputDialog("Qual seu CPF?" + nome); String nomeMae =
			 * JOptionPane.showInputDialog("Qual nome da sua Mãe? " + nome); String nomePai
			 * = JOptionPane.showInputDialog("Qual nome do seu Pai?" + nome); String escola
			 * = JOptionPane.showInputDialog("Onde você estudou?" + nome); String
			 * dataMatricula = JOptionPane.showInputDialog("Data de matrícula " + nome);
			 */

			// Criando um objeto aluno e definindo os atributos
			Aluno aluno1 = new Aluno();
			aluno1.setNome(nome);
			aluno1.setIdade(Integer.parseInt(idade));
			/*
			 * aluno1.setDataNascimento(dataNascimento); aluno1.setRegistoGeral(rg);
			 * aluno1.setNumeroCpf(cpf); aluno1.setNomeMae(nomeMae);
			 * aluno1.setNomePai(nomePai); aluno1.setEscola(escola);
			 * aluno1.setDataMatricula(dataMatricula);
			 */

			// Adicionando disciplinas e notas ao aluno
			ArrayList<Disciplina> disciplinas = new ArrayList<>();

			for (int pos = 1; pos <= 1; pos++) {
				String nomeDisciplina = JOptionPane.showInputDialog("Nome da Disciplina " + pos + " ?");
				String notaDisciplina = JOptionPane.showInputDialog("Nota da Disciplina? " + pos + "");

				Disciplina disciplina = new Disciplina();
				disciplina.setDisciplina(notaDisciplina);
				disciplina.setNota(Double.valueOf(notaDisciplina));

				aluno1.getDisciplinas().add(disciplina);
			}

			aluno1.setDisciplinas(disciplinas);

			int escolha = JOptionPane.showConfirmDialog(null, "Deseja remover alguma disciplina ?");
			if (escolha == 0) {

				int continuarRemover = 0;
				int posicao = 1;
				while (continuarRemover == 0) {

					String diciplinaRemover = JOptionPane.showInputDialog("Qula a disciplina  ? ");
					posicao++;
					aluno1.getDisciplinas().remove(Integer.valueOf(diciplinaRemover).intValue() - 1);

					continuarRemover = JOptionPane.showConfirmDialog(null, "Continuar a remver? " + nome);

				}
			}

			alunos.add(aluno1);

		}
		for (int pos = 0; pos < alunos.size(); pos ++) {
			Aluno aluno = alunos.get(pos);
			
		if(aluno.getNome().equals("Gustavo")) {
			Aluno trocar = new Aluno();
			trocar.setNome("Aluno foi trocado");
			
			Disciplina disciplina = new Disciplina();
			disciplina.setDisciplina("Filosofia");
			disciplina.setNota(96);
			
			trocar.getDisciplinas().add(disciplina);	
			
			alunos.set(pos, trocar);
			aluno = alunos.get(pos);
			
		}
			
			System.out.println("Aluno = " + aluno.getNome());
			System.out.println("Média do aluno = " + aluno.getMediaNota());
			System.out.println("Resultado = " + aluno.getAlunoAprovado());
			System.out.println("-----------------------------------------------");
			
		}
		
		
	
	}
}
