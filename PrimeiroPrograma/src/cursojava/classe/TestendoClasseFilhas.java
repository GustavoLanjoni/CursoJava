package cursojava.classe;

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
		
		System.out.println(aluno + " - " + aluno.MsgMaiorIdade());
		System.out.println(diretor);
		System.out.println(secretario);
		
		
		aluno.pessoaMaiorIdade();
		diretor.pessoaMaiorIdade();
		secretario.pessoaMaiorIdade();
		
	}

	
}
