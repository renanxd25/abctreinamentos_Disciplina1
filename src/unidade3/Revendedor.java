package unidade3;

public enum Revendedor {
	
	ABCVEICULOS("101010/10", "Rua das Perdizes, 1500", "Wolkswagen"),
	SIMAOVEICULOS("101010/10", "Rua das Perdizes, 1500", "Wolkswagen"),
	EMANUELVEICULOS("101010/10", "Rua das Perdizes, 1500", "Wolkswagen");
	
	String cnpj;
	String endereco;
	String fabricante;
	
	Revendedor(String cnpj, String endereco, String fabricante) {
		this.cnpj = cnpj;
		this.endereco = endereco;
		this.fabricante = fabricante;
	}


}
