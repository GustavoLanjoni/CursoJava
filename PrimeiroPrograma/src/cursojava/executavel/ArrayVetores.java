package cursojava.executavel;

import javax.swing.JOptionPane;

public class ArrayVetores {

	public static void main(String[] args) {
		
		//Array pode ser todos tipos  de dados e objetos também
		
		
		String posicoes = JOptionPane.showInputDialog("Quantas posições o Array deve ter?");
		
		
		
		
		//Array sempre dever ter a quantdade de posições definida
		double notas[] = new double[Integer.parseInt(posicoes)];
		
		for(int pos = 0; pos <notas.length; pos++) {
			String valor = JOptionPane.showInputDialog("Qual o valor da posição " + pos);
			notas[pos] = Double.valueOf(valor);
		}
		
		for (int pos = 0; pos <notas.length; pos++) {
			System.out.println("Nota " + (pos + 1) + " é " + notas[pos]);
		}
		
	}
	
}
