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
    public Long getCodigoTransferencia() {
        return codigoTransferencia;
    }
    public String getCbuOrigen() {
        return cbuOrigen;
    }
    public void setCbuOrigen(String cbuOrigen) {
        this.cbuOrigen = cbuOrigen;
    }
    public String getCbuDestino() {
        return cbuDestino;
    }
    public void setCbuDestino(String cbuDestino) {
        this.cbuDestino = cbuDestino;
    }
    public void setCodigoTransferencia(Long codigoTransferencia) {
        this.codigoTransferencia = codigoTransferencia;
    }
}
