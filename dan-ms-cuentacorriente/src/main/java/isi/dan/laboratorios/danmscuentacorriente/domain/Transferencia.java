package isi.dan.laboratorios.danmscuentacorriente.domain;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public class Transferencia extends MedioPago {
	private String cbuOrigen;
	private String cbuDestino;
	private Long codigoTransferencia;
	public String getCbuOrigen() {
		return cbuOrigen;
	}
	public Long getCodigoTransferencia() {
		return codigoTransferencia;
	}
	public void setCodigoTransferencia(Long codigoTransferencia) {
		this.codigoTransferencia = codigoTransferencia;
	}
	public String getCbuDestino() {
		return cbuDestino;
	}
	public void setCbuDestino(String cbuDestino) {
		this.cbuDestino = cbuDestino;
	}
	public void setCbuOrigen(String cbuOrigen) {
		this.cbuOrigen = cbuOrigen;
	}
}