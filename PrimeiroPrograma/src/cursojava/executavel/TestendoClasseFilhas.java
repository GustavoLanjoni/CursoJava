package cursojava.executavel;

import cursojava.classe.Aluno;
import cursojava.classe.Diretor;
import cursojava.classe.Pessoa;
import cursojava.classe.Secretario;

public class TestendoClasseFilhas {

	public static void main(String[] args) {
		
		Aluno aluno = new Aluno();
		aluno.setNome("Gustavo - JDV treinamento");
		aluno.setEscola("JDEV");
		aluno.setIdade(16);
		
		Diretor diretor = new Diretor();
		diretor.setNome("Milena");
		diretor.setRegistoGeral("asd");
		diretor.setIdade(50);

		Secretario secretario = new Secretario();
		secretario.setNome("Vava");
		secretario.setExperiencia("programação");
		secretario.setIdade(28);
		secretario.setNome("Jaja");
		
		
		aluno.pessoaMaiorIdade();
		diretor.pessoaMaiorIdade();
		secretario.pessoaMaiorIdade();
		
		System.out.println(aluno + " - " + aluno.MsgMaiorIdade());
		System.out.println(diretor);
		System.out.println(secretario);
		
		System.out.println("Salario Aluno e = " + aluno.salario());
		System.out.println("Salario  Diretor e = " + diretor.salario());
		System.out.println("Salario Secretario e = " + secretario.salario());
		
		teste(aluno);
		teste(diretor);
		teste(secretario);
		
		
		Pessoa pessoa = new Aluno();
		
		pessoa = secretario;
	}
	
	public static void teste(Pessoa pessoa) {
		System.out.println("Essa pessoa e demais = " + pessoa.getNome() + "O salario e de " 
		+ pessoa.salario());
	}
	
}
