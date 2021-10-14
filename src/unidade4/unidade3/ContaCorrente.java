package unidade4.unidade3;

public class ContaCorrente extends conta {
	public void atualiza(double taxa) {
		super.saldo = super.saldo + super.saldo*taxa*2;
	}

}
