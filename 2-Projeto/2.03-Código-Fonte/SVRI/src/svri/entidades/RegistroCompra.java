package svri.entidades;

import java.util.Calendar;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name = "registrosCompra")
public class RegistroCompra {
	
	@Id
	@GeneratedValue
	private int idRegistroCompra;
	@DateTimeFormat(pattern="dd/MM/yyyy HH:mm")
	private Calendar dataCompra;
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name = "idCliente")
	private Cliente umCliente;
	private double valor;
	private boolean pagamentoAprovado;
	
	public int getIdCompra() {
		return idRegistroCompra;
	}
	public void setIdCompra(int idCompra) {
		this.idRegistroCompra = idCompra;
	}
	public Calendar getDataCompra() {
		return dataCompra;
	}
	public void setDataCompra(Calendar dataCompra) {
		this.dataCompra = dataCompra;
	}
	public Cliente getUmCliente() {
		return umCliente;
	}
	public void setUmCliente(Cliente umCliente) {
		this.umCliente = umCliente;
	}
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
	public boolean isPagamentoAprovado() {
		return pagamentoAprovado;
	}
	public void setPagamentoAprovado(boolean pagamentoAprovado) {
		this.pagamentoAprovado = pagamentoAprovado;
	}
	
	
}
