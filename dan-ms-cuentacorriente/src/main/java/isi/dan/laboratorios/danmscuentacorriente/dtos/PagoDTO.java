package isi.dan.laboratorios.danmscuentacorriente.dtos;

import java.time.Instant;

import isi.dan.laboratorios.danmscuentacorriente.domain.Cliente;
import isi.dan.laboratorios.danmscuentacorriente.domain.MedioPago;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PagoDTO {
	private Integer id;
	private Cliente cliente;
	private Instant fechaPago;
	private MedioPago medio;
}
