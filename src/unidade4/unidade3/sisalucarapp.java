package unidade4.unidade3;

import java.time.LocalDate;



public class sisalucarapp {
	static int totalCarros = 0;
	public static void main(String[] args) {
		carro car1;
		cliente clien1;
		
		car1 = new carro(0, null, null, null, 0, null, 0, null);
		//car2 = new carro();
		
		clien1 = new cliente(0, null, null, null);
		//clien2 = new cliente();
		car1.setModelo("fusca");
		car1.setAno(1979);
		car1.setCor("Azul");
		car1.setFabricante("Wolksvagem");
		car1.setIdCarro(103);
		car1.setPlaca("HPD-1538");
		car1.setValorDiaria(100);
	    totalCarros = totalCarros + 1;
		
		
		clien1.setCnh("0837492");
		clien1.setCpf("05175028367");
		clien1.setNome("Renan Mendes");
		clien1.setIdCliente(241);
		
		
	}
	public void realizarLocacao(long idCarro, long idCliente) {
		locacao locacao1 = new locacao(12345, 57392, 958762, 503, null, null);
		locacao1.setIdCarro(idCarro);
		locacao1.setIdCliente(idCliente);
		locacao1.setIdLocacao(1);
		locacao1.setDataInicio(LocalDate.now());
		locacao1.setDataFim(LocalDate.now().plusDays(2));
	}
	public static void gerarRelatorio(LocalDate  ...datas) {
		float totalFaturado = 2 * 99.90f;
	}
	public static void somar(double ...numeros)
	{
	double soma = 0;
	for(double numero: numeros)
	soma = soma + numero;
	System.out.println(soma);
	}

}
