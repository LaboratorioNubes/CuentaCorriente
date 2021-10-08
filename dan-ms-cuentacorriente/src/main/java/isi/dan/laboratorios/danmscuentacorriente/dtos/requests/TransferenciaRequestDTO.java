package isi.dan.laboratorios.danmscuentacorriente.dtos.requests;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TransferenciaRequestDTO extends MedioPagoRequestDTO{
    private String cbuOrigen;
    private String cbuDestino;
    private Long codigoTransferencia;
}
