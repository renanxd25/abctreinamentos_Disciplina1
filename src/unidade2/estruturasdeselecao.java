package unidade2;

import javax.swing.JOptionPane;

public class estruturasdeselecao {
	public static void main(String[] args) {
		int nota = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero "));
		
		if(nota >= 0 && nota <= 50) {
			System.out.print("Insuficiente");
		}else if(nota > 50 && nota <= 70) {
			System.out.print("Regular");
		}else if(nota > 70 && nota <=90) {
			System.out.print("Bom");
		}else {
			System.out.print("Excelente");
		}
	}

}
