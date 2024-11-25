package cursojava.executavel;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import javax.swing.JOptionPane;

import cursojava.classe.Aluno;
import cursojava.classe.Diretor;
import cursojava.classe.Disciplina;
import cursojava.classesAuxiliares.FuncaoAutenticacao;
import cursojava.constantes.StatusAluno;

public class PrimeiraClasseJava {

	public static void main(String[] args) {

	try {	
		// Validação de usuario e senha
		String login = JOptionPane.showInputDialog("Qual o login?");
		String senha = JOptionPane.showInputDialog("Qual a senha?");

		
		if (new FuncaoAutenticacao(new Diretor(login, senha)).autenticar());//Vou travar o contrato para autorizar somente quem realemte tem o contrato 100% legitimo

		List<Aluno> alunos = new ArrayList<Aluno>();

		// É uma lista que dentro dela temos um chave que identifica uma sequenca de
		// valores também
		HashMap<String, List<Aluno>> maps = new HashMap<String, List<Aluno>>();

		for (int qtd = 1; qtd <= 5; qtd++) {

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

		maps.put(StatusAluno.APROVADO, new ArrayList<Aluno>());
		maps.put(StatusAluno.RECUPERACAO, new ArrayList<Aluno>());
		maps.put(StatusAluno.REPROVADO, new ArrayList<Aluno>());

		for (Aluno aluno : alunos) {// Separei em listas

			if (aluno.getAlunoAprovado().equalsIgnoreCase(StatusAluno.APROVADO)) {
				maps.get(StatusAluno.APROVADO).add(aluno);
			} else if (aluno.getAlunoAprovado().equalsIgnoreCase(StatusAluno.RECUPERACAO)) {
				maps.get(StatusAluno.RECUPERACAO).add(aluno);
			} else {
				maps.get(StatusAluno.REPROVADO).add(aluno);

			}

		}
		System.out.println("------------------Lista dos Aprovados---------------");
		for (Aluno aluno : maps.get(StatusAluno.APROVADO)) {
			System.out.println("Resultado = " + aluno.getAlunoAprovado());
			System.out.println("Com media = " + aluno.getMediaNota());
		}

		System.out.println("------------------Lista de Recuperação ---------------");
		for (Aluno aluno : maps.get(StatusAluno.RECUPERACAO)) {
			System.out.println("Resultado = " + aluno.getAlunoAprovado());
			System.out.println("Com media = " + aluno.getMediaNota());
		}

		System.out.println("------------------Lista dos Reprovados---------------");
		for (Aluno aluno : maps.get(StatusAluno.REPROVADO)) {
			System.out.println("Resultado = " + aluno.getAlunoAprovado());
			System.out.println("Com media = " + aluno.getMediaNota());
		}
	  }catch (Exception e) {
		  e.printStackTrace();//Imprime os erros mo console
		  JOptionPane.showMessageDialog(null, "Erro ao processar notas");
	}
	}
}
