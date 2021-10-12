package isi.dan.laboratorios.danmscuentacorriente.dtos.requests;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.ser.std.DateSerializer;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PagoRequestDTO {
    private Integer cliente;

    @JsonSerialize(using = DateSerializer.class)
    @JsonFormat(pattern="dd-MM-yyyy")
    private Date fechaPago;

    private ChequeRequestDTO cheque;
    private EfectivoRequestDTO efectivo;
    private TransferenciaRequestDTO transferencia;

    public Integer getCliente() {
        return cliente;
    }
    public TransferenciaRequestDTO getTransferencia() {
        return transferencia;
    }
    public void setTransferencia(TransferenciaRequestDTO transferencia) {
        this.transferencia = transferencia;
    }
    public EfectivoRequestDTO getEfectivo() {
        return efectivo;
    }
    public void setEfectivo(EfectivoRequestDTO efectivo) {
        this.efectivo = efectivo;
    }
    public ChequeRequestDTO getCheque() {
        return cheque;
    }
    public void setCheque(ChequeRequestDTO cheque) {
        this.cheque = cheque;
    }
    public void setCliente(Integer cliente) {
        this.cliente = cliente;
    }

    public Date getFechaPago() {
        return fechaPago;
    }
    public void setFechaPago(Date fechaPago) {
        this.fechaPago = fechaPago;
    }
}
