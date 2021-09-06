package isi.dan.laboratorios.danmscuentacorriente.domain;

import java.time.Instant;

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
	private Instant fechaCobro;
	private String banco;
}