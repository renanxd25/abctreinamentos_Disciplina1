package unidade4.unidade3;

import java.time.LocalDate;

public class locacao {
	private long idLocacao;
	private long idCarro;
	private long idCliente;
	private float valorLocado;
	private LocalDate dataInicio;
	private LocalDate dataFim;
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
		public long getIdLocacao() {
			return idLocacao;
		}
		public void setIdLocacao(long idLocacao) {
			this.idLocacao = idLocacao;
		}
		public long getIdCarro() {
			return idCarro;
		}
		public void setIdCarro(long idCarro) {
			this.idCarro = idCarro;
		}
		public long getIdCliente() {
			return idCliente;
		}
		public void setIdCliente(long idCliente) {
			this.idCliente = idCliente;
		}
		public float getValorLocado() {
			return valorLocado;
		}
		public void setValorLocado(float valorLocado) {
			this.valorLocado = valorLocado;
		}
		public LocalDate getDataInicio() {
			return dataInicio;
		}
		public void setDataInicio(LocalDate dataInicio) {
			this.dataInicio = dataInicio;
		}
		public LocalDate getDataFim() {
			return dataFim;
		}
		public void setDataFim(LocalDate dataFim) {
			this.dataFim = dataFim;
		}
		
		
}
