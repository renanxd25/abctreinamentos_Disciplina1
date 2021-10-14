package unidade4.unidade3;

public class carro extends Veiculo {
		
		 private long idCarro;
		 private String placa;
		 private String fabricante;
		 private String modelo;
		 private int ano;
		 private String cor;
		 private float valorDiaria;
		 private Revendedor revendedor;
		 
		 
		 
		public long getIdCarro() {
			return idCarro;
		}

		public void setIdCarro(long idCarro) {
			this.idCarro = idCarro;
		}

		public String getPlaca() {
			return placa;
		}

		public void setPlaca(String placa) {
			this.placa = placa;
		}

		public String getFabricante() {
			return fabricante;
		}

		public void setFabricante(String fabricante) {
			this.fabricante = fabricante;
		}

		public String getModelo() {
			return modelo;
		}

		void setModelo(String modelo) {
			this.modelo = modelo;
		}

		public int getAno() {
			return ano;
		}

		public void setAno(int ano) {
			this.ano = ano;
		}

		public String getCor() {
			return cor;
		}

		public void setCor(String cor) {
			this.cor = cor;
		}

		public float getValorDiaria() {
			return valorDiaria;
		}

		public void setValorDiaria(float valorDiaria) {
			this.valorDiaria = valorDiaria;
		}

		public Revendedor getRevendedor() {
			return revendedor;
		}

		public void setRevendedor(Revendedor revendedor) {
			this.revendedor = revendedor;
		}

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
			carro carro1 = new carro(1, "ABC-2001", "Volks", "Gol", 2013, "azul", 99.90f, Revendedor.ABCVEICULOS );
			carro1.acelera();
			carro1.freia();
			carro1.getVelocidade();
			carro1.passageiro();
		}
		public int getPassageiros() {
			return 4;
		}
		public void acelera(int limiteVelocidade) {
			System.out.print("Obedeça o limite de Velocidade que é:" + limiteVelocidade);
		}
		
	

}
