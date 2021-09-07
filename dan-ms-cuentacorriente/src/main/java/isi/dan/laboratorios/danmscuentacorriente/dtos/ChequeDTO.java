package isi.dan.laboratorios.danmscuentacorriente.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ChequeDTO extends MedioPagoDTO {
    private Integer nroCheque;
    private Date fechaCobro;
    private String banco;
}