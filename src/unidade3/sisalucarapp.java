package unidade3;

import java.time.LocalDate;



public class sisalucarapp {
	static int totalCarros = 0;
	public static void main(String[] args) {
		carro car1;
		cliente clien1;
		
		car1 = new carro(0, null, null, null, 0, null, 0);
		//car2 = new carro();
		
		clien1 = new cliente(0, null, null, null);
		//clien2 = new cliente();
		
		car1.modelo = "fusca";
		car1.ano = 1979;
		car1.cor = "Azul";
		car1.fabricante = "Wolksvagem";
		car1.idCarro = 103;
		car1.placa = "HPD-1538";
		car1.valorDiaria = 100;
	    totalCarros = totalCarros + 1;
		
		
		clien1.cnh = "083749234";
		clien1.cpf = "05175028367";
		clien1.nome = "Renan Mendes";
		clien1.idCliente = 241;
		
		
	}
	public void realizarLocacao(long idCarro, long idCliente) {
		locacao locacao1 = new locacao(12345, 57392, 958762, 503, null, null);
		locacao1.idCarro = idCarro;
		locacao1.idCliente = idCliente;
		locacao1.idLocacao = 1;
		locacao1.dataInicio = LocalDate.now();
		locacao1.dataFim = LocalDate.now().plusDays(2);
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
