package cursojava.executavel;

import javax.swing.JOptionPane;
import cursojava.classe.Aluno;
import cursojava.classe.Disciplina;
import java.util.ArrayList;

public class PrimeiraClasseJava {

    public static void main(String[] args) {

        // Coletando dados do aluno
        String nome = JOptionPane.showInputDialog("Qual nome do aluno?");
        String idade = JOptionPane.showInputDialog("Qual sua idade " + nome);
        String dataNascimento = JOptionPane.showInputDialog("Data de nascimento " + nome);
        String rg = JOptionPane.showInputDialog("Qual seu RG?" + nome);
        String cpf = JOptionPane.showInputDialog("Qual seu CPF?" + nome);
        String nomeMae = JOptionPane.showInputDialog("Qual nome da sua Mãe? " + nome);
        String nomePai = JOptionPane.showInputDialog("Qual nome do seu Pai?" + nome);
        String escola = JOptionPane.showInputDialog("Onde você estudou?" + nome);
        String dataMatricula = JOptionPane.showInputDialog("Data de matrícula " + nome);

        // Criando um objeto aluno e definindo os atributos
        Aluno aluno1 = new Aluno();
        aluno1.setNome(nome);
        aluno1.setIdade(Integer.parseInt(idade));
        aluno1.setDataNascimento(dataNascimento);
        aluno1.setRegistoGeral(rg);
        aluno1.setNumeroCpf(cpf);
        aluno1.setNomeMae(nomeMae);
        aluno1.setNomePai(nomePai);
        aluno1.setEscola(escola);
        aluno1.setDataMatricula(dataMatricula);

        // Adicionando disciplinas e notas ao aluno
        ArrayList<Disciplina> disciplinas = new ArrayList<>();

       for (int pos = 1; pos <= 4; pos++) {
    	   String nomeDisciplina = JOptionPane.showInputDialog("Nome da Disciplina "+pos+" ?");
    	   String notaDisciplina = JOptionPane.showInputDialog("Nota da Disciplina? "+pos+"");
    	   
    	   
    	   Disciplina disciplina = new Disciplina();
    	   disciplina.setDisciplina(notaDisciplina);
    	   disciplina.setNota(Double.valueOf(notaDisciplina));
    	   
    	   aluno1.getDisciplinas().add(disciplina);
       }
        
        aluno1.setDisciplinas(disciplinas);

        
        int escolha = JOptionPane.showConfirmDialog(null, "Deseja remover alguma disciplina ?");
        if (escolha == 0) {
        	String diciplinaRemover = JOptionPane.showInputDialog("Qula a disciplina  ? " );
        	aluno1.getDisciplinas().remove(Integer.valueOf(diciplinaRemover).intValue()- 1);
        }
        
        // Exibindo informações do aluno
        System.out.println(aluno1.toString());
        System.out.println("Média do Aluno = " + aluno1.getMediaNota());
        System.out.println("Resultado = " + aluno1.getAlunoAprovado());
    }
}
