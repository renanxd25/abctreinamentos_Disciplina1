package unidade1;

import javax.swing.JOptionPane;

public class HelloWorldApp {

	public static void main(String[] args) {
		double janeiro = Double.parseDouble(JOptionPane.showInputDialog("Quantas vendas em Janeiro? "));
		double fevereiro = Double.parseDouble(JOptionPane.showInputDialog("Quantas vendas em Fevereiro? "));
		double marco = Double.parseDouble(JOptionPane.showInputDialog("Quantas vendas em Março? "));
		double total = janeiro + fevereiro + marco;
		
		System.out.println("O valor total foi: R$"+total);
		JOptionPane.showMessageDialog(null, "O valor total foi: R$"+total);
		
		
		
	}

}
