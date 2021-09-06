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
public class Pago {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	@OneToOne
	private Cliente cliente;

	private Instant fechaPago;

	@OneToOne
	private MedioPago medio;
}