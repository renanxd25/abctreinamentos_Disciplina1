package unidade2;

import javax.swing.JOptionPane;

public class fatorial {
	public static void main(String[] args) {
		int numeroFat = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero para o fatorial"));
		int numerofinal;
		for(int a = numeroFat; a <= 1 ; a-- ) {
			numerofinal = numeroFat * a; 
			System.out.print(numerofinal);
		}
	}
}
