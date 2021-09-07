package isi.dan.laboratorios.danmscuentacorriente.dtos.requests;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.ser.std.DateSerializer;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.Instant;
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
}
