package unidade2;

import javax.swing.JOptionPane;

public class operadoresaritimeticos {
	
	public static void main (String[] args) {
		int valor1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o numero 1"));
		int valor2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o numero 2"));
		int soma = valor1 + valor2;
		int subtracao = valor1 - valor2;
		int multiplicacao = valor1 * valor2;
		int divisao = valor1/valor2;
		
		if(valor1 > valor2 ) {
			System.out.print(" O valor " + valor1 + " é o maior!");
		} else if(valor1 == valor2 ) {
			System.out.print(" Os valores são iguais");
		} else if(valor1<valor2) {
			System.out.print(" O valor " + valor2 + " é o maior");
		}
		
		
		System.out.print("\n A soma foi: " + soma + "\n A Subtração foi: " + subtracao + "\n A multiplicacao foi: " + multiplicacao + "\n A divisão foi: " + divisao);
		
	}
}
