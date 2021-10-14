package unidade4.unidade3;

public class conta {
	private int numero;
	protected double saldo;
	private double limite;
	private String nome;
	
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	public double getLimite() {
		return limite;
	}
	public void setLimite(double limite) {
		this.limite = limite;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public boolean sacar(double valor) {
		return false;
		
	}
	public void depositar(double valor) {
		
	}
	public void trasfere() {
		
	}
	public void atualiza(double taxa) {
		this.saldo = this.saldo + this.saldo*taxa;
	}

}
