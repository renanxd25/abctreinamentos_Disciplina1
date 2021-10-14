package unidade3;

public class carro {
		
		long idCarro;
		String placa;
		String fabricante;
		String modelo;
		int ano;
		String cor;
		float valorDiaria;
		Revendedor revendedor;
		public carro(long idCarro, String placa, String fabricante, String modelo, int ano, String cor,
				float valorDiaria, Revendedor revendedor) {
			super();
			this.idCarro = idCarro;
			this.placa = placa;
			this.fabricante = fabricante;
			this.modelo = modelo;
			this.ano = ano;
			this.cor = cor;
			this.valorDiaria = valorDiaria;
			this.revendedor = revendedor;
		}
		
		public static void main(String[] args) {
			carro carro1 = new carro(1, "ABC-2001", "Volks", "Gol", 2013, "azul", 99.90f, Revendedor.ABCVEICULOS 
					);
		}
	

}
