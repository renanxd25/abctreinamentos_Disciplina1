package unidade3;

import java.time.LocalDate;

public class locacao {
		long idLocacao;
		long idCarro;
		long idCliente;
		float valorLocado;
		LocalDate dataInicio;
		LocalDate dataFim;
		public locacao(long idLocacao, long idCarro, long idCliente, float valorLocado, LocalDate dataInicio,
				LocalDate dataFim) {
			super();
			this.idLocacao = idLocacao;
			this.idCarro = idCarro;
			this.idCliente = idCliente;
			this.valorLocado = valorLocado;
			this.dataInicio = dataInicio;
			this.dataFim = dataFim;
		}
		
		
}
