package isi.dan.laboratorios.danmscuentacorriente.domain;

import java.time.Instant;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Pago {

	private Integer id;
	private Cliente cliente;
	private Instant fechaPago;
	private MedioPago medio;
	
}