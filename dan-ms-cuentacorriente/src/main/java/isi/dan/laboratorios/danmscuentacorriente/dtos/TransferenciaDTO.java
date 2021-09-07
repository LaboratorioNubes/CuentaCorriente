package isi.dan.laboratorios.danmscuentacorriente.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TransferenciaDTO extends MedioPagoDTO{
    private String cbuOrigen;
    private String cbuDestino;
    private Long codigoTransferencia;
}
