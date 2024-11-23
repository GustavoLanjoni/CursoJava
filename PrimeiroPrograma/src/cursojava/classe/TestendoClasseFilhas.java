package cursojava.classe;

public class TestendoClasseFilhas {

	public static void main(String[] args) {
		
		Aluno aluno = new Aluno();
		aluno.setNome("Gustavo - JDV treinamento");
		aluno.setEscola("JDEV");
		
		Diretor diretor = new Diretor();
		diretor.setNome("Milena");
		diretor.setRegistoGeral("asd");

		Secretario secretario = new Secretario();
		secretario.setNome("Vava");
		secretario.setExperiencia("programação");
		
		System.out.println(aluno);
		System.out.println(diretor);
		System.out.println(secretario);
	}

	
}
