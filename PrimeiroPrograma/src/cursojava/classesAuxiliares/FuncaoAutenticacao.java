package cursojava.classesAuxiliares;

import cursojava.classe.Secretario;
import cursojava.interfaces.PermitirAcesso;

//Realmete e somente receber alguem que tenho o contrato da interface de PermitirAcesso e chmar o autenticar
public class FuncaoAutenticacao {
	
	private PermitirAcesso permitirAcesso;
	
	public boolean autenticar() {
		return permitirAcesso.autenticar();
	}
	
	public FuncaoAutenticacao(PermitirAcesso acesso) {
		this.permitirAcesso = permitirAcesso;
	}
}
