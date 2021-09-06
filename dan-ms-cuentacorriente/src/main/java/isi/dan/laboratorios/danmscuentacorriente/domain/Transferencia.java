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
}