package isi.dan.laboratorios.danmscuentacorriente.domain;

import java.time.Instant;
import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@PrimaryKeyJoinColumn(name = "id")
public class Cheque extends MedioPago {
	private Integer nroCheque;
	private Date fechaCobro;
	private String banco;
	public Integer getNroCheque() {
		return nroCheque;
	}
	public String getBanco() {
		return banco;
	}
	public void setBanco(String banco) {
		this.banco = banco;
	}
	public Date getFechaCobro() {
		return fechaCobro;
	}
	public void setFechaCobro(Date fechaCobro) {
		this.fechaCobro = fechaCobro;
	}
	public void setNroCheque(Integer nroCheque) {
		this.nroCheque = nroCheque;
	}
}