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

        String disciplinaNome1 = JOptionPane.showInputDialog("Qual é a Disciplina1?" + nome);
        String nota1 = JOptionPane.showInputDialog("Qual nota1 " + nome);
        Disciplina disciplina1 = new Disciplina();
        disciplina1.setDisciplina(disciplinaNome1);
        disciplina1.setNota(Double.parseDouble(nota1));
        disciplinas.add(disciplina1);

        String disciplinaNome2 = JOptionPane.showInputDialog("Qual é a Disciplina2?" + nome);
        String nota2 = JOptionPane.showInputDialog("Qual a nota2 " + nome);
        Disciplina disciplina2 = new Disciplina();
        disciplina2.setDisciplina(disciplinaNome2);
        disciplina2.setNota(Double.parseDouble(nota2));
        disciplinas.add(disciplina2);

        String disciplinaNome3 = JOptionPane.showInputDialog("Qual é a Disciplina3?" + nome);
        String nota3 = JOptionPane.showInputDialog("Qual a nota3 " + nome);
        Disciplina disciplina3 = new Disciplina();
        disciplina3.setDisciplina(disciplinaNome3);
        disciplina3.setNota(Double.parseDouble(nota3));
        disciplinas.add(disciplina3);

        String disciplinaNome4 = JOptionPane.showInputDialog("Qual é a Disciplina4?" + nome);
        String nota4 = JOptionPane.showInputDialog("Qual a nota4 " + nome);
        Disciplina disciplina4 = new Disciplina();
        disciplina4.setDisciplina(disciplinaNome4);
        disciplina4.setNota(Double.parseDouble(nota4));
        disciplinas.add(disciplina4);

        aluno1.setDisciplinas(disciplinas);

        // Exibindo informações do aluno
        System.out.println(aluno1.toString());
        System.out.println("Média do Aluno = " + aluno1.getMediaNota());
        System.out.println("Resultado = " + aluno1.getAlunoAprovado());
    }
}
