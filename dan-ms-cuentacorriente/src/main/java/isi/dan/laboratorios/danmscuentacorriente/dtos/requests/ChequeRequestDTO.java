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
public class ChequeRequestDTO extends MedioPagoRequestDTO{
    private Integer nroCheque;

    @JsonSerialize(using = DateSerializer.class)
    @JsonFormat(pattern="dd-MM-yyyy")
    private Date fechaCobro;

    private String banco;

    public Integer getNroCheque() {
        return nroCheque;
    }

    public String getBanco() {
        return banco;
    }

    public void setBanco(String banco) {
        this.banco = banco;
    }

    public void setNroCheque(Integer nroCheque) {
        this.nroCheque = nroCheque;
    }

    public Date getFechaCobro() {
        return fechaCobro;
    }

    public void setFechaCobro(Date fechaCobro) {
        this.fechaCobro = fechaCobro;
    }
}
