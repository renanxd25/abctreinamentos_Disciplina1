package unidade2;

import java.util.Scanner;

public class Estruturasderepeticao {
	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		System.out.println("Digite o Valor");
		int valor = scn.nextInt();
		int cont = 0;
		int inc = 0;
		double media = cont/inc;
		
		while(valor != -1) {
			cont = cont + valor;
			inc++;
			System.out.println("Digite o Valor");
			valor = scn.nextInt();
		}
		System.out.println("A media entre os numeros é igual a: " + media);
	}
}
