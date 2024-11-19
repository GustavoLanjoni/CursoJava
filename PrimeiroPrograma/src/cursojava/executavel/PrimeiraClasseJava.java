package cursojava.executavel;

import javax.swing.JOptionPane;
import cursojava.classe.Aluno;
import cursojava.classe.Disciplina;
import java.util.ArrayList;

public class PrimeiraClasseJava {

    public static void main(String[] args) {
        // Coletando dados do aluno
        String nome = JOptionPane.showInputDialog("Qual o nome do aluno?");
        String idade = JOptionPane.showInputDialog("Qual sua idade, " + nome + "?");

        Aluno aluno1 = new Aluno();
        aluno1.setNome(nome);

        try {
            aluno1.setIdade(Integer.parseInt(idade));
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Idade inválida! Será atribuída a idade padrão de 0.");
            aluno1.setIdade(0);
        }

        // Adicionando disciplinas e notas ao aluno
        ArrayList<Disciplina> disciplinas = new ArrayList<>();
        for (int pos = 1; pos <= 4; pos++) {
            String nomeDisciplina = JOptionPane.showInputDialog("Nome da Disciplina " + pos + "?");
            String notaDisciplina = JOptionPane.showInputDialog("Nota da Disciplina " + pos + "?");

            Disciplina disciplina = new Disciplina();
            disciplina.setDisciplina(nomeDisciplina);

            try {
                double nota = Double.parseDouble(notaDisciplina);
                disciplina.setNota(nota);
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Nota inválida! Será atribuída a nota 0.");
                disciplina.setNota(0.0);
            }

            disciplinas.add(disciplina);
        }

        aluno1.setDisciplinas(disciplinas);

        // Opção para remover disciplinas
        int escolha = JOptionPane.showConfirmDialog(null, "Deseja remover alguma disciplina?");
        if (escolha == JOptionPane.YES_OPTION) {
            int continuarRemover = JOptionPane.YES_OPTION;
            while (continuarRemover == JOptionPane.YES_OPTION) {
                String disciplinaRemover = JOptionPane.showInputDialog("Qual a disciplina deseja remover?");
                Disciplina encontrada = null;

                for (Disciplina d : aluno1.getDisciplinas()) {
                    if (d.getDisciplina().equalsIgnoreCase(disciplinaRemover)) {
                        encontrada = d;
                        break;
                    }
                }

                if (encontrada != null) {
                    aluno1.getDisciplinas().remove(encontrada);
                    JOptionPane.showMessageDialog(null, "Disciplina " + disciplinaRemover + " removida!");
                } else {
                    JOptionPane.showMessageDialog(null, "Disciplina não encontrada!");
                }

                continuarRemover = JOptionPane.showConfirmDialog(null, "Deseja remover outra disciplina?");
            }
        }

        // Exibindo informações do aluno
        JOptionPane.showMessageDialog(null, aluno1.toString());
        JOptionPane.showMessageDialog(null, "Média do Aluno = " + aluno1.getMediaNota());
        JOptionPane.showMessageDialog(null, "Resultado = " + aluno1.getAlunoAprovado());
    }
}
