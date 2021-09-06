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
public class Efectivo extends MedioPago {
	private Integer nroRecibo;
}