package cursojava.interfaces;


public interface PermitirAcesso {

	
	public boolean autenticar(String login, String senha);
	
	public boolean autenticar();

	public boolean autenticarCursoJava(PermitirAcesso permitirAcesso);

}
