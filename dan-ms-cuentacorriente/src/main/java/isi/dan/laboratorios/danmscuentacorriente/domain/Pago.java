package isi.dan.laboratorios.danmscuentacorriente.domain;
import java.util.Date;

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

	private Date fechaPago;

	private Double monto;

	@OneToOne
	private MedioPago medio;
}