package isi.dan.laboratorios.danmscuentacorriente.dtos.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PagoClienteResponseDTO {
    private Date fechaPago;
    private Double monto;
}
