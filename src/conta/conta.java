package conta;

public class conta {
	int numero;
	double saldo;
	double limite;
	String nome;
	
	public boolean sacar(double valor) {
		return false;
		
	}
	public void depositar(double valor) {
		
	}
	public void trasfere(conta destino, double valor) {
		
	}
	public static void main (String[] args) {
		conta conta1 = new conta();
		conta conta2 = new conta();
		
		conta1.trasfere(conta2, 50);
		
	}

}
