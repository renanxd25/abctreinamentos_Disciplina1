package unidade4.unidade3;

public class Moto extends Veiculo {
	public int getPassageiros() {
		return 1;
	}
	public void acelera(int limiteVelocidade) {
		System.out.print("Obedeça o limite de Velocidade que é:" + limiteVelocidade);
	}

}
